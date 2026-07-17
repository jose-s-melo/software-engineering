package dev.langchain4j.internal;

import static dev.langchain4j.internal.ValidationUtils.ensureNotNull;

import dev.langchain4j.Internal;
import dev.langchain4j.model.chat.request.json.JsonAnyOfSchema;
import dev.langchain4j.model.chat.request.json.JsonArraySchema;
import dev.langchain4j.model.chat.request.json.JsonBooleanSchema;
import dev.langchain4j.model.chat.request.json.JsonEnumSchema;
import dev.langchain4j.model.chat.request.json.JsonIntegerSchema;
import dev.langchain4j.model.chat.request.json.JsonNullSchema;
import dev.langchain4j.model.chat.request.json.JsonNumberSchema;
import dev.langchain4j.model.chat.request.json.JsonObjectSchema;
import dev.langchain4j.model.chat.request.json.JsonRawSchema;
import dev.langchain4j.model.chat.request.json.JsonReferenceSchema;
import dev.langchain4j.model.chat.request.json.JsonSchemaElement;
import dev.langchain4j.model.chat.request.json.JsonStringSchema;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Converts between {@link JsonSchemaElement} and JSON Schema {@link Map} representation
 * with round-trip fidelity.
 * <p>
 * Unlike {@link JsonSchemaElementUtils#toMap(JsonSchemaElement)}, which is optimized for
 * LLM provider APIs and intentionally omits fields like {@code additionalProperties} in
 * non-strict mode, this class preserves all fields needed for lossless serialization and
 * deserialization.
 *
 * @see JsonSchemaElementUtils
 */
@Internal
public class JsonSchemaElementJsonUtils {

    private static final String TYPE = "type";
    private static final String DESCRIPTION = "description";
    private static final String ENUM = "enum";
    private static final String ANY_OF = "anyOf";
    private static final String REF = "$ref";
    private static final String PROPERTIES = "properties";
    private static final String REQUIRED = "required";
    private static final String ADDITIONAL_PROPERTIES = "additionalProperties";
    private static final String DEFS = "$defs";
    private static final String ITEMS = "items";

    // Allowed keys per schema type — used by fromMap() to detect extra keywords
    // that cannot be represented by the corresponding JsonSchemaElement subtype.
    // When a map contains keys outside this set, fromMap() falls back to JsonRawSchema.
    // NOTE: When adding new JsonSchemaElement subtypes, update these sets accordingly.
    private static final Set<String> STRING_KEYS = Set.of(TYPE, DESCRIPTION);
    private static final Set<String> INTEGER_KEYS = Set.of(TYPE, DESCRIPTION);
    private static final Set<String> NUMBER_KEYS = Set.of(TYPE, DESCRIPTION);
    private static final Set<String> BOOLEAN_KEYS = Set.of(TYPE, DESCRIPTION);
    private static final Set<String> NULL_KEYS = Set.of(TYPE);
    private static final Set<String> OBJECT_KEYS =
            Set.of(TYPE, DESCRIPTION, PROPERTIES, REQUIRED, ADDITIONAL_PROPERTIES, DEFS);
    private static final Set<String> ARRAY_KEYS = Set.of(TYPE, DESCRIPTION, ITEMS);
    private static final Set<String> ENUM_KEYS = Set.of(TYPE, DESCRIPTION, ENUM);
    private static final Set<String> ANYOF_KEYS = Set.of(ANY_OF, DESCRIPTION);
    private static final Set<String> REF_KEYS = Set.of(REF);

    private JsonSchemaElementJsonUtils() {}

    // ---- toMap: JsonSchemaElement -> Map<String, Object> ----

    /**
     * Converts a {@link JsonSchemaElement} to a standard JSON Schema {@link Map} representation.
     */
    public static Map<String, Object> toMap(JsonSchemaElement element) {
        ensureNotNull(element, "element");

        // Composite types: own implementation (recursive, preserves additionalProperties / null items)
        if (element instanceof JsonObjectSchema obj) return objectSchemaToMap(obj);
        if (element instanceof JsonArraySchema arr) return arraySchemaToMap(arr);
        if (element instanceof JsonAnyOfSchema anyOf) return anyOfSchemaToMap(anyOf);

        // Enum: type + description + enum values
        if (element instanceof JsonEnumSchema en) return enumSchemaToMap(en);

        // Simple typed schemas: type + description
        if (element instanceof JsonStringSchema s) return simpleTypeMap("string", s.description());
        if (element instanceof JsonIntegerSchema i) return simpleTypeMap("integer", i.description());
        if (element instanceof JsonNumberSchema n) return simpleTypeMap("number", n.description());
        if (element instanceof JsonBooleanSchema b) return simpleTypeMap("boolean", b.description());
        if (element instanceof JsonNullSchema) return simpleTypeMap("null", null);

        // Reference
        if (element instanceof JsonReferenceSchema ref) return referenceSchemaToMap(ref);

        // Raw fallback
        if (element instanceof JsonRawSchema raw) {
            @SuppressWarnings("unchecked")
            Map<String, Object> map = Json.fromJson(raw.schema(), Map.class);
            return map;
        }

        throw new IllegalArgumentException("Unknown JsonSchemaElement type: " + element.getClass());
    }

    private static Map<String, Object> simpleTypeMap(String type, String description) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put(TYPE, type);
        if (description != null) {
            map.put(DESCRIPTION, description);
        }
        return map;
    }

    private static Map<String, Object> enumSchemaToMap(JsonEnumSchema en) {
        Map<String, Object> map = simpleTypeMap("string", en.description());
        map.put(ENUM, new ArrayList<>(en.enumValues()));
        return map;
    }

    private static Map<String, Object> referenceSchemaToMap(JsonReferenceSchema ref) {
        Map<String, Object> map = new LinkedHashMap<>();
        if (ref.reference() != null) {
            map.put(REF, "#/$defs/" + ref.reference());
        }
        return map;
    }

    private static Map<String, Object> objectSchemaToMap(JsonObjectSchema obj) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put(TYPE, "object");
        if (obj.description() != null) {
            map.put(DESCRIPTION, obj.description());
        }
        if (obj.properties() != null && !obj.properties().isEmpty()) {
            Map<String, Object> properties = new LinkedHashMap<>();
            obj.properties().forEach((name, schema) -> properties.put(name, toMap(schema)));
            map.put(PROPERTIES, properties);
        }
        if (obj.required() != null && !obj.required().isEmpty()) {
            map.put(REQUIRED, new ArrayList<>(obj.required()));
        }
        if (obj.additionalProperties() != null) {
            map.put(ADDITIONAL_PROPERTIES, obj.additionalProperties());
        }
        if (obj.definitions() != null && !obj.definitions().isEmpty()) {
            Map<String, Object> defs = new LinkedHashMap<>();
            obj.definitions().forEach((name, schema) -> defs.put(name, toMap(schema)));
            map.put(DEFS, defs);
        }
        return map;
    }

    private static Map<String, Object> arraySchemaToMap(JsonArraySchema arr) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put(TYPE, "array");
        if (arr.description() != null) {
            map.put(DESCRIPTION, arr.description());
        }
        if (arr.items() != null) {
            map.put(ITEMS, toMap(arr.items()));
        }
        return map;
    }

    private static Map<String, Object> anyOfSchemaToMap(JsonAnyOfSchema anyOf) {
        Map<String, Object> map = new LinkedHashMap<>();
        if (anyOf.description() != null) {
            map.put(DESCRIPTION, anyOf.description());
        }
        List<Map<String, Object>> schemas = new ArrayList<>(anyOf.anyOf().size());
        anyOf.anyOf().forEach(s -> schemas.add(toMap(s)));
        map.put(ANY_OF, schemas);
        return map;
    }

    // ---- fromMap: Map<String, Object> -> JsonSchemaElement ----

    /**
     * Converts a standard JSON Schema {@link Map} representation back to a {@link JsonSchemaElement}.
     * <p>
     * Only the subset of JSON Schema expressible by {@link JsonSchemaElement} subtypes is supported.
     * When a map contains additional JSON Schema keywords (e.g., {@code format}, {@code pattern},
     * {@code minimum}, schema-valued {@code additionalProperties}) that cannot be represented by
     * the corresponding typed schema, the entire node falls back to {@link JsonRawSchema} to
     * preserve round-trip fidelity. The fallback granularity is per-node: a parent
     * {@link JsonObjectSchema} can still be typed even if a child property falls back to raw.
     *
     * @throws IllegalArgumentException if the map contains structurally invalid values
     *                                  (e.g., {@code $ref} is not a string, {@code anyOf} is not a list,
     *                                  {@code properties} contains a non-object value)
     */
    @SuppressWarnings("unchecked")
    public static JsonSchemaElement fromMap(Map<String, Object> map) {
        ensureNotNull(map, "map");

        // $ref
        if (map.containsKey(REF)) return parseReference(map);

        // anyOf
        if (map.containsKey(ANY_OF)) return parseAnyOf(map);

        // enum
        if (map.containsKey(ENUM)) return parseEnum(map);

        // type-based dispatch
        Object typeObj = map.get(TYPE);
        if (!(typeObj instanceof String type)) {
            return rawFallback(map);
        }

        switch (type) {
            case "string":  return parseStringSchema(map);
            case "integer": return parseIntegerSchema(map);
            case "number":  return parseNumberSchema(map);
            case "boolean": return parseBooleanSchema(map);
            case "null":    return parseNullSchema(map);
            case "object":  return parseObjectSchema(map);
            case "array":   return parseArraySchema(map);
            default:        return rawFallback(map);
        }
    }

    // ---- parsing helpers for fromMap ----

    private static JsonSchemaElement parseReference(Map<String, Object> map) {
        Object refObj = map.get(REF);
        if (!(refObj instanceof String ref)) {
            throw new IllegalArgumentException("\"$ref\" must be a string, but was: " + className(refObj));
        }
        if (!ref.startsWith("#/$defs/") || !isRepresentable(map, REF_KEYS)) {
            return rawFallback(map);
        }
        String reference = ref.substring("#/$defs/".length());
        return JsonReferenceSchema.builder().reference(reference).build();
    }

    private static JsonSchemaElement parseAnyOf(Map<String, Object> map) {
        Object anyOfObj = map.get(ANY_OF);
        if (!(anyOfObj instanceof List)) {
            throw new IllegalArgumentException("\"anyOf\" must be a list, but was: " + className(anyOfObj));
        }
        if (!isRepresentable(map, ANYOF_KEYS)) {
            return rawFallback(map);
        }
        List<?> anyOfList = (List<?>) anyOfObj;
        List<JsonSchemaElement> anyOf = new ArrayList<>(anyOfList.size());
        for (Object element : anyOfList) {
            if (!(element instanceof Map)) {
                throw new IllegalArgumentException(
                        "\"anyOf\" elements must be JSON objects, but found: " + className(element));
            }
            anyOf.add(fromMap((Map<String, Object>) element));
        }
        return JsonAnyOfSchema.builder()
                .description(optionalString(map, DESCRIPTION))
                .anyOf(anyOf)
                .build();
    }

    private static JsonSchemaElement parseEnum(Map<String, Object> map) {
        Object enumObj = map.get(ENUM);
        if (!(enumObj instanceof List<?> enumList)) {
            throw new IllegalArgumentException("\"enum\" must be a list, but was: " + className(enumObj));
        }
        Object enumTypeObj = map.get(TYPE);
        if (!isRepresentable(map, ENUM_KEYS)
                || !allStrings(enumList)
                || (enumTypeObj != null && !"string".equals(enumTypeObj))) {
            return rawFallback(map);
        }
        List<String> enumValues = requireStringList(ENUM, enumList);
        return JsonEnumSchema.builder()
                .description(optionalString(map, DESCRIPTION))
                .enumValues(enumValues)
                .build();
    }

    private static JsonSchemaElement parseStringSchema(Map<String, Object> map) {
        return isRepresentable(map, STRING_KEYS)
                ? JsonStringSchema.builder().description(optionalString(map, DESCRIPTION)).build()
                : rawFallback(map);
    }

    private static JsonSchemaElement parseIntegerSchema(Map<String, Object> map) {
        return isRepresentable(map, INTEGER_KEYS)
                ? JsonIntegerSchema.builder().description(optionalString(map, DESCRIPTION)).build()
                : rawFallback(map);
    }

    private static JsonSchemaElement parseNumberSchema(Map<String, Object> map) {
        return isRepresentable(map, NUMBER_KEYS)
                ? JsonNumberSchema.builder().description(optionalString(map, DESCRIPTION)).build()
                : rawFallback(map);
    }

    private static JsonSchemaElement parseBooleanSchema(Map<String, Object> map) {
        return isRepresentable(map, BOOLEAN_KEYS)
                ? JsonBooleanSchema.builder().description(optionalString(map, DESCRIPTION)).build()
                : rawFallback(map);
    }

    private static JsonSchemaElement parseNullSchema(Map<String, Object> map) {
        return isRepresentable(map, NULL_KEYS) ? new JsonNullSchema() : rawFallback(map);
    }

    private static JsonSchemaElement parseObjectSchema(Map<String, Object> map) {
        if (!isRepresentable(map, OBJECT_KEYS)) {
            return rawFallback(map);
        }
        // schema-valued additionalProperties (e.g., {"type":"string"}) is not representable
        Object additionalProps = map.get(ADDITIONAL_PROPERTIES);
        if (additionalProps != null && !(additionalProps instanceof Boolean)) {
            return rawFallback(map);
        }

        JsonObjectSchema.Builder builder =
                JsonObjectSchema.builder().description(optionalString(map, DESCRIPTION));

        Object propertiesObj = map.get(PROPERTIES);
        if (propertiesObj instanceof Map) {
            Map<String, Object> properties = (Map<String, Object>) propertiesObj;
            Map<String, JsonSchemaElement> schemaProperties = new LinkedHashMap<>();
            properties.forEach((name, propValue) -> {
                if (!(propValue instanceof Map)) {
                    throw new IllegalArgumentException("Property \"" + name
                            + "\" must be a JSON object, but was: " + className(propValue));
                }
                schemaProperties.put(name, fromMap((Map<String, Object>) propValue));
            });
            builder.addProperties(schemaProperties);
        } else if (propertiesObj != null) {
            throw new IllegalArgumentException(
                    "\"properties\" must be a JSON object, but was: " + className(propertiesObj));
        }

        Object requiredObj = map.get(REQUIRED);
        if (requiredObj instanceof List) {
            builder.required(requireStringList(REQUIRED, (List<?>) requiredObj));
        } else if (requiredObj != null) {
            throw new IllegalArgumentException(
                    "\"required\" must be a list, but was: " + className(requiredObj));
        }

        if (additionalProps instanceof Boolean) {
            builder.additionalProperties((Boolean) additionalProps);
        }

        Object defsObj = map.get(DEFS);
        if (defsObj instanceof Map) {
            Map<String, Object> defs = (Map<String, Object>) defsObj;
            Map<String, JsonSchemaElement> definitions = new LinkedHashMap<>();
            defs.forEach((name, defValue) -> {
                if (!(defValue instanceof Map)) {
                    throw new IllegalArgumentException("Definition \"" + name
                            + "\" must be a JSON object, but was: " + className(defValue));
                }
                definitions.put(name, fromMap((Map<String, Object>) defValue));
            });
            builder.definitions(definitions);
        } else if (defsObj != null) {
            throw new IllegalArgumentException(
                    "\"$defs\" must be a JSON object, but was: " + className(defsObj));
        }

        return builder.build();
    }

    private static JsonSchemaElement parseArraySchema(Map<String, Object> map) {
        if (!isRepresentable(map, ARRAY_KEYS)) {
            return rawFallback(map);
        }

        JsonArraySchema.Builder builder =
                JsonArraySchema.builder().description(optionalString(map, DESCRIPTION));

        Object itemsObj = map.get(ITEMS);
        if (itemsObj instanceof Map) {
            builder.items(fromMap((Map<String, Object>) itemsObj));
        } else if (itemsObj != null) {
            throw new IllegalArgumentException(
                    "\"items\" must be a JSON object, but was: " + className(itemsObj));
        }

        return builder.build();
    }

    // ---- helpers ----

    private static boolean isRepresentable(Map<String, Object> map, Set<String> allowedKeys) {
        // Typed models drop null values (e.g., description:null → absent), so any
        // explicit null in the map makes it unrepresentable for round-trip fidelity.
        // Note: Map.of() throws NPE on containsValue(null), so we iterate instead.
        return allowedKeys.containsAll(map.keySet()) && !hasNullValue(map);
    }

    private static boolean hasNullValue(Map<String, Object> map) {
        for (Object value : map.values()) {
            if (value == null) return true;
        }
        return false;
    }

    private static JsonRawSchema rawFallback(Map<String, Object> map) {
        return JsonRawSchema.from(Json.toJson(map));
    }

    private static boolean allStrings(List<?> list) {
        return list.stream().allMatch(String.class::isInstance);
    }

    private static String optionalString(Map<String, Object> map, String field) {
        Object value = map.get(field);
        if (value == null) {
            return null;
        }
        if (!(value instanceof String)) {
            throw new IllegalArgumentException("\"" + field + "\" must be a string, but was: " + className(value));
        }
        return (String) value;
    }

    private static String className(Object obj) {
        return obj == null ? "null" : obj.getClass().getSimpleName();
    }

    private static List<String> requireStringList(String fieldName, List<?> list) {
        List<String> result = new ArrayList<>(list.size());
        for (Object element : list) {
            if (!(element instanceof String)) {
                throw new IllegalArgumentException(
                        "\"" + fieldName + "\" elements must be strings, but found: " + className(element));
            }
            result.add((String) element);
        }
        return result;
    }
}

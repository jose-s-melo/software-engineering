package dev.langchain4j.internal;

import static dev.langchain4j.internal.PolymorphicTypes.discriminatorPropertyName;
import static dev.langchain4j.internal.PolymorphicTypes.discriminatorValue;
import static dev.langchain4j.internal.PolymorphicTypes.findConcreteSubtypes;
import static dev.langchain4j.internal.PolymorphicTypes.isPolymorphic;
import static dev.langchain4j.internal.PolymorphicTypes.verifyJsonTypeInfoIsSupported;
import static dev.langchain4j.internal.Utils.generateUUIDFrom;
import static java.lang.reflect.Modifier.isStatic;
import static java.util.Arrays.stream;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
import dev.langchain4j.model.output.structured.Description;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

@Internal
public class JsonSchemaElementUtils {

    private static final String DEFAULT_UUID_DESCRIPTION = "String in a UUID format";
    private static final String DEFINITIONS_REF = "$defs";

    public static JsonSchemaElement jsonSchemaElementFrom(Class<?> clazz) {
        return jsonSchemaElementFrom(clazz, clazz, null, false, new LinkedHashMap<>());
    }

    public static JsonSchemaElement jsonSchemaElementFrom(
            Class<?> clazz,
            Type type,
            String fieldDescription,
            boolean areSubFieldsRequiredByDefault,
            Map<Class<?>, VisitedClassMetadata> visited) {
        SchemaGenerationContext ctx = new SchemaGenerationContext(clazz, type, fieldDescription, areSubFieldsRequiredByDefault, visited);
        return createSchemaElement(ctx);
    }

    private static JsonSchemaElement createSchemaElement(SchemaGenerationContext ctx) {
        Class<?> clazz = ctx.clazz;
        if (isStringType(clazz)) {
            return createStringSchema(ctx);
        }
        if (isIntegerType(clazz)) {
            return createIntegerSchema(ctx);
        }
        if (isNumberType(clazz)) {
            return createNumberSchema(ctx);
        }
        if (isBooleanType(clazz)) {
            return createBooleanSchema(ctx);
        }
        if (clazz.isEnum()) {
            return createEnumSchema(ctx);
        }
        if (clazz.isArray()) {
            return createArraySchemaFromComponent(ctx);
        }
        if (Collection.class.isAssignableFrom(clazz)) {
            return createArraySchemaFromCollection(ctx);
        }
        if (isPolymorphic(clazz)) {
            return polymorphicSchemaFrom(ctx);
        }
        return jsonObjectOrReferenceSchemaFrom(ctx, false);
    }

    private static boolean isStringType(Class<?> type) {
        return isJsonString(type);
    }

    private static boolean isIntegerType(Class<?> type) {
        return isJsonInteger(type);
    }

    private static boolean isNumberType(Class<?> type) {
        return isJsonNumber(type);
    }

    private static boolean isBooleanType(Class<?> type) {
        return isJsonBoolean(type);
    }

    private static JsonStringSchema createStringSchema(SchemaGenerationContext ctx) {
        return JsonStringSchema.builder()
                .description(Optional.ofNullable(ctx.fieldDescription)
                        .orElse(descriptionFrom(ctx.clazz)))
                .build();
    }

    private static JsonIntegerSchema createIntegerSchema(SchemaGenerationContext ctx) {
        return JsonIntegerSchema.builder().description(ctx.fieldDescription).build();
    }

    private static JsonNumberSchema createNumberSchema(SchemaGenerationContext ctx) {
        return JsonNumberSchema.builder().description(ctx.fieldDescription).build();
    }

    private static JsonBooleanSchema createBooleanSchema(SchemaGenerationContext ctx) {
        return JsonBooleanSchema.builder().description(ctx.fieldDescription).build();
    }

    private static JsonEnumSchema createEnumSchema(SchemaGenerationContext ctx) {
        return JsonEnumSchema.builder()
                .enumValues(stream(ctx.clazz.getEnumConstants())
                        .map(e -> ((Enum<?>) e).name())
                        .toList())
                .description(Optional.ofNullable(ctx.fieldDescription)
                        .orElse(descriptionFrom(ctx.clazz)))
                .build();
    }

    private static JsonArraySchema createArraySchemaFromComponent(SchemaGenerationContext ctx) {
        return JsonArraySchema.builder()
                .items(jsonSchemaElementFrom(
                        ctx.clazz.getComponentType(), null, null,
                        ctx.areSubFieldsRequiredByDefault, ctx.visited))
                .description(ctx.fieldDescription)
                .build();
    }

    private static JsonArraySchema createArraySchemaFromCollection(SchemaGenerationContext ctx) {
        return JsonArraySchema.builder()
                .items(jsonSchemaElementFrom(
                        getActualType(ctx.type), null, null,
                        ctx.areSubFieldsRequiredByDefault, ctx.visited))
                .description(ctx.fieldDescription)
                .build();
    }

    public static JsonSchemaElement polymorphicSchemaFrom(
            Class<?> baseType,
            String description,
            boolean areSubFieldsRequiredByDefault,
            Map<Class<?>, VisitedClassMetadata> visited) {
        SchemaGenerationContext ctx = new SchemaGenerationContext(
                baseType, null, description, areSubFieldsRequiredByDefault, visited);
        return polymorphicSchemaFrom(ctx);
    }

    private static JsonSchemaElement polymorphicSchemaFrom(SchemaGenerationContext ctx) {
        Class<?> baseType = ctx.clazz;
        verifyJsonTypeInfoIsSupported(baseType);

        VisitedClassMetadata metadata = registerVisitedClass(baseType, ctx.visited);
        if (metadata != null && metadata.recursionDetected) {
            return JsonReferenceSchema.builder().reference(metadata.reference).build();
        }

        String discriminatorProperty = discriminatorPropertyName(baseType);
        List<JsonSchemaElement> options = new ArrayList<>();
        for (Class<?> subtype : findConcreteSubtypes(baseType)) {
            JsonSchemaElement subtypeSchema = jsonObjectOrReferenceSchemaFrom(
                    subtype, null, ctx.areSubFieldsRequiredByDefault, ctx.visited, false);
            JsonSchemaElement withDiscriminator =
                    addDiscriminator(subtypeSchema, baseType, subtype, discriminatorProperty);
            options.add(withDiscriminator);
            
            VisitedClassMetadata subtypeMetadata = ctx.visited.get(subtype);
            if (subtypeMetadata != null) {
                subtypeMetadata.jsonSchemaElement = withDiscriminator;
            }
        }

        String desc = ctx.fieldDescription != null ? ctx.fieldDescription :
                Optional.ofNullable(descriptionFrom(baseType)).orElse(baseType.getSimpleName());
        JsonAnyOfSchema anyOf = JsonAnyOfSchema.builder().description(desc).anyOf(options).build();
        metadata.jsonSchemaElement = anyOf;
        return anyOf;
    }

    private static JsonSchemaElement addDiscriminator(
            JsonSchemaElement subtypeSchema, Class<?> baseType, Class<?> subtype, String discriminatorProperty) {

        if (!(subtypeSchema instanceof JsonObjectSchema obj)) {
            return subtypeSchema;
        }

        String discriminatorValue = discriminatorValue(baseType, subtype);

        if (obj.properties().get(discriminatorProperty) instanceof JsonEnumSchema existing
                && existing.enumValues() != null
                && existing.enumValues().size() == 1
                && discriminatorValue.equals(existing.enumValues().get(0))) {
            return obj;
        }

        validateDiscriminatorCollision(obj, baseType, subtype, discriminatorProperty);

        Map<String, JsonSchemaElement> properties = new LinkedHashMap<>();
        properties.put(discriminatorProperty,
                JsonEnumSchema.builder().enumValues(discriminatorValue).build());
        obj.properties().forEach(properties::putIfAbsent);

        List<String> required = new ArrayList<>();
        required.add(discriminatorProperty);
        obj.required().forEach(r -> {
            if (!required.contains(r)) required.add(r);
        });

        return JsonObjectSchema.builder()
                .description(Optional.ofNullable(obj.description()).orElse(subtype.getSimpleName()))
                .addProperties(properties)
                .required(required)
                .additionalProperties(obj.additionalProperties())
                .build();
    }

    private static void validateDiscriminatorCollision(JsonObjectSchema obj, Class<?> baseType,
                                                    Class<?> subtype, String discriminatorProperty) {
        if (obj.properties().containsKey(discriminatorProperty)) {
            JsonTypeInfo info = baseType.getAnnotation(JsonTypeInfo.class);
            boolean allowed = info != null &&
                    (info.visible() || info.include() == JsonTypeInfo.As.EXISTING_PROPERTY);
            if (!allowed) {
                throw new IllegalArgumentException(String.format(
                        "Polymorphic subtype %s declares a field named '%s', which collides with the discriminator " +
                        "property used for %s. Either rename the field, specify a different discriminator " +
                        "name with @JsonTypeInfo(property = \"...\") on %s, set @JsonTypeInfo(visible = true), " +
                        "or use @JsonTypeInfo(include = As.EXISTING_PROPERTY) if the field is intentionally " +
                        "part of the subtype.",
                        subtype.getName(), discriminatorProperty, baseType.getName(), baseType.getName()));
            }
        }
    }

    /**
     * If recursion was detected for {@code baseType}, returns a {@link JsonReferenceSchema} to the
     * polymorphic body (which will be emitted under {@code $defs}); otherwise returns
     * {@code element} unchanged. Avoids duplicating the body inline next to the {@code $defs} entry.
     */
    public static JsonSchemaElement referenceIfRecursive(
            JsonSchemaElement element, Class<?> baseType, Map<Class<?>, VisitedClassMetadata> visited) {
        VisitedClassMetadata metadata = visited.get(baseType);
        if (metadata != null && metadata.recursionDetected && element instanceof JsonAnyOfSchema) {
            return JsonReferenceSchema.builder().reference(metadata.reference).build();
        }
        return element;
    }

    /**
     * Wraps {@code element} as the only required property of an object schema (the
     * {@code value}/{@code values} envelope used at the root of polymorphic AI Service return types,
     * since {@code anyOf} is not allowed at the JSON-schema root) and attaches any
     * recursion-induced definitions collected in {@code visited}.
     */
    public static JsonObjectSchema wrapPolymorphic(
            String propertyName, JsonSchemaElement element, Map<Class<?>, VisitedClassMetadata> visited) {
        JsonObjectSchema.Builder builder =
                JsonObjectSchema.builder().addProperty(propertyName, element).required(propertyName);
        Map<String, JsonSchemaElement> definitions = new LinkedHashMap<>();
        visited.forEach((clazz, meta) -> {
            if (meta.recursionDetected) {
                definitions.put(meta.reference, meta.jsonSchemaElement);
            }
        });
        if (!definitions.isEmpty()) {
            builder.definitions(definitions);
        }
        return builder.build();
    }

    public static JsonSchemaElement jsonObjectOrReferenceSchemaFrom(
            Class<?> type,
            String description,
            boolean areSubFieldsRequiredByDefault,
            Map<Class<?>, VisitedClassMetadata> visited,
            boolean setDefinitions) {
        SchemaGenerationContext ctx = new SchemaGenerationContext(
                type, null, description, areSubFieldsRequiredByDefault, visited);
        return jsonObjectOrReferenceSchemaFrom(ctx, setDefinitions);
    }

    private static JsonSchemaElement jsonObjectOrReferenceSchemaFrom(SchemaGenerationContext ctx, boolean setDefinitions) {
        Class<?> type = ctx.clazz;
        Map<Class<?>, VisitedClassMetadata> visited = ctx.visited;

        if (visited.containsKey(type) && isCustomClass(type)) {
            VisitedClassMetadata meta = visited.get(type);
            JsonSchemaElement existing = meta.jsonSchemaElement;
            if (existing instanceof JsonReferenceSchema) {
                meta.recursionDetected = true;
            }
            if (existing instanceof JsonObjectSchema obj) {
                if (Objects.equals(ctx.fieldDescription, obj.description())) {
                    return obj;
                }
                return obj.toBuilder().description(ctx.fieldDescription).build();
            }
            return existing;
        }

        VisitedClassMetadata meta = registerVisitedClass(type, visited);
        String reference = meta.reference;

        Map<String, JsonSchemaElement> properties = new LinkedHashMap<>();
        List<String> required = new ArrayList<>();
        for (Field field : type.getDeclaredFields()) {
            if (isStatic(field.getModifiers()) || field.getName().equals("__$hits$__") || field.getName().startsWith("this$")) {
                continue;
            }
            String fieldName = field.getName();
            if (isRequired(field, ctx.areSubFieldsRequiredByDefault)) {
                required.add(fieldName);
            }
            String fieldDescription = descriptionFrom(field);
            JsonSchemaElement element = jsonSchemaElementFrom(
                    field.getType(), field.getGenericType(), fieldDescription,
                    ctx.areSubFieldsRequiredByDefault, visited);
            properties.put(fieldName, element);
        }

        JsonObjectSchema.Builder builder = JsonObjectSchema.builder()
                .description(Optional.ofNullable(ctx.fieldDescription).orElse(descriptionFrom(type)))
                .addProperties(properties)
                .required(required);

        meta.jsonSchemaElement = builder.build();

        if (setDefinitions) {
            addDefinitionsIfNeeded(visited, builder);
        }

        return builder.build();
    }

    private static VisitedClassMetadata registerVisitedClass(Class<?> clazz, Map<Class<?>, VisitedClassMetadata> visited) {
        if (visited.containsKey(clazz)) {
            VisitedClassMetadata meta = visited.get(clazz);
            meta.recursionDetected = true;
            return meta;
        }
        String reference = generateUUIDFrom(clazz.getName());
        JsonReferenceSchema refSchema = JsonReferenceSchema.builder().reference(reference).build();
        VisitedClassMetadata meta = new VisitedClassMetadata(refSchema, reference, false);
        visited.put(clazz, meta);
        return meta;
    }

    private static void addDefinitionsIfNeeded(Map<Class<?>, VisitedClassMetadata> visited,
                                            JsonObjectSchema.Builder builder) {
        Map<String, JsonSchemaElement> definitions = new LinkedHashMap<>();
        visited.forEach((clazz, meta) -> {
            if (meta.recursionDetected) {
                definitions.put(meta.reference, meta.jsonSchemaElement);
            }
        });
        if (!definitions.isEmpty()) {
            builder.definitions(definitions);
        }
    }

    private static void putDescriptionIfPresent(Map<String, Object> map, String description) {
        if (description != null) {
            map.put("description", description);
        }
    }

    private static boolean isRequired(Field field, boolean defaultValue) {
        JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.required();
        }

        return defaultValue;
    }

    private static String descriptionFrom(Field field) {
        return descriptionFrom(field.getAnnotation(Description.class));
    }

    private static String descriptionFrom(Class<?> type) {
        if (type == UUID.class) {
            return DEFAULT_UUID_DESCRIPTION;
        }
        return descriptionFrom(type.getAnnotation(Description.class));
    }

    private static String descriptionFrom(Description description) {
        if (description == null) {
            return null;
        }
        return String.join(" ", description.value());
    }

    private static Class<?> getActualType(Type type) {
        if (type instanceof final ParameterizedType parameterizedType) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                return (Class<?>) actualTypeArguments[0];
            }
        }
        return null;
    }

    static boolean isCustomClass(Class<?> clazz) {
        if (clazz.getPackage() != null) {
            String packageName = clazz.getPackage().getName();
            if (packageName.startsWith("java.")
                    || packageName.startsWith("javax.")
                    || packageName.startsWith("jdk.")
                    || packageName.startsWith("sun.")
                    || packageName.startsWith("com.sun.")) {
                return false;
            }
        }

        return true;
    }

    public static Map<String, Map<String, Object>> toMap(Map<String, JsonSchemaElement> properties) {
        return toMap(properties, false);
    }

    public static Map<String, Map<String, Object>> toMap(Map<String, JsonSchemaElement> properties, boolean strict) {
        Map<String, Map<String, Object>> map = new LinkedHashMap<>();
        properties.forEach((property, value) -> map.put(property, toMap(value, strict)));
        return map;
    }

    public static Map<String, Object> toMap(JsonSchemaElement jsonSchemaElement) {
        return toMap(jsonSchemaElement, false);
    }

    public static Map<String, Object> toMap(JsonSchemaElement jsonSchemaElement, boolean strict) {
        return toMap(jsonSchemaElement, strict, true);
    }

    public static Map<String, Object> toMap(JsonSchemaElement jsonSchemaElement, boolean strict, boolean required) {
        return toMap(jsonSchemaElement, strict, required, null);
    }

    public static Map<String, Object> toMap(
            JsonSchemaElement jsonSchemaElement, boolean strict, boolean required, String enumType) {
        if (jsonSchemaElement instanceof JsonObjectSchema obj) {
            return objectSchemaToMap(obj, strict, required, enumType);
        } else if (jsonSchemaElement instanceof JsonArraySchema arr) {
            return arraySchemaToMap(arr, strict, required, enumType);
        } else if (jsonSchemaElement instanceof JsonEnumSchema en) {
            return enumSchemaToMap(en, strict, required, enumType);
        } else if (jsonSchemaElement instanceof JsonStringSchema str) {
            return stringSchemaToMap(str, strict, required, enumType);
        } else if (jsonSchemaElement instanceof JsonIntegerSchema integer) {
            return integerSchemaToMap(integer, strict, required, enumType);
        } else if (jsonSchemaElement instanceof JsonNumberSchema number) {
            return numberSchemaToMap(number, strict, required, enumType);
        } else if (jsonSchemaElement instanceof JsonBooleanSchema bool) {
            return booleanSchemaToMap(bool, strict, required, enumType);
        } else if (jsonSchemaElement instanceof JsonReferenceSchema ref) {
            return referenceSchemaToMap(ref);
        } else if (jsonSchemaElement instanceof JsonAnyOfSchema anyOf) {
            return anyOfSchemaToMap(anyOf, strict);
        } else if (jsonSchemaElement instanceof JsonNullSchema) {
            return nullSchemaToMap();
        } else if (jsonSchemaElement instanceof JsonRawSchema raw) {
            return rawSchemaToMap(raw);
        } else {
            throw new IllegalArgumentException("Unknown type: " + jsonSchemaElement.getClass());
        }
    }

    private static Map<String, Object> objectSchemaToMap(JsonObjectSchema obj, boolean strict, boolean required, String enumType) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", type("object", strict, required));
        putDescriptionIfPresent(map, obj.description());
        
        Map<String, Map<String, Object>> propertiesMap = new LinkedHashMap<>();
        obj.properties().forEach((key, value) ->
                propertiesMap.put(key, toMap(value, strict, obj.required().contains(key), enumType)));
        map.put("properties", propertiesMap);

        if (strict) {
            map.put("required", obj.properties().keySet().stream().toList());
            map.put("additionalProperties", false);
        } else if (obj.required() != null && !obj.required().isEmpty()) {
            map.put("required", obj.required());
        }

        if (!obj.definitions().isEmpty()) {
            map.put(DEFINITIONS_REF, toMap(obj.definitions(), strict));
        }
        return map;
    }

    private static Map<String, Object> arraySchemaToMap(JsonArraySchema arr, boolean strict,
                                                        boolean required, String enumType) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", type("array", strict, required));
        putDescriptionIfPresent(map, arr.description());
        map.put("items", arr.items() != null ? toMap(arr.items(), strict) : Collections.emptyMap());
        return map;
    }

    private static Map<String, Object> enumSchemaToMap(JsonEnumSchema en, boolean strict,
                                                    boolean required, String enumType) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", enumType != null ? enumType : type("string", strict, required));
        putDescriptionIfPresent(map, en.description());
        map.put("enum", en.enumValues());
        return map;
    }

    private static Map<String, Object> stringSchemaToMap(JsonStringSchema str, boolean strict,
                                                        boolean required, String enumType) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", type("string", strict, required));
        putDescriptionIfPresent(map, str.description());
        return map;
    }

    private static Map<String, Object> integerSchemaToMap(JsonIntegerSchema integer, boolean strict,
                                                        boolean required, String enumType) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", type("integer", strict, required));
        putDescriptionIfPresent(map, integer.description());
        return map;
    }

    private static Map<String, Object> numberSchemaToMap(JsonNumberSchema number, boolean strict,
                                                        boolean required, String enumType) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", type("number", strict, required));
        putDescriptionIfPresent(map, number.description());
        return map;
    }

    private static Map<String, Object> booleanSchemaToMap(JsonBooleanSchema bool, boolean strict,
                                                        boolean required, String enumType) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("type", type("boolean", strict, required));
        putDescriptionIfPresent(map, bool.description());
        return map;
    }

    private static Map<String, Object> referenceSchemaToMap(JsonReferenceSchema ref) {
        Map<String, Object> map = new LinkedHashMap<>();
        if (ref.reference() != null) {
            map.put("$ref", "#/" + DEFINITIONS_REF + "/" + ref.reference());
        }
        return map;
    }

    private static Map<String, Object> anyOfSchemaToMap(JsonAnyOfSchema anyOf, boolean strict) {
        Map<String, Object> map = new LinkedHashMap<>();
        putDescriptionIfPresent(map, anyOf.description());
        List<Map<String, Object>> anyOfList = anyOf.anyOf().stream()
                .map(e -> toMap(e, strict))
                .collect(Collectors.toList());
        map.put("anyOf", anyOfList);
        return map;
    }

    private static Map<String, Object> nullSchemaToMap() {
        return Map.of("type", "null");
    }

    private static Map<String, Object> rawSchemaToMap(JsonRawSchema raw) {
        @SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>) Json.fromJson(raw.schema(), Map.class);
        return map;
    }

    private static Object type(String type, boolean strict, boolean required) {
        if (strict && !required) {
            // Emulating an optional parameter by using a union type with null.
            // See
            // https://platform.openai.com/docs/guides/structured-outputs/supported-schemas?api-mode=chat#all-fields-must-be-required
            return new String[] {type, "null"};
        } else {
            return type;
        }
    }

    static boolean isJsonInteger(Class<?> type) {
        return type == byte.class
                || type == Byte.class
                || type == short.class
                || type == Short.class
                || type == int.class
                || type == Integer.class
                || type == long.class
                || type == Long.class
                || type == BigInteger.class;
    }

    static boolean isJsonNumber(Class<?> type) {
        return type == float.class
                || type == Float.class
                || type == double.class
                || type == Double.class
                || type == BigDecimal.class;
    }

    static boolean isJsonBoolean(Class<?> type) {
        return type == boolean.class || type == Boolean.class;
    }

    static boolean isJsonString(Class<?> type) {
        return type == String.class
                || type == char.class
                || type == Character.class
                || CharSequence.class.isAssignableFrom(type)
                || type == UUID.class;
    }

    static boolean isJsonArray(Class<?> type) {
        return type.isArray() || Iterable.class.isAssignableFrom(type);
    }

    public static class VisitedClassMetadata {

        public JsonSchemaElement jsonSchemaElement;
        public String reference;
        public boolean recursionDetected;

        public VisitedClassMetadata(JsonSchemaElement jsonSchemaElement, String reference, boolean recursionDetected) {
            this.jsonSchemaElement = jsonSchemaElement;
            this.reference = reference;
            this.recursionDetected = recursionDetected;
        }
    }

    private static class SchemaGenerationContext {
        final Class<?> clazz;
        final Type type;
        final String fieldDescription;
        final boolean areSubFieldsRequiredByDefault;
        final Map<Class<?>, VisitedClassMetadata> visited;

        SchemaGenerationContext(Class<?> clazz, Type type, String fieldDescription,
                                boolean areSubFieldsRequiredByDefault,
                                Map<Class<?>, VisitedClassMetadata> visited) {
            this.clazz = clazz;
            this.type = type;
            this.fieldDescription = fieldDescription;
            this.areSubFieldsRequiredByDefault = areSubFieldsRequiredByDefault;
            this.visited = visited;
        }
    }
}

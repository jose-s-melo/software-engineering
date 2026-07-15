package com.dev.core;

import static org.assertj.core.api.Assertions.assertThat;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;
import com.dev.core.services.TokenService;
import java.time.Instant;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * Testes unitários para TokenService.
 *
 * <p>Escopo: geração, validação e verificação de role (isAdmin) em tokens JWT. TokenService não
 * possui dependências externas — instanciado diretamente, sem mocks. Os campos ISSUER e SECRET são
 * anotados com @Value e só são preenchidos pelo Spring dentro de um ApplicationContext; como o
 * teste instancia a classe com "new", eles são injetados manualmente via ReflectionTestUtils com os
 * mesmos valores default definidos em application.properties.
 */
@DisplayName("TokenService")
class TokenServiceTest {

    private static final String ISSUER = "core";
    private static final String SECRET = "CHAVESECRETAALEATORIA1234567890HARDCODED";

    private TokenService tokenService;

    @BeforeEach
    void setUp() {
        tokenService = new TokenService();
        ReflectionTestUtils.setField(tokenService, "ISSUER", ISSUER);
        ReflectionTestUtils.setField(tokenService, "SECRET", SECRET);
    }

    // ── Helpers ────────────────────────────────────────────────────────────────

    private User buildUser(UserRole role) {
        return User.builder()
                .id(UUID.randomUUID())
                .name("Usuário Teste")
                .email("usuario@email.com")
                .password("HASH")
                .role(role)
                .build();
    }

    /**
     * Cria um token já expirado usando o mesmo issuer/secret configurados no setUp, útil para
     * testar o caminho de rejeição em validateToken.
     */
    private String buildExpiredToken(String subject) {
        return JWT.create()
                .withIssuer(ISSUER)
                .withSubject(subject)
                .withExpiresAt(Instant.now().minusSeconds(3600))
                .sign(Algorithm.HMAC256(SECRET));
    }

    @Nested
    @DisplayName("generateToken - caminho feliz")
    class GenerateToken {

        @Test
        @DisplayName("deve gerar token não-nulo para usuário BARBEIRO")
        void deveGerarTokenNaoNuloParaBarbeiro() {
            String token = tokenService.generateToken(buildUser(UserRole.BARBEIRO));
            assertThat(token).isNotNull().isNotBlank();
        }

        @Test
        @DisplayName("deve gerar token não-nulo para usuário ADMIN")
        void deveGerarTokenNaoNuloParaAdmin() {
            String token = tokenService.generateToken(buildUser(UserRole.ADMIN));
            assertThat(token).isNotNull().isNotBlank();
        }

        @Test
        @DisplayName("deve gerar token não-nulo para usuário CLIENTE")
        void deveGerarTokenNaoNuloParaCliente() {
            String token = tokenService.generateToken(buildUser(UserRole.CLIENTE));
            assertThat(token).isNotNull().isNotBlank();
        }

        @Test
        @DisplayName("o subject do token deve ser o email (username) do usuário")
        void subjectDoTokenDeveSerOEmail() {
            String token = tokenService.generateToken(buildUser(UserRole.BARBEIRO));
            assertThat(JWT.decode(token).getSubject()).isEqualTo("usuario@email.com");
        }

        @Test
        @DisplayName("o issuer do token deve ser o valor configurado em api.security.issuer")
        void issuerDoTokenDeveSerOConfigurado() {
            String token = tokenService.generateToken(buildUser(UserRole.CLIENTE));
            assertThat(JWT.decode(token).getIssuer()).isEqualTo(ISSUER);
        }

        @Test
        @DisplayName("o token deve ter data de expiração no futuro (≈ 2 horas)")
        void tokenDeveExpirarNoFuturo() {
            String token = tokenService.generateToken(buildUser(UserRole.CLIENTE));
            assertThat(JWT.decode(token).getExpiresAtAsInstant()).isAfter(Instant.now());
        }

        @Test
        @DisplayName(
                "o claim 'roles' deve ser gravado como List<String> — acessível via asList(String.class) sem exceção")
        void claimRolesDeveSerListaDeStrings() {
            String token = tokenService.generateToken(buildUser(UserRole.BARBEIRO));
            var roles = JWT.decode(token).getClaim("roles").asList(String.class);
            assertThat(roles).isNotNull().contains("ROLE_BARBEIRO");
        }

        @Test
        @DisplayName("usuário ADMIN deve ter múltiplas roles no claim do token")
        void adminDeveTerMultiplasRolesNoToken() {
            String token = tokenService.generateToken(buildUser(UserRole.ADMIN));
            var roles = JWT.decode(token).getClaim("roles").asList(String.class);
            assertThat(roles)
                    .contains("ROLE_ADMIN", "ROLE_COMMON", "ROLE_BARBEIRO", "ROLE_CLIENTE");
        }
    }

    @Nested
    @DisplayName("validateToken")
    class ValidateToken {

        @Test
        @DisplayName("deve retornar o email (subject) para um token válido recém-gerado")
        void deveRetornarSubjectParaTokenValido() {
            String token = tokenService.generateToken(buildUser(UserRole.BARBEIRO));
            assertThat(tokenService.validateToken(token)).isEqualTo("usuario@email.com");
        }

        @Test
        @DisplayName("round-trip: token gerado por generateToken é aceito por validateToken")
        void tokenGeradoEValidadoPeloProprioService() {
            String token = tokenService.generateToken(buildUser(UserRole.CLIENTE));
            assertThat(tokenService.validateToken(token)).isNotNull();
        }

        @Test
        @DisplayName("deve retornar null para string aleatória inválida")
        void deveRetornarNullParaStringInvalida() {
            assertThat(tokenService.validateToken("token.invalido.qualquer")).isNull();
        }

        @Test
        @DisplayName("deve retornar null para token com assinatura adulterada")
        void deveRetornarNullParaTokenAdulterado() {
            String token = tokenService.generateToken(buildUser(UserRole.BARBEIRO));
            String adulterado = token.substring(0, token.length() - 5) + "XXXXX";
            assertThat(tokenService.validateToken(adulterado)).isNull();
        }

        @Test
        @DisplayName("deve retornar null para token expirado")
        void deveRetornarNullParaTokenExpirado() {
            String expirado = buildExpiredToken("usuario@email.com");
            assertThat(tokenService.validateToken(expirado)).isNull();
        }

        @Test
        @DisplayName("deve retornar null para string vazia")
        void deveRetornarNullParaStringVazia() {
            assertThat(tokenService.validateToken("")).isNull();
        }

        @Test
        @DisplayName("deve retornar null para token nulo")
        void deveRetornarNullParaTokenNulo() {
            assertThat(tokenService.validateToken(null)).isNull();
        }
    }

    @Nested
    @DisplayName("isAdmin")
    class IsAdmin {

        @Test
        @DisplayName("isAdmin deve retornar false quando authHeader for null")
        void isAdminComAuthHeaderNuloRetornaFalse() {
            boolean resultado = tokenService.isAdmin(null);

            assertThat(resultado).isFalse();
        }

        @Test
        @DisplayName("isAdmin deve retornar true para usuário ADMIN. ")
        void isAdminComTokenAdminValidoRetornaTrue() {
            String token = tokenService.generateToken(buildUser(UserRole.ADMIN));

            assertThat(tokenService.isAdmin("Bearer " + token)).isTrue();
        }

        @Test
        @DisplayName("isAdmin deve retornar false para usuário BARBEIRO.")
        void isAdminComTokenBarbeiroRetornaFalse() {
            String token = tokenService.generateToken(buildUser(UserRole.BARBEIRO));

            assertThat(tokenService.isAdmin("Bearer " + token)).isFalse();
        }

        @Test
        @DisplayName(
                "isAdmin com token inválido retorna false sem exceção — curto-circuito no && evita asList()")
        void isAdminComTokenInvalidoRetornaFalseSemExcecao() {

            boolean resultado = tokenService.isAdmin("Bearer token.invalido.aqui");
            assertThat(resultado).isFalse();
        }

        @Test
        @DisplayName(
                "fix esperado: com asList(String.class) o claim 'roles' contém ROLE_ADMIN para usuário ADMIN")
        void fixEsperadoClaimRolesLidoCorretamenteContemRoleAdmin() {
            String token = tokenService.generateToken(buildUser(UserRole.ADMIN));
            var roles = JWT.decode(token).getClaim("roles").asList(String.class);

            boolean isAdmin = roles.stream().anyMatch(r -> r.contains("ADMIN"));

            assertThat(isAdmin).isTrue();
        }

        @Test
        @DisplayName(
                "fix esperado: com asList(String.class) o claim 'roles' NÃO contém ADMIN para usuário BARBEIRO")
        void fixEsperadoClaimRolesNaoContemAdminParaBarbeiro() {
            String token = tokenService.generateToken(buildUser(UserRole.BARBEIRO));
            var roles = JWT.decode(token).getClaim("roles").asList(String.class);

            boolean isAdmin = roles.stream().anyMatch(r -> r.contains("ADMIN"));

            assertThat(isAdmin).isFalse();
        }
    }
}

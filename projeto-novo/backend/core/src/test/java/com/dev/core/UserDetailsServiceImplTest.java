package com.dev.core;

import com.dev.core.exceptions.UserNotFoundException;
import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;
import com.dev.core.repositories.UserRepository;
import com.dev.core.services.UserDetailsServiceImpl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

/**
 * Testes unitários para UserDetailsServiceImpl.
 *
 * Escopo: carregamento de UserDetails por email (username) — ponto de entrada
 * do Spring Security para autenticação. UserRepository é mockado.
 *
 * Inclui verificação das authorities retornadas por User.getAuthorities() para
 * cada role, pois é exatamente esse contrato que o SecurityFilter consome.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("UserDetailsServiceImpl")
class UserDetailsServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    // ---------------------------------------------------------------
    // loadUserByUsername
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("loadUserByUsername")
    class LoadUserByUsername {

        @Test
        @DisplayName("deve retornar o User quando o email existe no repositório")
        void deveRetornarUserQuandoEmailExiste() {
            String email = "joao@email.com";
            User user = User.builder()
                    .id(UUID.randomUUID())
                    .email(email)
                    .password("HASH")
                    .role(UserRole.CLIENTE)
                    .build();
            when(userRepository.findByEmail(email)).thenReturn(Optional.of(user));

            var resultado = userDetailsService.loadUserByUsername(email);

            assertThat(resultado).isEqualTo(user);
            assertThat(resultado.getUsername()).isEqualTo(email);
        }

        @Test
        @DisplayName("deve lançar UserNotFoundException quando o email não existe — nunca retorna null silenciosamente")
        void deveLancarUserNotFoundExceptionQuandoEmailNaoExiste() {
            String email = "naoexiste@email.com";
            when(userRepository.findByEmail(email)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> userDetailsService.loadUserByUsername(email))
                    .isInstanceOf(UserNotFoundException.class)
                    .hasMessage("Usuário não encontrado.");
        }

        // ── Verificação das authorities por role ──────────────────────────────

        @Test
        @DisplayName("usuário CLIENTE deve expor apenas ROLE_CLIENTE nas authorities")
        void deveRetornarRoleClienteParaUsuarioCliente() {
            User cliente = User.builder()
                    .id(UUID.randomUUID())
                    .email("cliente@email.com")
                    .role(UserRole.CLIENTE)
                    .build();
            when(userRepository.findByEmail("cliente@email.com")).thenReturn(Optional.of(cliente));

            var resultado = userDetailsService.loadUserByUsername("cliente@email.com");

            assertThat(resultado.getAuthorities())
                    .extracting("authority")
                    .containsExactly("ROLE_CLIENTE");
        }

        @Test
        @DisplayName("usuário BARBEIRO deve expor apenas ROLE_BARBEIRO nas authorities")
        void deveRetornarRoleBarbeiroParaUsuarioBarbeiro() {
            User barbeiro = User.builder()
                    .id(UUID.randomUUID())
                    .email("barbeiro@email.com")
                    .role(UserRole.BARBEIRO)
                    .build();
            when(userRepository.findByEmail("barbeiro@email.com")).thenReturn(Optional.of(barbeiro));

            var resultado = userDetailsService.loadUserByUsername("barbeiro@email.com");

            assertThat(resultado.getAuthorities())
                    .extracting("authority")
                    .containsExactly("ROLE_BARBEIRO");
        }

        @Test
        @DisplayName("usuário ADMIN deve expor ROLE_ADMIN, ROLE_COMMON, ROLE_BARBEIRO e ROLE_CLIENTE")
        void deveRetornarQuatroRolesParaUsuarioAdmin() {
            User admin = User.builder()
                    .id(UUID.randomUUID())
                    .email("admin@email.com")
                    .role(UserRole.ADMIN)
                    .build();
            when(userRepository.findByEmail("admin@email.com")).thenReturn(Optional.of(admin));

            var resultado = userDetailsService.loadUserByUsername("admin@email.com");

            assertThat(resultado.getAuthorities())
                    .extracting("authority")
                    .containsExactlyInAnyOrder(
                            "ROLE_ADMIN", "ROLE_COMMON", "ROLE_BARBEIRO", "ROLE_CLIENTE");
        }

        @Test
        @DisplayName("borda: usuário com role null deve ter authority ROLE_COMMON como fallback")
        void usuarioComRoleNulaDeveRetornarRoleCommonFallback() {
            User semRole = User.builder()
                    .id(UUID.randomUUID())
                    .email("semrole@email.com")
                    .role(null)
                    .build();
            when(userRepository.findByEmail("semrole@email.com")).thenReturn(Optional.of(semRole));

            var resultado = userDetailsService.loadUserByUsername("semrole@email.com");

            assertThat(resultado.getAuthorities())
                    .extracting("authority")
                    .containsExactly("ROLE_COMMON");
        }
    }
}
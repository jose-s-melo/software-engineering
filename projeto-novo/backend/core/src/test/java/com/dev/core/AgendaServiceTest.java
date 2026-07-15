package com.dev.core;
import com.dev.core.dtos.agenda.AgendaRequestDTO;
import com.dev.core.dtos.agenda.HorarioAtendimentoDTO;
import com.dev.core.exceptions.InvalidAgendaException;
import com.dev.core.exceptions.UserNotFoundException;
import com.dev.core.models.agenda.Agenda;
import com.dev.core.models.agenda.HorarioAtendimento;
import com.dev.core.models.user.User;
import com.dev.core.models.user.UserRole;
import com.dev.core.repositories.AgendaRepository;
import com.dev.core.repositories.UserRepository;
import com.dev.core.services.agenda.AgendaService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * Testes unitários para AgendaService.
 *
 * Escopo: lógica pura de criação/atualização (upsert) da agenda semanal de um
 * barbeiro. AgendaRepository e UserRepository são mockados.
 *
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("AgendaService")
class AgendaServiceTest {

    @Mock
    private AgendaRepository agendaRepository;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AgendaService agendaService;

    private User barbeiro;
    private UUID barbeiroId;

    @BeforeEach
    void setUp() {
        barbeiroId = UUID.randomUUID();
        barbeiro = User.builder()
                .id(barbeiroId)
                .name("Barbeiro Teste")
                .email("barbeiro@email.com")
                .role(UserRole.BARBEIRO)
                .build();
    }

    private HorarioAtendimentoDTO horario(DayOfWeek dia, LocalTime abertura, LocalTime fechamento) {
        return new HorarioAtendimentoDTO(dia, abertura, fechamento);
    }

    // ---------------------------------------------------------------
    // Caminho feliz
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("createOrUpdateAgenda - caminho feliz")
    class HappyPath {

        @Test
        @DisplayName("deve criar uma agenda nova quando o barbeiro ainda não possui uma")
        void deveCriarAgendaNovaParaBarbeiroSemAgenda() {
            AgendaRequestDTO dto = new AgendaRequestDTO(
                    barbeiroId,
                    List.of(horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)))
            );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));
            when(agendaRepository.findByBarbeiro(barbeiro)).thenReturn(Optional.empty());
            when(agendaRepository.save(any(Agenda.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Agenda resultado = agendaService.createOrUpdateAgenda(dto);

            assertThat(resultado.getBarbeiro()).isEqualTo(barbeiro);
            assertThat(resultado.getHorariosDaSemana()).hasSize(1);
            assertThat(resultado.getHorariosDaSemana().get(0).getDiaDaSemana()).isEqualTo(DayOfWeek.MONDAY);
            verify(agendaRepository, times(1)).save(any(Agenda.class));
        }

        @Test
        @DisplayName("deve atualizar (upsert) a agenda existente em vez de criar uma nova")
        void deveAtualizarAgendaExistente() {
            UUID agendaId = UUID.randomUUID();
            Agenda agendaExistente = Agenda.builder()
                    .id(agendaId)
                    .barbeiro(barbeiro)
                    .horariosDaSemana(List.of(
                            HorarioAtendimento.builder()
                                    .diaDaSemana(DayOfWeek.TUESDAY)
                                    .horarioAbertura(LocalTime.of(8, 0))
                                    .horarioFechamento(LocalTime.of(12, 0))
                                    .build()
                    ))
                    .build();

            AgendaRequestDTO dto = new AgendaRequestDTO(
                    barbeiroId,
                    List.of(horario(DayOfWeek.WEDNESDAY, LocalTime.of(10, 0), LocalTime.of(20, 0)))
            );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));
            when(agendaRepository.findByBarbeiro(barbeiro)).thenReturn(Optional.of(agendaExistente));
            when(agendaRepository.save(any(Agenda.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Agenda resultado = agendaService.createOrUpdateAgenda(dto);

            // O mesmo ID de agenda deve ser preservado — é um update, não um insert novo.
            assertThat(resultado.getId()).isEqualTo(agendaId);
            // Os horários antigos (TUESDAY) devem ser substituídos pelos novos (WEDNESDAY).
            assertThat(resultado.getHorariosDaSemana()).hasSize(1);
            assertThat(resultado.getHorariosDaSemana().get(0).getDiaDaSemana()).isEqualTo(DayOfWeek.WEDNESDAY);
        }

        @Test
        @DisplayName("deve aceitar múltiplos dias da semana em uma única requisição")
        void deveAceitarMultiplosDias() {
            AgendaRequestDTO dto = new AgendaRequestDTO(
                    barbeiroId,
                    List.of(
                            horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)),
                            horario(DayOfWeek.TUESDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)),
                            horario(DayOfWeek.WEDNESDAY, LocalTime.of(9, 0), LocalTime.of(18, 0))
                    )
            );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));
            when(agendaRepository.findByBarbeiro(barbeiro)).thenReturn(Optional.empty());
            when(agendaRepository.save(any(Agenda.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Agenda resultado = agendaService.createOrUpdateAgenda(dto);

            assertThat(resultado.getHorariosDaSemana()).hasSize(3);
        }
    }

    // ---------------------------------------------------------------
    // Casos óbvios de erro
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("createOrUpdateAgenda - erros óbvios")
    class ErrosObvios {

        @Test
        @DisplayName("deve lançar UserNotFoundException quando o barbeiroId não existe")
        void deveLancarExcecaoQuandoBarbeiroNaoExiste() {
            UUID idInexistente = UUID.randomUUID();
            AgendaRequestDTO dto = new AgendaRequestDTO(
                    idInexistente,
                    List.of(horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)))
            );

            when(userRepository.findById(idInexistente)).thenReturn(Optional.empty());

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(UserNotFoundException.class);

            verify(agendaRepository, never()).save(any(Agenda.class));
        }

        @Test
        @DisplayName("deve lançar IllegalArgumentException quando o usuário não é BARBEIRO (role CLIENTE)")
        void deveLancarExcecaoQuandoUsuarioNaoEhBarbeiro() {
            User cliente = User.builder().id(barbeiroId).role(UserRole.CLIENTE).build();
            AgendaRequestDTO dto = new AgendaRequestDTO(
                    barbeiroId,
                    List.of(horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)))
            );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(cliente));

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(InvalidAgendaException.class)
                    .hasMessageContaining("BARBEIRO");

            verify(agendaRepository, never()).findByBarbeiro(any(User.class));
            verify(agendaRepository, never()).save(any(Agenda.class));
        }

        @Test
        @DisplayName("deve lançar IllegalArgumentException quando o usuário é ADMIN (não é tratado como BARBEIRO)")
        void deveLancarExcecaoQuandoUsuarioEhAdmin() {
        
            User admin = User.builder().id(barbeiroId).role(UserRole.ADMIN).build();
            AgendaRequestDTO dto = new AgendaRequestDTO(
                    barbeiroId,
                    List.of(horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)))
            );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(admin));

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(InvalidAgendaException.class);
        }

        @Test
        @DisplayName("deve lançar IllegalArgumentException quando role do usuário é null")
        void deveLancarExcecaoQuandoRoleEhNull() {
            User usuarioSemRole = User.builder().id(barbeiroId).role(null).build();
            AgendaRequestDTO dto = new AgendaRequestDTO(
                    barbeiroId,
                    List.of(horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)))
            );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(usuarioSemRole));

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(InvalidAgendaException.class);
        }
    }

    // ---------------------------------------------------------------
    // Casos de borda — tentando "quebrar" a regra de horários
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("createOrUpdateAgenda - bordas de horário (potenciais bugs)")
    class BordasDeHorario {

        @Test
        @DisplayName("borda: deve rejeitar horário de abertura depois do fechamento")
        void NaoAceitaHorarioAberturaDepoisDoFechamento() {
            AgendaRequestDTO dto = new AgendaRequestDTO(
            barbeiroId,
            List.of(horario(DayOfWeek.MONDAY, LocalTime.of(18, 0), LocalTime.of(8, 0)))
            );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(InvalidAgendaException.class)
                    .hasMessageContaining("deve ser anterior ao fechamento");

            verify(agendaRepository, never()).save(any());
    }

        @Test
        @DisplayName("borda: deve rejeitar horário de abertura igual ao fechamento")
        void aceitaHorarioAberturaIgualFechamento() {
            AgendaRequestDTO dto = new AgendaRequestDTO(
            barbeiroId,
            List.of(horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(9, 0)))
    );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(InvalidAgendaException.class)
                    .hasMessageContaining("deve ser anterior ao fechamento");

            verify(agendaRepository, never()).save(any());
    }

        @Test
        @DisplayName("borda: deve rejeitar horários sobrepostos no mesmo dia")
        void aceitaHorariosSobrepostosNoMesmoDia() {
            AgendaRequestDTO dto = new AgendaRequestDTO(
            barbeiroId,
            List.of(
                    horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)),
                    horario(DayOfWeek.MONDAY, LocalTime.of(12, 0), LocalTime.of(20, 0))
            )
        );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(InvalidAgendaException.class)
                    .hasMessageContaining("horários sobrepostos");

            verify(agendaRepository, never()).save(any());
}

        @Test
        @DisplayName("borda: deve rejeitar horários duplicados no mesmo dia")
        void NaoAceitaDiaDuplicadoIdentico() {
            AgendaRequestDTO dto = new AgendaRequestDTO(
            barbeiroId,
            List.of(
                    horario(DayOfWeek.FRIDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)),
                    horario(DayOfWeek.FRIDAY, LocalTime.of(9, 0), LocalTime.of(18, 0))
            )
        );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(InvalidAgendaException.class)
                    .hasMessageContaining("horários sobrepostos");

            verify(agendaRepository, never()).save(any());
        }

        @Test
        @DisplayName("borda: deve rejeitar horário que cruza a meia-noite")
        void aceitaHorarioQueCruzaMeiaNoite() {
            AgendaRequestDTO dto = new AgendaRequestDTO(
            barbeiroId,
            List.of(horario(DayOfWeek.SATURDAY, LocalTime.of(23, 0), LocalTime.of(1, 0)))
    );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(InvalidAgendaException.class)
                    .hasMessageContaining("deve ser anterior ao fechamento");

            verify(agendaRepository, never()).save(any());
        }
    }

    // ---------------------------------------------------------------
    // Casos de borda — upsert e concorrência
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("createOrUpdateAgenda - upsert e concorrência")
    class UpsertEConcorrencia {

        @Test
        @DisplayName("ao atualizar, a agenda enviada com lista de horários vazia substitui (zera) os horários antigos")
        void listaDeHorariosVaziaNaAtualizacao() {
            
            UUID agendaId = UUID.randomUUID();
            Agenda agendaExistente = Agenda.builder()
                    .id(agendaId)
                    .barbeiro(barbeiro)
                    .horariosDaSemana(List.of(
                            HorarioAtendimento.builder()
                                    .diaDaSemana(DayOfWeek.MONDAY)
                                    .horarioAbertura(LocalTime.of(9, 0))
                                    .horarioFechamento(LocalTime.of(18, 0))
                                    .build()
                    ))
                    .build();

            AgendaRequestDTO dto = new AgendaRequestDTO(barbeiroId, List.of());

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));
            when(agendaRepository.findByBarbeiro(barbeiro)).thenReturn(Optional.of(agendaExistente));
            when(agendaRepository.save(any(Agenda.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Agenda resultado = agendaService.createOrUpdateAgenda(dto);

            assertThat(resultado.getHorariosDaSemana()).isEmpty();
        }

        @Test
        @DisplayName("borda: duas chamadas concorrentes para o mesmo barbeiro sem agenda tentam criar duas Agendas novas")
        void chamadasConcorrentesParaMesmoBarbeiroSemAgenda() {
            // Simula a condição de corrida: ambas as "threads" leem findByBarbeiro
            // ANTES de qualquer save acontecer, então ambas recebem Optional.empty()
            // e criam uma instância de Agenda nova. Em um cenário real, a segunda
            // chamada a save() falharia por violar a constraint UNIQUE da coluna
            // barbeiro_id — mas isso só seria pego em um teste de integração com
            // banco real, não neste teste de unidade. O teste aqui apenas comprova
            // que NADA na camada de serviço impede a tentativa de criar duas agendas.
            AgendaRequestDTO dto1 = new AgendaRequestDTO(
                    barbeiroId, List.of(horario(DayOfWeek.MONDAY, LocalTime.of(8, 0), LocalTime.of(12, 0)))
            );
            AgendaRequestDTO dto2 = new AgendaRequestDTO(
                    barbeiroId, List.of(horario(DayOfWeek.TUESDAY, LocalTime.of(8, 0), LocalTime.of(12, 0)))
            );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));
            // As duas chamadas "concorrentes" leem o mesmo estado: nenhuma agenda ainda.
            when(agendaRepository.findByBarbeiro(barbeiro)).thenReturn(Optional.empty());
            when(agendaRepository.save(any(Agenda.class))).thenAnswer(invocation -> invocation.getArgument(0));

            Agenda resultado1 = agendaService.createOrUpdateAgenda(dto1);
            Agenda resultado2 = agendaService.createOrUpdateAgenda(dto2);

            // Ambas resultam em uma Agenda com id nulo (nova instância), pois o
            // service nunca viu uma agenda persistida entre as duas chamadas.
            assertThat(resultado1.getId()).isNull();
            assertThat(resultado2.getId()).isNull();
            verify(agendaRepository, times(2)).save(any(Agenda.class));
        }

        @Test
        @DisplayName("o repositório deve ser consultado pelo MESMO objeto User retornado pelo findById (referência usada no findByBarbeiro)")
        void agendaRepositoryDeveSerConsultadoComOMesmoUsuario() {
            AgendaRequestDTO dto = new AgendaRequestDTO(
                    barbeiroId,
                    List.of(horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)))
            );

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));
            when(agendaRepository.findByBarbeiro(barbeiro)).thenReturn(Optional.empty());
            when(agendaRepository.save(any(Agenda.class))).thenAnswer(invocation -> invocation.getArgument(0));

            agendaService.createOrUpdateAgenda(dto);

            ArgumentCaptor<User> captor = ArgumentCaptor.forClass(User.class);
            verify(agendaRepository).findByBarbeiro(captor.capture());
            assertThat(captor.getValue()).isEqualTo(barbeiro);
        }
    }

    // ---------------------------------------------------------------
    // Casos de borda — dados malformados
    // ---------------------------------------------------------------

    @Nested
    @DisplayName("createOrUpdateAgenda - dados malformados (bypass de @Valid)")
    class DadosMalformados {

        @Test
        @DisplayName("borda: barbeiroId nulo deve gerar InvalidAgendaException")
        void barbeiroIdNuloPropagaParaORepositorio() {
                AgendaRequestDTO dto = new AgendaRequestDTO(
                null,
                List.of(horario(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(18, 0)))
            );

            assertThatThrownBy(() -> agendaService.createOrUpdateAgenda(dto))
                    .isInstanceOf(InvalidAgendaException.class)
                    .hasMessageContaining("ID do barbeiro");
        }

        @Test
        @DisplayName("borda: lista de horários nula resulta em agenda sem horários")
        void listaDeHorariosNulaResultaEmListaVazia() {
            AgendaRequestDTO dto = new AgendaRequestDTO(barbeiroId, null);

            when(userRepository.findById(barbeiroId)).thenReturn(Optional.of(barbeiro));
            when(agendaRepository.findByBarbeiro(barbeiro)).thenReturn(Optional.empty());
            when(agendaRepository.save(any(Agenda.class)))
                    .thenAnswer(invocation -> invocation.getArgument(0));

            Agenda resultado = agendaService.createOrUpdateAgenda(dto);

            assertThat(resultado.getHorariosDaSemana()).isEmpty();
        }
    }
}
package com.dev.core.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_agendamento")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private LocalDate data; // Ex: 2026-07-13

    @Enumerated(EnumType.STRING)
    @Column(name = "dia_semana", nullable = false)
    private DayOfWeek diaSemana; // Enum nativo do Java (MONDAY, TUESDAY, etc.)

    // Criará uma tabela auxiliar automática para os horários (ex: "14:00", "14:30")
    @ElementCollection
    @CollectionTable(name = "tb_horarios_disponiveis", joinColumns = @JoinColumn(name = "agendamento_id"))
    @Column(name = "horario")
    private List<String> horariosDisponiveis;
}
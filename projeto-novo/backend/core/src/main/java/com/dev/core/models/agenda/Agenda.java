package com.dev.core.models.agenda;

import com.dev.core.models.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Table(name = "agendas")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "barbeiro_id", nullable = false, unique = true)
    private User barbeiro;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name = "agenda_horarios",
            joinColumns = @JoinColumn(name = "agenda_id")
    )
    private List<HorarioAtendimento> horariosDaSemana;
}
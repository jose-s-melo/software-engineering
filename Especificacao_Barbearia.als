-- Definição de usuários e suas categorias
abstract sig Usuario {} 
sig Administrador, Cliente extends Usuario {}

-- Definição de serviços oferecidos pela barbearia
sig Servico {
    nome: one NomeServico
}
sig NomeServico {} 

-- Definição de horários (slots de atendimento) e disponibilidade dos barbeiros
sig Horario {} 
-- Cada barbeiro possui um conjunto de horários disponíveis para agendamento
sig Barbeiro extends Usuario {
    horariosDisponiveis: set Horario
}

-- Agendamento de serviço: relaciona cliente, barbeiro, serviço e horário
sig Agendamento {
    cliente: one Cliente,
    barbeiro: one Barbeiro,
    servico: one Servico,
    horario: one Horario
}

-- Invariantes/Fatos do sistema


fact NomesServicosUnicos {
    all disj s1, s2: Servico | s1.nome != s2.nome
}

fact UsuariosComEmailUnico {
    -- Supondo que cada usuário tem um email único
    all disj u1, u2: Usuario | u1 != u2 implies u1 not in u2
}

fact HorariosDisponiveisValidos {
    -- Qualquer agendamento só pode ocorrer em horário disponível do barbeiro
    all a: Agendamento | a.horario in a.barbeiro.horariosDisponiveis
}

fact SemConflitoDeAgendamento {
    -- Não permitir dois agendamentos no mesmo horário para um mesmo barbeiro
    all disj a1, a2: Agendamento | a1.barbeiro = a2.barbeiro => a1.horario != a2.horario
}

fact ClienteNaoPodeTerDoisAgendamentosNoMesmoHorario {
    -- Não permitir dois agendamentos no mesmo horário para um mesmo cliente
    all disj a1, a2: Agendamento | a1.cliente = a2.cliente => a1.horario != a2.horario
}

-- Verificações


assert SemSobreposicao {
    all disj a1, a2: Agendamento | a1.barbeiro != a2.barbeiro or a1.horario != a2.horario
}
check SemSobreposicao

-- Verifica se um barbeiro não possui dois agendamentos no mesmo horário
assert SemAgendamentoDuplicado {
    all disj a1, a2: Agendamento | a1.barbeiro = a2.barbeiro and a1.horario = a2.horario implies a1 = a2
}
check SemAgendamentoDuplicado

-- Verifica se todo agendamento utiliza um horário disponível do barbeiro
assert AgendamentoEmHorarioDisponivel {
    all a: Agendamento | a.horario in a.barbeiro.horariosDisponiveis
}
check AgendamentoEmHorarioDisponivel

-- Verifica se cada agendamento possui exatamente um cliente
assert AgendamentoTemUmCliente {
    all a: Agendamento | one a.cliente
}
check AgendamentoTemUmCliente

-- Verifica se cada agendamento possui exatamente um serviço
assert AgendamentoTemUmServico {
    all a: Agendamento | one a.servico
}
check AgendamentoTemUmServico

-- Todo horário utilizado em um agendamento pertence a algum barbeiro
assert HorarioUtilizadoPertenceABarbeiro {
    all a: Agendamento | some b: Barbeiro | a.horario in b.horariosDisponiveis
}
check HorarioUtilizadoPertenceABarbeiro

run {} for 3 but exactly 1 Administrador, 2 Barbeiro, 3 Cliente, 4 Servico, 5 Horario
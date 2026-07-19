import api from "@/app/api/auth/api";

export interface Agendamento {
  id: string;
  data: string;
  horariosDisponiveis: string[];
}

export interface NovoAgendamento {
  data: string;
  horariosDisponiveis: string[];
}

export interface DisponibilidadeAgendamento {
  id: string;
  data: string;
  diaSemana: string;
  horariosDisponiveis: string[];
}

export async function criarAgendamento(
  data: NovoAgendamento,
): Promise<Agendamento> {
  const response = await api.post<Agendamento>("/agendamentos", data);

  return response.data;
}

export async function getAgendamentos(): Promise<Agendamento[]> {
  const response = await api.get<Agendamento[]>("/agendamentos");

  return response.data;
}

export async function getDisponibilidade(
  data: string,
): Promise<DisponibilidadeAgendamento> {
  const response = await api.get<DisponibilidadeAgendamento>(
    `/agendamentos/disponibilidade?data=${data}`,
  );

  return response.data;
}

export async function getAgendamento(id: string): Promise<Agendamento> {
  const response = await api.get<Agendamento>(`/agendamentos/${id}`);

  return response.data;
}

export async function updateAgendamento(
  id: string,
  data: NovoAgendamento,
): Promise<Agendamento> {
  const response = await api.put<Agendamento>(`/agendamentos/${id}`, data);

  return response.data;
}

export async function deleteAgendamento(id: string): Promise<void> {
  await api.delete(`/agendamentos/${id}`);
}

import api from "@/app/api/auth/api";

export type StatusAtendimento = "CONFIRMADO" | "PENDENTE" | "CANCELADO" | "AGENDADO";

// Espelha o AtendimentoResponseDTO do backend
export interface Atendimento {
  id: string;
  emailClient: string;
  data: string | null; // ISO (yyyy-MM-dd), pode ser nulo em registros antigos
  hora: string;
  nomeServico: string;
  precoServico: number;
  status: StatusAtendimento;
}

export interface NovoAtendimentoAdmin {
  emailClient: string;
  servicoId: string;
  data: string; // yyyy-MM-dd
  hora: string;
  status: StatusAtendimento;
}

//Interface criada para agendamento do cliente
export interface NovoAtendimentoCliente {
  servicoId: string;
  data: string;
  horarioEscolhido: string;
}

export async function getAtendimentos(): Promise<Atendimento[]> {
  const response = await api.get<Atendimento[]>("atendimentos");
  return response.data;
}

export async function getAtendimentosPorCliente(email: string): Promise<Atendimento[]> {
  const response = await api.get<Atendimento[]>(`atendimentos/cliente/${encodeURIComponent(email)}`);
  return response.data;
}

export async function criarAtendimentoAdmin(data: NovoAtendimentoAdmin): Promise<Atendimento> {
  const response = await api.post<Atendimento>("atendimentos/admin", data);
  return response.data;
}

//Função criada para realizar o agendamento por parte do cliente
export async function criarAtendimento(dados: NovoAtendimentoCliente) {
  const response = await api.post("atendimentos", dados);
  return response.data;
}

export async function cancelarAtendimento(id: string): Promise<Atendimento> {
  const response = await api.patch<Atendimento>(`atendimentos/${id}/cancelar`);
  return response.data;
}

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

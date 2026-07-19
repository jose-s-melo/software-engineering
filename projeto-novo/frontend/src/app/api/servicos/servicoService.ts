import api from "@/app/api/auth/api";
import { Servico } from "@/types/servico";

interface ServicoDTO {
  id: string;
  name: string;
  price: number;
  estimatedTime: string;
  description: string;
}

interface ServicoRequestDTO {
  name: string;
  description: string;
  price: number;
  estimatedTime: string;
}

function toServico(dto: ServicoDTO): Servico {
  return {
    id: dto.id,
    serviceName: dto.name,
    price: dto.price,
    description: dto.description,
    estimatedTime: dto.estimatedTime,
  };
}

function toServicoRequest(data: Omit<Servico, "id">): ServicoRequestDTO {
  return {
    name: data.serviceName,
    description: data.description,
    price: data.price,
    estimatedTime: data.estimatedTime,
  };
}

export async function getServicos(): Promise<Servico[]> {
  const response = await api.get<ServicoDTO[]>("/servicos");

  return response.data.map(toServico);
}

export async function getServico(id: string): Promise<Servico> {
  const response = await api.get<ServicoDTO>(`/servicos/${id}`);

  return toServico(response.data);
}

export async function createServico(
  data: Omit<Servico, "id">,
): Promise<Servico> {
  const response = await api.post<ServicoDTO>(
    "/servicos",
    toServicoRequest(data),
  );

  return toServico(response.data);
}

export async function updateServico(
  id: string,
  data: Omit<Servico, "id">,
): Promise<Servico> {
  const response = await api.put<ServicoDTO>(
    `/servicos/${id}`,
    toServicoRequest(data),
  );

  return toServico(response.data);
}

export async function deleteServico(id: string): Promise<void> {
  await api.delete(`/servicos/${id}`);
}

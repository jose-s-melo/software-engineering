import api from "@/app/api/auth/api";
import { Servico } from "@/types/servico";

// DTO como o backend retorna (ServicoResponseDTO): { id, nome, preco, tempoEstimado }
interface ServicoDTO {
  id: string;
  nome: string;
  preco: number;
  tempoEstimado: string;
}

function toServico(dto: ServicoDTO): Servico {
  return {
    id: dto.id,
    serviceName: dto.nome,
    price: dto.preco,
    description: dto.tempoEstimado,
  };
}

export async function getServicos(): Promise<Servico[]> {
  const response = await api.get<ServicoDTO[]>("servicos");
  return response.data.map(toServico);
}

import api from "@/app/api/auth/api";
import { Cliente } from "@/types/cliente";

// DTO como o backend retorna (ClientResponseDTO): { id, name, phone, email }
interface ClientDTO {
  id: string;
  name: string;
  phone: string;
  email: string;
}

function toCliente(dto: ClientDTO): Cliente {
  return {
    id: dto.id,
    clientName: dto.name,
    clientPhone: dto.phone,
    clientEmail: dto.email,
  };
}

function toClientRequest(data: Omit<Cliente, "id">) {
  return {
    name: data.clientName,
    phone: data.clientPhone,
    email: data.clientEmail,
  };
}

export async function getClients(): Promise<Cliente[]> {
  const response = await api.get<ClientDTO[]>("users/clients");
  return response.data.map(toCliente);
}

export async function getClient(id: string): Promise<Cliente> {
  const response = await api.get<ClientDTO>(`users/clients/${id}`);
  return toCliente(response.data);
}

export async function createClient(data: Omit<Cliente, "id">): Promise<Cliente> {
  const response = await api.post<ClientDTO>("users/clients", toClientRequest(data));
  return toCliente(response.data);
}

export async function updateClient(id: string, data: Omit<Cliente, "id">): Promise<Cliente> {
  const response = await api.put<ClientDTO>(`users/clients/${id}`, toClientRequest(data));
  return toCliente(response.data);
}

export async function deleteClient(id: string): Promise<void> {
  await api.delete(`users/clients/${id}`);
}

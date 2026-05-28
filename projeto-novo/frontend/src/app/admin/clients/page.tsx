"use client";

import { useState } from "react";

import Button from "@/components/ui/Button";
import Input from "@/components/ui/Input";
import PageHeader from "@/components/ui/PageHeader";
import TableContainer from "@/components/ui/TableContainer";

import ClientTable from "@/components/tables/ClientTable";

import { Cliente } from "@/types/cliente";

const clientesMock: Cliente[] = [
  {
    id: "1",
    clientName: "Lucas Henrique",
    clientPhone: "(83) 99999-9999",
    clientEmail: "lucas@email.com",
  },
  {
    id: "2",
    clientName: "João Pedro",
    clientPhone: "(83) 98888-8888",
    clientEmail: "joao@email.com",
  },
  {
    id: "3",
    clientName: "Carlos Eduardo",
    clientPhone: "(83) 97777-7777",
    clientEmail: "carlos@email.com",
  },
];

export default function ClientesAdminPage() {
  const [search, setSearch] = useState("");

  const clientesFiltrados = clientesMock.filter((cliente) =>
cliente.clientName.toLowerCase().includes(search.toLowerCase())
  );

  return (
    <div className="min-h-screen p-10">
      <PageHeader
        title="Gestão de Clientes"
        description="Gerencie os clientes cadastrados da barbearia."
      />

        <Button>
          + Novo Cliente
        </Button>
      
      
      <div
        className="
          bg-white
          border-4
          border-[#0A192F]
          p-6
          mt-4
          mb-6
          shadow-[8px_8px_0px_0px_rgba(139,0,0,1)]
        "
      >
        <Input
          placeholder="Buscar cliente..."
          value={search}
          onChange={(e) => setSearch(e.target.value)}
          />
      </div>

        <TableContainer>
          {clientesFiltrados.length > 0 ? (
            <ClientTable clients={clientesFiltrados} />
          ) : (
            <div className="p-10 text-center text-gray-500">
            Nenhum cliente encontrado.
          </div>
          )
        }
        </TableContainer>
    </div>
  );
}
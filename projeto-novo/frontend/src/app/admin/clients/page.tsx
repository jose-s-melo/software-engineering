"use client";

import { useState } from "react";

import Button from "@/components/ui/Button";
import Input from "@/components/ui/Input";
import PageHeader from "@/components/ui/PageHeader";
import TableContainer from "@/components/ui/TableContainer";
import Modal from "@/components/ui/Modal";

import ClientTable from "@/components/tables/ClientTable";
import ClientForm from "@/components/forms/ClientForm";

import { Cliente } from "@/types/cliente";
import ClientAppointmentsModal from "@/components/modals/ClientAppointmentsModal";

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
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [selectedClient, setSelectedClient] = useState<Cliente | null>(null);
  const [clientes, setClientes] = useState<Cliente[]>(clientesMock);
  const [isAppointmentsModalOpen, setIsAppointmentsModalOpen] = useState(false);

  const handleCreateClient = (client: Cliente) => {
    setClientes((prev) => [...prev, { ...client, id: String(prev.length + 1) }]);
  }

  const handleUpdateClient = (updatedClient: Cliente) => {
    setClientes(
      (prev) => 
        prev.map((client) => 
          client.id === updatedClient.id ? updatedClient : client
      )
    );
  }

  const handleDeleteClient = (clientId: string) => {
    setClientes((prev) => prev.filter((client) => client.id !== clientId));
  }

  const handleSubmitClient = (client: Cliente) => {
    if (selectedClient) {
      handleUpdateClient(client);
    } else {
      handleCreateClient(client);
    }

    setIsModalOpen(false);
  }

  const handleEdit = (client: Cliente) => {
    setSelectedClient(client);
    setIsModalOpen(true);
  }

  const handleManageAppointments = (client: Cliente) => {
    setSelectedClient(client);
    setIsAppointmentsModalOpen(true);
  }

  const clientesFiltrados = clientes.filter((cliente) =>
cliente.clientName.toLowerCase().includes(search.toLowerCase())
  );

  return (
    <div className="min-h-screen p-10">
      <PageHeader
        title="Gestão de Clientes"
        description="Gerencie os clientes cadastrados da barbearia."
      />

        <Button onClick={() => {
          setSelectedClient(null);
          setIsModalOpen(true)
        }}>
          + Novo Cliente
        </Button>
      
        {isModalOpen && (
          <div
            className="
              fixed inset-0
              bg-black/50
              flex items-center justify-center
              z-50
              p-5
            "
          >
            <ClientForm
              initialData={selectedClient || undefined}
              onClose={() => setIsModalOpen(false)}
              onSubmit={handleSubmitClient}
            />
          </div>
        )}
      
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
            <ClientTable 
            clients={clientesFiltrados}
            onEdit={handleEdit}
            onDelete={handleDeleteClient}
            onManageAppointments={handleManageAppointments}
             />
          ) : (
            <div className="p-10 text-center text-gray-500">
            Nenhum cliente encontrado.
          </div>
          )
        }
        </TableContainer>

        <ClientAppointmentsModal
          clientId={selectedClient?.id || ""}
          clientName={selectedClient?.clientName || ""}
          isOpen={isAppointmentsModalOpen}
          onClose={() => setIsAppointmentsModalOpen(false)}
        />
    </div>
  );
}
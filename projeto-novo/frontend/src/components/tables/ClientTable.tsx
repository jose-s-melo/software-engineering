import { Cliente } from "@/types/cliente";
import Button from "../ui/Button";

import { useState } from "react";
import ClientForm from "../forms/ClientForm";

type ClientTableProps = {
  clients: Cliente[];
  onEdit: (client: Cliente) => void;
  onDelete: (clientId: string) => void;
  onManageAppointments: (client: Cliente) => void;
};

export default function ClientTable({
  clients,
  onEdit,
  onDelete,
  onManageAppointments,
}: ClientTableProps) {

  return (
    <table className="w-full border-collapse">
      <thead className="bg-[#0A192F] text-white uppercase">
        <tr>
          <th className="p-5 text-left text-sm tracking-widest font-black">
            Nome
          </th>

          <th className="p-5 text-left text-sm tracking-widest font-black">
            Telefone
          </th>

          <th className="p-5 text-left text-sm tracking-widest font-black">
            Email
          </th>

          <th className="p-5 text-left text-sm tracking-widest font-black">
            Ações
          </th>
        </tr>
      </thead>

      <tbody>
        {clients.map((client) => (
          <tr key={client.id}>
            <td className="p-5 font-semibold">
              {client.clientName}
            </td>

            <td className="p-5 font-semibold">
              {client.clientPhone}
            </td>

            <td className="p-5 font-semibold">
              {client.clientEmail}
            </td>

            <td className="p-5 font-semibold">
              <div className="flex gap-3">
                <Button
                  variant="primary"
                  onClick={() => onEdit(client)}
                >
                  Editar
                </Button>

                <Button variant="danger" onClick={() => onDelete(client.id)}>
                  Excluir
                </Button>

                <Button variant="utility" onClick={ () => onManageAppointments(client)}>
                  Gerenciar Agendamentos
                </Button>
              </div>
            </td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}
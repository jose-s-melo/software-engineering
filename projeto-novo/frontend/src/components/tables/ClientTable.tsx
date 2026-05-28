import { Cliente } from "@/types/cliente";
import Button from "../ui/Button";

type ClientTableProps = {
  clients: Cliente[];
};

export default function ClientTable({
  clients,
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
                <Button variant="primary">
                  Editar
                </Button>

                <Button variant="danger">
                  Excluir
                </Button>
              </div>
            </td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}
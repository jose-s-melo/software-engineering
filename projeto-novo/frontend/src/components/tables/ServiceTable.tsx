import { Servico } from "@/types/servico";
import Button from "../ui/Button";
import { formatCurrency } from "@/utils/formatCurrency";

type ServiceTableProps = {
  services: Servico[];
  onEdit: (service: Servico) => void;
  onDelete: (serviceId: string) => void;
};

export default function ServiceTable({
  services,
  onEdit,
  onDelete,
}: ServiceTableProps) {
  return (
    <table className="w-full border-collapse">
      <thead className="bg-[#0A192F] text-white uppercase">
        <tr>
          <th className="p-5 text-left text-sm tracking-widest font-black">
            Nome
          </th>

          <th className="p-5 text-left text-sm tracking-widest font-black">
            Preço
          </th>

          <th className="p-5 text-left text-sm tracking-widest font-black">
            Descrição
          </th>

          <th className="p-5 text-left text-sm tracking-widest font-black">
            Ações
          </th>
        </tr>
      </thead>

      <tbody>
        {services.map((service) => (
          <tr key={service.id}>
            <td className="p-5 font-semibold">
              {service.serviceName}
            </td>

            <td className="p-5 font-semibold">
                {formatCurrency(service.price)}
            </td>

            <td className="p-5 font-semibold">
              {service.description}
            </td>

            <td className="p-5 font-semibold">
              <div className="flex gap-3">
                <Button variant="primary"
                        onClick={() => onEdit(service)}>
                  Editar
                </Button>

                <Button variant="danger"
                        onClick={() => onDelete(service.id)}>
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
"use client";

import { useState } from "react";

import Button from "@/components/ui/Button";
import Input from "@/components/ui/Input";
import PageHeader from "@/components/ui/PageHeader";
import TableContainer from "@/components/ui/TableContainer";

import { Servico } from "@/types/servico";
import ServiceTable from "@/components/tables/ServiceTable";
import ServiceForm from "@/components/forms/ServiceForm";

const servicosMock: Servico[] = [
  {
    id: "1",
    serviceName: "Corte + Barba",
    price: 35.00,
    description: "Serviço básico de corte e barba, incluindo lavagem e finalização.",
  },
  {
    id: "2",
    serviceName: "Coloração",
    price: 30.00,
    description: "Serviço de coloração completa, incluindo lavagem e finalização.",
  },
  {
    id: "3",
    serviceName: "Barba Tradicional",
    price: 20.00,
    description: "Serviço básico de barba, incluindo corte e finalização.",
  },
  {
    id: "4",
    serviceName: "Corte Clássico",
    price: 20.00,
    description: "Serviço básico de corte clássico, incluindo lavagem e finalização.",
  },
  {
    id: "5",
    serviceName: "Pigmentação",
    price: 20.00,
    description: "Serviço básico de corte clássico, incluindo lavagem e finalização.",
  }
];

export default function ServicosAdminPage() {
  const [search, setSearch] = useState("");
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [servicos, setServicos] = useState<Servico[]>(servicosMock);
  const [selectedService, setSelectedService] = useState<Servico | null>(null);

  const servicosFiltrados = servicos.filter((servico) =>
    servico.serviceName.toLowerCase().includes(search.toLowerCase())
  );

  const handleCreateService = (servico: Servico) => {
    setServicos((prev) => [...prev, { ...servico, id: String(prev.length + 1) }]);
  };

  const handleUpdateService = (updatedServico: Servico) => {
    setServicos((prev) =>
      prev.map((servico) =>
        servico.id === updatedServico.id ? updatedServico : servico
      )
    );
  };

  
  const handleDeleteService = (serviceId: string) => {
    setServicos((prev) => prev.filter((servico) => servico.id !== serviceId));
    
  }

  const handleSubmitService = (servico: Servico) => {
    if(selectedService) {
      handleUpdateService(servico);
    } else {
      handleCreateService(servico);
    }
  };

  const handleEdit = (servico: Servico) => {
    setSelectedService(servico);
    setIsModalOpen(true);
  }

  return (
    <div className="min-h-screen p-10">
      <PageHeader
        title="Gestão de Serviços"
        description="Gerencie os serviços cadastrados da barbearia."
      />

        <Button onClick={() => {
          setSelectedService(null);
          setIsModalOpen(true);
        }}>
          + Novo Serviço
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
                    <ServiceForm
                      initialData={selectedService || undefined}
                      onClose={() => setIsModalOpen(false)}
                      onSubmit={handleSubmitService}
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
          placeholder="Buscar serviço..."
          value={search}
          onChange={(e) => setSearch(e.target.value)}
          />
      </div>

        <TableContainer>
          {servicosFiltrados.length > 0 ? (
            <ServiceTable 
              services={servicosFiltrados}
              onEdit={handleEdit}
              onDelete={handleDeleteService}
             />
          ) : (
            <div className="p-10 text-center text-gray-500">
            Nenhum serviço encontrado.
          </div>
          )
        }
        </TableContainer>
    </div>
  );
}
"use client";

import { useState } from "react";

import Input from "@/components/ui/Input";
import Button from "@/components/ui/Button";

import { Servico } from "@/types/servico";

import { formatCurrency } from "@/utils/formatCurrency";

type ServiceFormProps = {
    initialData?: Servico;
    onClose: () => void;
    onSubmit: (servico: Servico) => void;
};

export default function ServiceForm({
    initialData,
    onClose,
    onSubmit
}: ServiceFormProps) {
    const [formData, setFormData] = useState({
        serviceName: initialData?.serviceName || "",
        price: initialData?.price || 0,
        description: initialData?.description || "",
    });

    const handleSubmit = (e: React.FormEvent) => {
        e.preventDefault();

        onSubmit({
            id: initialData?.id || crypto.randomUUID(),
            ...formData,
        });

        if(onClose) {
            onClose();
        }

    };

    const isEditing = !!initialData;

    return (
    <div
      className="
        bg-white
        border-4 border-[#0A192F]
        p-8
        w-full
        max-w-xl
        shadow-[10px_10px_0px_0px_rgba(139,0,0,1)]
        relative
      "
    >
      <button
        onClick={onClose}
        className="
          absolute
          top-4
          right-4
          text-xl
          font-black
          text-[#0A192F]
        "
      >
        X
      </button>

      <h2
        className="
          text-3xl
          font-black
          uppercase
          italic
          text-[#0A192F]
          mb-6
        "
      >
        {isEditing ? `Editar Serviço` : `Novo Serviço`}
      </h2>

      <form
        onSubmit={handleSubmit}
        className="flex flex-col gap-4"
      >
        <Input
          placeholder="Nome do serviço"
          value={formData.serviceName}
          onChange={(e) =>
            setFormData({
              ...formData,
              serviceName: e.target.value,
            })
          }
        />

        <Input
          placeholder="Preço"
          value={formatCurrency(formData.price)}
          onChange={(e) =>{

            const rawValue = e.target.value.replace(/\D/g, "");

            const numericValue = Number(rawValue) / 100;
            setFormData({
                ...formData,
                price: numericValue,
            })
          }

          }
        />

        <Input
          placeholder="Descrição"
          value={formData.description}
          onChange={(e) =>
            setFormData({
              ...formData,
              description: e.target.value,
            })
          }
        />

        <Button type="submit">
          Salvar Serviço
        </Button>
      </form>
    </div>
  );
}
"use client";

import { useState } from "react";

import Input from "@/components/ui/Input";
import Button from "@/components/ui/Button";

import { Cliente } from "@/types/cliente";

import { formatPhone } from "@/utils/formatPhone";

type ClientFormProps = {
    initialData?: Cliente;
    onClose: () => void;
    onSubmit: (cliente: Cliente) => void;
};

export default function ClientForm({
    initialData,
    onClose,
    onSubmit
}: ClientFormProps) {
    const [formData, setFormData] = useState({
        clientName: initialData?.clientName || "",
        clientPhone: initialData?.clientPhone || "",
        clientEmail: initialData?.clientEmail || "",
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
        {isEditing ? `Editar Cliente` : `Novo Cliente`}
      </h2>

      <form
        onSubmit={handleSubmit}
        className="flex flex-col gap-4"
      >
        <Input
          placeholder="Nome do cliente"
          value={formData.clientName}
          onChange={(e) =>
            setFormData({
              ...formData,
              clientName: e.target.value,
            })
          }
        />

        <Input
          placeholder="Telefone"
          value={formData.clientPhone}
          onChange={(e) => {

            const rawValue = e.target.value;
            const formattedValue = formatPhone(rawValue);   
            
            setFormData({
                ...formData,
                clientPhone: formattedValue,
            })
          }
          }
        />

        <Input
          placeholder="Email"
          value={formData.clientEmail}
          onChange={(e) =>
            setFormData({
              ...formData,
              clientEmail: e.target.value,
            })
          }
        />

        <Button type="submit">
          Salvar Cliente
        </Button>
      </form>
    </div>
  );
}
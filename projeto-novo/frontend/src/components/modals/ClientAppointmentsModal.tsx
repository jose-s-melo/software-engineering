"use client";

import { useEffect, useState } from "react";
import Modal from "@/components/ui/Modal";
import TableContainer from "@/components/ui/TableContainer";
import Button from "@/components/ui/Button";
import { getAtendimentosPorCliente, Atendimento, StatusAtendimento } from "@/app/api/atendimentos/atendimentoService";

type ClientAppointmentsModalProps = {
    clientId: string;
    clientName: string;
    clientEmail: string;
    isOpen: boolean;
    onClose: () => void;
}

const STATUS_LABELS: Record<StatusAtendimento, string> = {
    CONFIRMADO: "Confirmado",
    PENDENTE: "Pendente",
    CANCELADO: "Cancelado",
    AGENDADO: "Agendado",
};

function formatDate(iso: string | null) {
    if (!iso) return "-";
    const [year, month, day] = iso.split("-");
    return `${day}/${month}/${year}`;
}

export default function ClientAppointmentsModal({
    clientId,
    clientName,
    clientEmail,
    isOpen,
    onClose

}: ClientAppointmentsModalProps) {
    const [clientAppointments, setClientAppointments] = useState<Atendimento[]>([]);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState<string | null>(null);

    useEffect(() => {
        if (!isOpen || !clientEmail) return;

        let ativo = true;
        setLoading(true);
        setError(null);

        getAtendimentosPorCliente(clientEmail)
            .then((data) => {
                if (ativo) setClientAppointments(data);
            })
            .catch(() => {
                if (ativo) setError("Não foi possível carregar os agendamentos deste cliente.");
            })
            .finally(() => {
                if (ativo) setLoading(false);
            });

        return () => {
            ativo = false;
        };
    }, [isOpen, clientEmail]);

    return (
        <Modal 
            isOpen={isOpen}
            onClose={onClose}>
        <div className="w-full max-w-3xl">
            <div className="mb-6">
            <h2 className="text-3xl font-black uppercase italic text-[#0A192F]">
                Agendamentos
            </h2>

            <p className="text-[#8B0000] font-bold mt-2">
                Cliente: {clientName}
            </p>
            </div>

            <TableContainer>
            <table className="w-full border-collapse">
                <thead className="bg-[#0A192F] text-white uppercase">
                <tr>
                    <th className="p-5 text-left text-sm tracking-widest font-black">
                    Serviço
                    </th>

                    <th className="p-5 text-left text-sm tracking-widest font-black">
                    Data
                    </th>

                    <th className="p-5 text-left text-sm tracking-widest font-black">
                    Horário
                    </th>

                    <th className="p-5 text-left text-sm tracking-widest font-black">
                    Status
                    </th>
                </tr>
                </thead>

                <tbody>
                {loading ? (
                    <tr>
                        <td colSpan={4} className="p-5 text-center text-[#6B6B6B]">
                            Carregando agendamentos...
                        </td>
                    </tr>
                ) : error ? (
                    <tr>
                        <td colSpan={4} className="p-5 text-center text-red-700">
                            {error}
                        </td>
                    </tr>
                ) : clientAppointments.length === 0 ? (
                    <tr>
                        <td colSpan={4} className="p-5 text-center text-[#6B6B6B]">
                            Nenhum agendamento encontrado para este cliente.
                        </td>
                    </tr>
                ) : (
                    clientAppointments.map((appointment) => (
                        <tr
                        key={appointment.id}
                        className="border-t-2 border-[#E5E3DF]"
                        >
                        <td className="p-5 font-semibold">
                            {appointment.nomeServico}
                        </td>

                        <td className="p-5">
                            {formatDate(appointment.data)}
                        </td>

                        <td className="p-5">
                            {appointment.hora}
                        </td>

                        <td className="p-5">
                            <span
                            className={`
                                px-3 py-2
                                text-xs
                                font-black
                                uppercase
                                border-2
                                ${
                                appointment.status === "CONFIRMADO"
                                    ? "bg-green-100 border-green-700 text-green-700"
                                    : appointment.status === "CANCELADO"
                                    ? "bg-red-100 border-red-700 text-red-700"
                                    : "bg-yellow-100 border-yellow-700 text-yellow-700"
                                }
                            `}
                            >
                            {STATUS_LABELS[appointment.status]}
                            </span>
                        </td>
                        </tr>
                    ))
                )}
                </tbody>
            </table>
            </TableContainer>

            <div className="flex justify-end mt-6">
            <Button variant="outline" onClick={onClose}>
                Fechar
            </Button>
            </div>
        </div>
        </Modal>
    );
    }
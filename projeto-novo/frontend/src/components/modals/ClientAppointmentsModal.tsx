"use client";

import Modal from "@/components/ui/Modal";
import TableContainer from "@/components/ui/TableContainer";
import Button from "@/components/ui/Button";

type ClientAppointmentsModalProps = {
    clientId: string;
    clientName: string;
    isOpen: boolean;
    onClose: () => void;
}

type Appointment = {
  id: string;
  serviceName: string;
  date: string;
  hour: string;
  status: string;
  clientId: string;
};

const appointmentsMock: Appointment[] = [
    {
        id: "1",
        serviceName: "Corte Clássico",
        date: "28/05/2026",
        hour: "14:00",
        status: "Confirmado",
        clientId: "1",
    },
    {
        id: "2",
        serviceName: "Barba Tradicional",
        date: "03/06/2026",
        hour: "16:30",
        status: "Pendente",
        clientId: "2",
    },
];

export default function ClientAppointmentsModal({
    clientId,
    clientName,
    isOpen,
    onClose

}: ClientAppointmentsModalProps) {
    const clientAppointments = appointmentsMock.filter(
        (appointment) => appointment.clientId === clientId
    )

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
                {clientAppointments.map((appointment) => (
                    <tr
                    key={appointment.id}
                    className="border-t-2 border-[#E5E3DF]"
                    >
                    <td className="p-5 font-semibold">
                        {appointment.serviceName}
                    </td>

                    <td className="p-5">
                        {appointment.date}
                    </td>

                    <td className="p-5">
                        {appointment.hour}
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
                            appointment.status === "Confirmado"
                                ? "bg-green-100 border-green-700 text-green-700"
                                : "bg-yellow-100 border-yellow-700 text-yellow-700"
                            }
                        `}
                        >
                        {appointment.status}
                        </span>
                    </td>
                    </tr>
                ))}
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
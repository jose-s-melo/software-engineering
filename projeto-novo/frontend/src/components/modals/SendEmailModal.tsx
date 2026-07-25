"use client";

import { useState } from "react";
import Modal from "@/components/ui/Modal";
import Button from "@/components/ui/Button";
import { sendEmail } from "@/app/api/email/emailService";

type SendEmailModalProps = {
  clientEmail: string;
  clientName: string;
  isOpen: boolean;
  onClose: () => void;
};

export default function SendEmailModal({ clientEmail, clientName, isOpen, onClose }: SendEmailModalProps) {
  const [subject, setSubject] = useState("");
  const [text, setText] = useState("");
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);
  const [success, setSuccess] = useState(false);

  const handleClose = () => {
    setSubject("");
    setText("");
    setError(null);
    setSuccess(false);
    onClose();
  };

  const handleSend = async () => {
    if (!subject || !text) {
      setError("Preencha assunto e mensagem.");
      return;
    }

    setLoading(true);
    setError(null);

    try {
      await sendEmail({ emailTo: clientEmail, subject, text });
      setSuccess(true);
      setSubject("");
      setText("");
    } catch (err) {
      console.error(err);
      setError("Não foi possível enviar o e-mail.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <Modal isOpen={isOpen} onClose={handleClose}>
      <div className="w-full max-w-lg">
        <h2 className="text-2xl font-black uppercase italic text-[#0A192F] mb-1">
          Enviar E-mail
        </h2>
        <p className="text-[#8B0000] font-bold mb-6">
          Para: {clientName} ({clientEmail})
        </p>

        <div className="mb-4">
          <label className="block text-xs font-black uppercase tracking-widest text-[#0A192F] mb-2">
            Assunto
          </label>
          <input
            type="text"
            value={subject}
            onChange={(e) => setSubject(e.target.value)}
            className="w-full p-3 border-2 border-[#0A192F]"
            placeholder="Assunto do e-mail"
          />
        </div>

        <div className="mb-6">
          <label className="block text-xs font-black uppercase tracking-widest text-[#0A192F] mb-2">
            Mensagem
          </label>
          <textarea
            value={text}
            onChange={(e) => setText(e.target.value)}
            rows={5}
            className="w-full p-3 border-2 border-[#0A192F]"
            placeholder="Escreva a mensagem para o cliente..."
          />
        </div>

        {error && (
          <div className="mb-4 p-3 bg-red-100 border-2 border-red-700 text-red-700 text-sm font-semibold">
            {error}
          </div>
        )}

        {success && (
          <div className="mb-4 p-3 bg-green-100 border-2 border-green-700 text-green-700 text-sm font-semibold">
            E-mail enviado com sucesso!
          </div>
        )}

        <div className="flex justify-end gap-3">
          <Button variant="outline" onClick={handleClose}>
            Fechar
          </Button>
          <Button variant="primary" onClick={handleSend} disabled={loading}>
            {loading ? "Enviando..." : "Enviar"}
          </Button>
        </div>
      </div>
    </Modal>
  );
}

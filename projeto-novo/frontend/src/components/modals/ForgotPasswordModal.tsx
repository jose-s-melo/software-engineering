"use client";

import { useState } from "react";
import { forgotPassword, confirmForgotPassword } from "@/app/api/auth/authService";

const COLORS = {
  red: "#C8102E",
  redDark: "#9B0C21",
  redLight: "#FDEAEA",
  blue: "#1A3A6B",
  blueMid: "#1E4D8C",
  blueLight: "#E8EEF7",
  green: "#1E7E34",
  greenLight: "#E6F4EA",
  white: "#FFFFFF",
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  text: "#1A1A1A",
};

const inputStyle = {
  width: "100%",
  padding: "13px 14px",
  border: `1.5px solid ${COLORS.grayLight}`,
  borderRadius: 10,
  fontSize: 15,
  fontFamily: "'Playfair Display', Georgia, serif",
  boxSizing: "border-box" as const,
  outline: "none",
};

const labelStyle = {
  display: "block",
  fontSize: 12,
  fontWeight: 600,
  color: COLORS.blue,
  letterSpacing: "0.08em",
  textTransform: "uppercase" as const,
  marginBottom: 6,
};

type ForgotPasswordModalProps = {
  isOpen: boolean;
  onClose: () => void;
};

export default function ForgotPasswordModal({ isOpen, onClose }: ForgotPasswordModalProps) {
  const [step, setStep] = useState<1 | 2>(1);
  const [email, setEmail] = useState("");
  const [code, setCode] = useState("");
  const [newPassword, setNewPassword] = useState("");
  const [confirmPassword, setConfirmPassword] = useState("");
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");
  const [success, setSuccess] = useState(false);

  const reset = () => {
    setStep(1);
    setEmail("");
    setCode("");
    setNewPassword("");
    setConfirmPassword("");
    setError("");
    setSuccess(false);
    setLoading(false);
  };

  const handleClose = () => {
    reset();
    onClose();
  };

  const handleSendCode = async () => {
    setError("");
    if (!email || !email.includes("@")) {
      setError("Informe um e-mail válido.");
      return;
    }
    setLoading(true);
    try {
      await forgotPassword(email);
      setStep(2);
    } catch (err) {
      console.error(err);
      setError("Não foi possível enviar o código. Verifique o e-mail informado.");
    } finally {
      setLoading(false);
    }
  };

  const handleConfirm = async () => {
    setError("");
    if (!code || !newPassword || !confirmPassword) {
      setError("Preencha todos os campos.");
      return;
    }
    if (newPassword !== confirmPassword) {
      setError("A nova senha e a confirmação não coincidem.");
      return;
    }
    setLoading(true);
    try {
      await confirmForgotPassword({ email, code, newPassword });
      setSuccess(true);
    } catch (err) {
      console.error(err);
      setError("Código inválido ou expirado. Tente solicitar um novo código.");
    } finally {
      setLoading(false);
    }
  };

  if (!isOpen) return null;

  return (
    <div
      style={{
        position: "fixed",
        inset: 0,
        background: "rgba(26,26,26,0.55)",
        display: "flex",
        alignItems: "center",
        justifyContent: "center",
        zIndex: 50,
        padding: 16,
      }}
    >
      <div
        style={{
          width: "100%",
          maxWidth: 420,
          background: COLORS.white,
          borderRadius: 20,
          padding: "40px 36px",
          boxShadow: "0 8px 40px rgba(26,58,107,0.25)",
          position: "relative",
          fontFamily: "'Playfair Display', Georgia, serif",
        }}
      >
        <button
          onClick={handleClose}
          style={{
            position: "absolute",
            top: 18,
            right: 18,
            background: "none",
            border: "none",
            fontSize: 18,
            fontWeight: 700,
            color: COLORS.gray,
            cursor: "pointer",
          }}
        >
          ✕
        </button>

        {success ? (
          <>
            <h2 style={{ fontSize: 22, fontWeight: 700, color: COLORS.blue, margin: "0 0 12px" }}>
              Senha redefinida!
            </h2>
            <p style={{ color: COLORS.gray, fontSize: 14, marginBottom: 24 }}>
              Sua senha foi alterada com sucesso. Faça login novamente com a nova senha.
            </p>
            <button
              onClick={handleClose}
              style={{
                width: "100%",
                padding: 14,
                background: COLORS.blue,
                color: COLORS.white,
                border: "none",
                borderRadius: 10,
                fontSize: 15,
                fontWeight: 700,
                cursor: "pointer",
              }}
            >
              Fechar
            </button>
          </>
        ) : step === 1 ? (
          <>
            <h2 style={{ fontSize: 22, fontWeight: 700, color: COLORS.blue, margin: "0 0 4px" }}>
              Esqueci minha senha
            </h2>
            <p style={{ color: COLORS.gray, fontSize: 14, margin: "0 0 24px" }}>
              Informe seu e-mail para receber um código de verificação.
            </p>

            <div style={{ marginBottom: 18 }}>
              <label style={labelStyle}>E-mail</label>
              <input
                type="email"
                value={email}
                onChange={(e) => setEmail(e.target.value)}
                placeholder="seu@email.com"
                style={inputStyle}
              />
            </div>

            {error && (
              <div style={{ background: COLORS.redLight, border: `1px solid ${COLORS.red}`, borderRadius: 8, padding: "10px 14px", color: COLORS.redDark, fontSize: 13, marginBottom: 16 }}>
                {error}
              </div>
            )}

            <button
              onClick={handleSendCode}
              disabled={loading}
              style={{
                width: "100%",
                padding: 14,
                background: loading ? COLORS.blueMid : COLORS.blue,
                color: COLORS.white,
                border: "none",
                borderRadius: 10,
                fontSize: 15,
                fontWeight: 700,
                cursor: loading ? "not-allowed" : "pointer",
              }}
            >
              {loading ? "Enviando..." : "Enviar código"}
            </button>
          </>
        ) : (
          <>
            <h2 style={{ fontSize: 22, fontWeight: 700, color: COLORS.blue, margin: "0 0 4px" }}>
              Digite o código
            </h2>
            <p style={{ color: COLORS.gray, fontSize: 14, margin: "0 0 24px" }}>
              Enviamos um código para <strong>{email}</strong>. Ele expira em poucos minutos.
            </p>

            <div style={{ marginBottom: 14 }}>
              <label style={labelStyle}>Código</label>
              <input
                type="text"
                value={code}
                onChange={(e) => setCode(e.target.value)}
                placeholder="0000"
                style={inputStyle}
              />
            </div>

            <div style={{ marginBottom: 14 }}>
              <label style={labelStyle}>Nova Senha</label>
              <input
                type="password"
                value={newPassword}
                onChange={(e) => setNewPassword(e.target.value)}
                placeholder="••••••••"
                style={inputStyle}
              />
            </div>

            <div style={{ marginBottom: 18 }}>
              <label style={labelStyle}>Confirmar Nova Senha</label>
              <input
                type="password"
                value={confirmPassword}
                onChange={(e) => setConfirmPassword(e.target.value)}
                placeholder="••••••••"
                style={inputStyle}
              />
            </div>

            {error && (
              <div style={{ background: COLORS.redLight, border: `1px solid ${COLORS.red}`, borderRadius: 8, padding: "10px 14px", color: COLORS.redDark, fontSize: 13, marginBottom: 16 }}>
                {error}
              </div>
            )}

            <button
              onClick={handleConfirm}
              disabled={loading}
              style={{
                width: "100%",
                padding: 14,
                background: loading ? COLORS.blueMid : COLORS.blue,
                color: COLORS.white,
                border: "none",
                borderRadius: 10,
                fontSize: 15,
                fontWeight: 700,
                cursor: loading ? "not-allowed" : "pointer",
                marginBottom: 10,
              }}
            >
              {loading ? "Confirmando..." : "Confirmar nova senha"}
            </button>

            <button
              type="button"
              onClick={() => setStep(1)}
              style={{ width: "100%", padding: 10, background: "none", border: "none", color: COLORS.gray, fontSize: 13, cursor: "pointer" }}
            >
              Reenviar código
            </button>
          </>
        )}
      </div>
    </div>
  );
}

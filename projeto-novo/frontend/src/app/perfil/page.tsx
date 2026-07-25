"use client";

import { useState } from "react";
import { useRouter } from "next/navigation";
import { changePassword } from "@/app/api/auth/authService";

const COLORS = {
  blue: "#1A3A6B",
  red: "#C8102E",
  redLight: "#FDEAEA",
  redDark: "#9B0C21",
  green: "#1E7E34",
  greenLight: "#E6F4EA",
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  offWhite: "#F8F7F5",
  white: "#FFFFFF",
  text: "#1A1A1A",
};

const inputStyle = {
  width: "100%",
  padding: "12px",
  borderRadius: "8px",
  border: `1px solid ${COLORS.grayLight}`,
  boxSizing: "border-box" as const,
  fontFamily: "inherit",
  fontSize: "15px",
};

const labelStyle = {
  display: "block",
  fontSize: "12px",
  fontWeight: 700,
  color: COLORS.gray,
  marginBottom: "8px",
  textTransform: "uppercase" as const,
  letterSpacing: "0.04em",
};

export default function PerfilPage() {
  const router = useRouter();
  const [oldPassword, setOldPassword] = useState("");
  const [newPassword, setNewPassword] = useState("");
  const [confirmPassword, setConfirmPassword] = useState("");
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");
  const [success, setSuccess] = useState(false);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    setError("");
    setSuccess(false);

    const email = localStorage.getItem("email");
    if (!email) {
      setError("Não foi possível identificar seu usuário. Faça login novamente.");
      return;
    }
    if (!oldPassword || !newPassword || !confirmPassword) {
      setError("Preencha todos os campos.");
      return;
    }
    if (newPassword !== confirmPassword) {
      setError("A nova senha e a confirmação não coincidem.");
      return;
    }

    setLoading(true);
    try {
      await changePassword({ email, oldPassword, newPassword });
      setSuccess(true);
      setOldPassword("");
      setNewPassword("");
      setConfirmPassword("");
    } catch (err) {
      console.error(err);
      setError("Não foi possível alterar a senha. Verifique se a senha atual está correta.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div
      style={{ backgroundColor: COLORS.offWhite, minHeight: "calc(100vh - 64px)" }}
      className="flex items-start justify-center py-16 px-4"
    >
      <div
        style={{
          width: "100%",
          maxWidth: 440,
          background: COLORS.white,
          borderRadius: 16,
          padding: "40px 36px",
          border: `1px solid ${COLORS.grayLight}`,
          boxShadow: "0 8px 32px rgba(26,58,107,0.08)",
        }}
      >
        <h1 style={{ color: COLORS.blue, fontSize: 26, fontWeight: 800, margin: "0 0 4px" }}>
          Alterar Senha
        </h1>
        <p style={{ color: COLORS.gray, fontSize: 14, margin: "0 0 28px" }}>
          Informe sua senha atual e escolha uma nova senha.
        </p>

        <form onSubmit={handleSubmit} style={{ display: "flex", flexDirection: "column", gap: 18 }}>
          <div>
            <label style={labelStyle}>Senha Atual</label>
            <input
              type="password"
              value={oldPassword}
              onChange={(e) => setOldPassword(e.target.value)}
              style={inputStyle}
              placeholder="••••••••"
            />
          </div>

          <div>
            <label style={labelStyle}>Nova Senha</label>
            <input
              type="password"
              value={newPassword}
              onChange={(e) => setNewPassword(e.target.value)}
              style={inputStyle}
              placeholder="••••••••"
            />
          </div>

          <div>
            <label style={labelStyle}>Confirmar Nova Senha</label>
            <input
              type="password"
              value={confirmPassword}
              onChange={(e) => setConfirmPassword(e.target.value)}
              style={inputStyle}
              placeholder="••••••••"
            />
          </div>

          {error && (
            <div
              style={{
                background: COLORS.redLight,
                border: `1px solid ${COLORS.red}`,
                borderRadius: 8,
                padding: "10px 14px",
                color: COLORS.redDark,
                fontSize: 13,
              }}
            >
              {error}
            </div>
          )}

          {success && (
            <div
              style={{
                background: COLORS.greenLight,
                border: `1px solid ${COLORS.green}`,
                borderRadius: 8,
                padding: "10px 14px",
                color: COLORS.green,
                fontSize: 13,
              }}
            >
              Senha alterada com sucesso!
            </div>
          )}

          <button
            type="submit"
            disabled={loading}
            style={{
              width: "100%",
              padding: "14px",
              background: COLORS.blue,
              color: COLORS.white,
              border: "none",
              borderRadius: 8,
              fontSize: 15,
              fontWeight: 700,
              cursor: loading ? "not-allowed" : "pointer",
              opacity: loading ? 0.7 : 1,
            }}
          >
            {loading ? "Salvando..." : "Salvar Nova Senha"}
          </button>

          <button
            type="button"
            onClick={() => router.back()}
            style={{
              width: "100%",
              padding: "12px",
              background: "transparent",
              color: COLORS.gray,
              border: "none",
              fontSize: 14,
              cursor: "pointer",
            }}
          >
            Voltar
          </button>
        </form>
      </div>
    </div>
  );
}

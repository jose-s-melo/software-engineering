"use client";
import { useState } from "react";
import { useRouter } from "next/navigation";
import { login } from "../api/auth/authService";

const COLORS = {
  red: "#C8102E",
  redDark: "#9B0C21",
  redLight: "#FDEAEA",
  blue: "#1A3A6B",
  blueMid: "#1E4D8C",
  blueLight: "#E8EEF7",
  white: "#FFFFFF",
  offWhite: "#F8F7F5",
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  grayLighter: "#F2F1EE",
  text: "#1A1A1A",
};

const stripeStyle = {
  background: `repeating-linear-gradient(
    0deg,
    ${COLORS.red} 0px,
    ${COLORS.red} 24px,
    ${COLORS.white} 24px,
    ${COLORS.white} 48px,
    ${COLORS.blue} 48px,
    ${COLORS.blue} 72px,
    ${COLORS.white} 72px,
    ${COLORS.white} 96px
  )`,
};

function BarberPole() {
  return (
    <div style={{
      width: 44,
      height: 200,
      borderRadius: 22,
      overflow: "hidden",
      boxShadow: "inset 0 0 0 3px rgba(255,255,255,0.3), 0 4px 16px rgba(0,0,0,0.18)",
      flexShrink: 0,
      position: "relative",
    }}>
      <div style={{ ...stripeStyle, width: "100%", height: "100%", animation: "scrollStripe 2s linear infinite" }} />
      <style>{`@keyframes scrollStripe { from { background-position: 0 0; } to { background-position: 0 96px; } }`}</style>
    </div>
  );
}

function ScissorIcon() {
  return (
    <svg width="32" height="32" viewBox="0 0 32 32" fill="none" xmlns="http://www.w3.org/2000/svg">
      <circle cx="8" cy="9" r="5" stroke={COLORS.red} strokeWidth="2"/>
      <circle cx="8" cy="23" r="5" stroke={COLORS.red} strokeWidth="2"/>
      <line x1="11.5" y1="11.5" x2="28" y2="4" stroke={COLORS.blue} strokeWidth="2" strokeLinecap="round"/>
      <line x1="11.5" y1="20.5" x2="28" y2="28" stroke={COLORS.blue} strokeWidth="2" strokeLinecap="round"/>
    </svg>
  );
}

function Input({ label, type = "text", value, onChange, placeholder, icon }) {
  const [focused, setFocused] = useState(false);
  const [show, setShow] = useState(false);
  const isPassword = type === "password";

  return (
    <div style={{ marginBottom: 18 }}>
      <label style={{ display: "block", fontSize: 12, fontWeight: 600, color: COLORS.blue, letterSpacing: "0.08em", textTransform: "uppercase", marginBottom: 6 }}>
        {label}
      </label>
      <div style={{
        position: "relative",
        border: `1.5px solid ${focused ? COLORS.blue : COLORS.grayLight}`,
        borderRadius: 10,
        background: COLORS.white,
        transition: "border-color 0.2s",
        boxShadow: focused ? `0 0 0 3px ${COLORS.blueLight}` : "none",
      }}>
        <span style={{ position: "absolute", left: 14, top: "50%", transform: "translateY(-50%)", color: focused ? COLORS.blue : COLORS.gray, fontSize: 16, pointerEvents: "none" }}>
          {icon}
        </span>
        <input
          type={isPassword ? (show ? "text" : "password") : type}
          value={value}
          onChange={onChange}
          onFocus={() => setFocused(true)}
          onBlur={() => setFocused(false)}
          placeholder={placeholder}
          style={{
            width: "100%",
            padding: isPassword ? "13px 44px 13px 42px" : "13px 16px 13px 42px",
            border: "none",
            outline: "none",
            background: "transparent",
            fontSize: 15,
            color: COLORS.text,
            fontFamily: "'Playfair Display', Georgia, serif",
            boxSizing: "border-box",
          }}
        />
        {isPassword && (
          <button
            type="button"
            onClick={() => setShow(s => !s)}
            style={{ position: "absolute", right: 14, top: "50%", transform: "translateY(-50%)", background: "none", border: "none", cursor: "pointer", color: COLORS.gray, fontSize: 13, fontFamily: "inherit" }}
          >
            {show ? "Ocultar" : "Ver"}
          </button>
        )}
      </div>
    </div>
  );
}

function LoginForm() {
  const router = useRouter();
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  const handle = async () => {
    if (!email || !password) { setError("Preencha todos os campos."); return; }
    if (!email.includes("@")) { setError("E-mail inválido."); return; }

    setError("");
    setLoading(true);

    try {
      const response = await login({ email, password });

      if (response.message === "Success") {
        localStorage.setItem("token", response.token);
        localStorage.setItem("role", response.user.role);

        if (response.user.role === "ADMIN") {
          router.push("/admin/dashboard");
        } else if (response.user.role === "CLIENTE") {
          router.push("/agendamento");
        } else {
          setError("Perfil de usuário não reconhecido.");
          setLoading(false);
        }
      } else {
        setError(response.message || "Erro ao fazer login. Verifique suas credenciais.");
        setLoading(false);
      }
    } catch (err) {
      console.error(err);
      setError("Erro de conexão. Tente novamente mais tarde.");
      setLoading(false);
    }
  };

  return (
    <div>
      <h2 style={{ fontSize: 26, fontWeight: 700, color: COLORS.blue, margin: "0 0 4px", fontFamily: "'Playfair Display', Georgia, serif" }}>
        Bem-vindo de volta
      </h2>
      <p style={{ color: COLORS.gray, fontSize: 14, margin: "0 0 28px" }}>
        Entre na sua conta para agendar seu estilo.
      </p>

      <Input label="E-mail" type="email" value={email} onChange={e => setEmail(e.target.value)} placeholder="seu@email.com" icon="✉" />
      <Input label="Senha" type="password" value={password} onChange={e => setPassword(e.target.value)} placeholder="••••••••" icon="🔒" />

      <div style={{ textAlign: "right", marginTop: -10, marginBottom: 20 }}>
        <span style={{ fontSize: 13, color: COLORS.red, cursor: "pointer", fontWeight: 500 }}>
          Esqueci minha senha
        </span>
      </div>

      {error && (
        <div style={{ background: COLORS.redLight, border: `1px solid ${COLORS.red}`, borderRadius: 8, padding: "10px 14px", color: COLORS.redDark, fontSize: 13, marginBottom: 16 }}>
          {error}
        </div>
      )}

      <button
        onClick={handle}
        disabled={loading}
        style={{
          width: "100%",
          padding: "15px",
          background: loading ? COLORS.blueMid : COLORS.blue,
          color: COLORS.white,
          border: "none",
          borderRadius: 10,
          fontSize: 16,
          fontWeight: 700,
          cursor: loading ? "not-allowed" : "pointer",
          letterSpacing: "0.04em",
          fontFamily: "'Playfair Display', Georgia, serif",
          transition: "background 0.2s, transform 0.1s",
          transform: loading ? "scale(0.99)" : "scale(1)",
        }}
      >
        {loading ? "Entrando..." : "Entrar ✂️"}
      </button>
    </div>
  );
}

export default function App() {
  return (
    <>
      <style>{`
        @import url('https://fonts.googleapis.com/css2?family=Playfair+Display:wght@400;600;700;900&display=swap');
        * { box-sizing: border-box; margin: 0; padding: 0; }
        body { background: ${COLORS.offWhite}; }
        @keyframes fadeSlide { from { opacity: 0; transform: translateY(14px); } to { opacity: 1; transform: translateY(0); } }
        @keyframes scrollStripe { from { background-position: 0 0; } to { background-position: 0 96px; } }
      `}</style>

      <div style={{ minHeight: "100vh", display: "flex", background: COLORS.offWhite, fontFamily: "'Playfair Display', Georgia, serif" }}>

        {/* Left Panel */}
        <div style={{
          width: "42%",
          background: COLORS.blue,
          display: "flex",
          flexDirection: "column",
          alignItems: "center",
          justifyContent: "center",
          padding: "48px 36px",
          position: "relative",
          overflow: "hidden",
        }}>
          <div style={{ position: "absolute", top: 0, left: 0, right: 0, bottom: 0, opacity: 0.04 }}>
            {[...Array(12)].map((_, i) => (
              <div key={i} style={{ position: "absolute", left: `${i * 9}%`, top: 0, bottom: 0, width: 1, background: COLORS.white }} />
            ))}
          </div>

          <div style={{ position: "absolute", top: 0, left: 0, right: 0, height: 6, background: `linear-gradient(90deg, ${COLORS.red}, ${COLORS.white}, ${COLORS.red})` }} />

          <div style={{ display: "flex", gap: 32, marginBottom: 48, alignItems: "center" }}>
            <BarberPole />
            <div style={{ textAlign: "center" }}>
              <div style={{ display: "flex", alignItems: "center", justifyContent: "center", gap: 10, marginBottom: 12 }}>
                <ScissorIcon />
              </div>
              <div style={{ fontSize: 38, fontWeight: 900, color: COLORS.white, lineHeight: 1, letterSpacing: "-1px" }}>
                CORTE<span style={{ color: COLORS.red }}>&</span>ESTILO
              </div>
              <div style={{ fontSize: 13, letterSpacing: "0.3em", color: "rgba(255,255,255,0.6)", marginTop: 8, textTransform: "uppercase" }}>
                Barbearia Clássica
              </div>
            </div>
            <BarberPole />
          </div>

          <div style={{ width: 60, height: 2, background: COLORS.red, marginBottom: 32 }} />

          <p style={{ color: "rgba(255,255,255,0.8)", fontSize: 16, textAlign: "center", lineHeight: 1.7, maxWidth: 280, fontStyle: "italic" }}>
            "O homem que cuida da aparência, cuida da vida. Agende seu próximo corte com quem entende de estilo."
          </p>

          <div style={{ display: "flex", gap: 24, marginTop: 48 }}>
            {["✂️ Corte", "💈 Barba", "🪒 Navalha"].map(item => (
              <div key={item} style={{ background: "rgba(255,255,255,0.1)", borderRadius: 10, padding: "10px 16px", color: COLORS.white, fontSize: 13, textAlign: "center" }}>
                {item}
              </div>
            ))}
          </div>

          <div style={{ position: "absolute", bottom: 0, left: 0, right: 0, height: 6, background: `linear-gradient(90deg, ${COLORS.red}, ${COLORS.white}, ${COLORS.red})` }} />
        </div>

        {/* Right Panel */}
        <div style={{
          flex: 1,
          display: "flex",
          alignItems: "center",
          justifyContent: "center",
          padding: "48px 32px",
        }}>
          <div style={{
            width: "100%",
            maxWidth: 440,
            background: COLORS.white,
            borderRadius: 20,
            padding: "48px 44px",
            boxShadow: "0 8px 40px rgba(26,58,107,0.10)",
            border: `1px solid ${COLORS.grayLight}`,
            animation: "fadeSlide 0.45s ease",
            position: "relative",
          }}>
            <div style={{ position: "absolute", top: 0, left: 0, width: 60, height: 4, background: COLORS.red, borderRadius: "20px 0 20px 0" }} />
            <div style={{ position: "absolute", top: 0, right: 0, width: 60, height: 4, background: COLORS.blue, borderRadius: "0 20px 0 20px" }} />

            <LoginForm />
          </div>
        </div>
      </div>
    </>
  );
}

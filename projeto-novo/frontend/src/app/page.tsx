"use client";

import Link from "next/link";
import { Scissors } from "lucide-react";

// Mesma paleta utilizada no dashboard e login
const COLORS = {
  red: "#C8102E",
  blue: "#1A3A6B",
  white: "#FFFFFF",
  offWhite: "#F8F7F5",
};

export default function Home() {
  return (
    <div style={{ 
      minHeight: "100vh", 
      display: "flex", 
      flexDirection: "column", 
      alignItems: "center", 
      justifyContent: "center", 
      padding: "24px", 
      textAlign: "center", 
      background: COLORS.offWhite,
      fontFamily: "'Playfair Display', Georgia, serif"
    }}>
      <div style={{ 
        background: COLORS.blue, 
        padding: "24px", 
        color: COLORS.white, 
        marginBottom: "24px", 
        borderRadius: "20px" 
      }}>
        <Scissors size={64} />
      </div>
      
      <h1 style={{ fontSize: "48px", fontWeight: 900, color: COLORS.blue, margin: "0 0 8px 0" }}>
        CORTE & ESTILO
      </h1>
      <p style={{ color: COLORS.red, fontSize: "14px", letterSpacing: "0.2em", textTransform: "uppercase", marginBottom: "48px", fontWeight: 700 }}>
        Gestão Moderna
      </p>

      <Link 
        href="/admin/dashboard"
        style={{ 
          background: COLORS.blue, 
          color: COLORS.white, 
          padding: "16px 40px", 
          borderRadius: "10px", 
          textDecoration: "none", 
          fontWeight: 700, 
          transition: "background 0.2s" 
        }}
      >
        Acessar Dashboard
      </Link>
    </div>
  );
}
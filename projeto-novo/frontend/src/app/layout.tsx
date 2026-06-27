import type { Metadata } from "next";
import Navbar from "@/components/Navbar"; // Adicione esta linha (ajuste o caminho se a pasta components estiver em outro lugar)
import "./globals.css";

export const metadata: Metadata = {
  title: "Corte & Estilo | Gestão",
  description: "Sistema de gestão profissional",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="pt-br">
      {/* Removemos o bg-[#F4F1EA] para que a página controle seu próprio fundo */}
      <body className="antialiased">
        {/* A Navbar entra aqui, antes de todo o resto do conteúdo */}
        <Navbar />
        {children}
      </body>
    </html>
  );
}
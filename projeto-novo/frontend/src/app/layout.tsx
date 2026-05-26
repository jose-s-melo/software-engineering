import type { Metadata } from "next";

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
        {children}
      </body>
    </html>
  );
}
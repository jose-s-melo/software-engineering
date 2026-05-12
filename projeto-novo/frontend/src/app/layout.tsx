import type { Metadata } from "next";
import "./globals.css";

export const metadata: Metadata = {
  title: "The Barber Panel | Gestão & Tradição",
  description: "Sistema de gestão para barbearias clássicas",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="pt-br">
      {/* O fundo #F4F1EA dá o aspecto de papel envelhecido vintage */}
      <body className="bg-[#F4F1EA] antialiased">
        {children}
      </body>
    </html>
  );
}
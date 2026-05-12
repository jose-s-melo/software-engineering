import Link from "next/link";
import { Scissors } from "lucide-react";

export default function Home() {
  return (
    <div className="min-h-screen flex flex-col items-center justify-center p-6 text-center">
      <div className="bg-[#0A192F] p-6 text-white mb-6 border-4 border-[#8B0000] shadow-[8px_8px_0px_0px_rgba(10,25,47,1)]">
        <Scissors size={64} />
      </div>
      
      <h1 className="text-5xl font-black text-[#0A192F] uppercase italic mb-2 tracking-tighter">
        The Barber Panel
      </h1>
      <p className="text-[#8B0000] font-bold uppercase tracking-[0.2em] text-sm mb-12">
        Estilo Clássico & Gestão Moderna
      </p>

      <Link 
        href="/admin/dashboard"
        className="bg-[#0A192F] text-white px-10 py-4 font-black uppercase border-4 border-[#0A192F] hover:bg-white hover:text-[#0A192F] transition-all shadow-[8px_8px_0px_0px_rgba(139,0,0,1)]"
      >
        Acessar Dashboard
      </Link>
    </div>
  );
}
"use client";

import React from 'react';
import { 
  Users, 
  Calendar, 
  DollarSign, 
  Clock, 
  MoreVertical,
  Search,
  Plus,
  Scissors
} from 'lucide-react';

export default function AdminDashboard() {
  return (
    <div className="min-h-screen bg-[#F4F1EA] p-4 md:p-8 font-serif">
      {/* Header Estilo Vintage */}
      <header className="flex flex-col md:flex-row md:items-center justify-between gap-6 mb-12 border-b-2 border-[#0A192F] pb-6">
        <div className="flex items-center gap-4">
          <div className="bg-[#0A192F] p-3 text-white">
            <Scissors size={32} />
          </div>
          <div>
            <h1 className="text-4xl font-black text-[#0A192F] tracking-tighter uppercase italic">The Barber Panel</h1>
            <p className="text-[#8B0000] font-bold uppercase tracking-widest text-xs">Gestão & Tradição</p>
          </div>
        </div>
        
        <div className="flex items-center gap-4">
          <button className="bg-[#8B0000] text-white px-8 py-3 font-bold border-2 border-[#0A192F] hover:bg-[#A50000] transition-all shadow-[4px_4px_0px_0px_rgba(10,25,47,1)] uppercase text-sm">
            Novo Agendamento
          </button>
        </div>
      </header>

      {/* Cards de Métricas - Paleta Marinho e Carmesim */}
      <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-6 mb-12">
        <StatCard title="Faturamento" value="R$ 450,00" icon={<DollarSign />} variant="blue" />
        <StatCard title="Agendamentos" value="12" icon={<Calendar />} variant="red" />
        <StatCard title="Clientes" value="04" icon={<Users />} variant="blue" />
        <StatCard title="Disponibilidade" value="06" icon={<Clock />} variant="red" />
      </div>

      <div className="grid grid-cols-1 lg:grid-cols-3 gap-10">
        {/* Tabela de Próximos Atendimentos */}
        <section className="lg:col-span-2 bg-white border-4 border-[#0A192F] shadow-[12px_12px_0px_0px_rgba(10,25,47,0.1)]">
          <div className="p-6 border-b-4 border-[#0A192F] bg-[#0A192F] text-white flex justify-between items-center">
            <h2 className="font-black text-2xl uppercase italic">Ordem do Dia</h2>
            <span className="text-xs font-bold bg-[#8B0000] px-3 py-1">HOJE</span>
          </div>
          
          <div className="overflow-x-auto">
            <table className="w-full text-left border-collapse">
              <thead>
                <tr className="bg-[#F4F1EA] border-b-2 border-[#0A192F]">
                  <th className="px-6 py-4 text-sm font-black text-[#0A192F] uppercase">Cavalheiro</th>
                  <th className="px-6 py-4 text-sm font-black text-[#0A192F] uppercase">Serviço</th>
                  <th className="px-6 py-4 text-sm font-black text-[#0A192F] uppercase text-center">Horário</th>
                  <th className="px-6 py-4 text-sm font-black text-[#0A192F] uppercase text-center">Status</th>
                  <th className="px-6 py-4"></th>
                </tr>
              </thead>
              <tbody className="divide-y-2 divide-[#F4F1EA]">
                <AppointmentRow 
                  name="João Silva" 
                  service="Corte + Barba Lenhador" 
                  time="14:30" 
                  status="Confirmado" 
                />
                <AppointmentRow 
                  name="Apolo Husky" 
                  service="Barba Tradicional" 
                  time="15:15" 
                  status="Em Espera" 
                />
              </tbody>
            </table>
          </div>
        </section>

        {/* Sidebar Estilo Barber Pole */}
        <aside className="space-y-8">
          <div className="bg-[#8B0000] p-1 border-2 border-[#0A192F]">
             <div className="bg-white p-6 border-2 border-[#0A192F]">
                <h2 className="font-black text-xl text-[#0A192F] mb-6 uppercase border-b-2 border-[#F4F1EA] pb-2">Comandos</h2>
                <div className="space-y-4">
                  <QuickActionButton label="Bloquear Agenda" />
                  <QuickActionButton label="Tabela de Preços" />
                  <QuickActionButton label="Fechar Caixa" isPrimary />
                </div>
             </div>
          </div>

          {/* Elemento Decorativo Barber Pole Horizontal */}
          <div className="h-6 w-full border-2 border-[#0A192F] flex overflow-hidden">
            {[...Array(12)].map((_, i) => (
              <div key={i} className={`flex-1 -skew-x-12 h-full ${i % 3 === 0 ? 'bg-[#8B0000]' : i % 3 === 1 ? 'bg-white' : 'bg-[#0A192F]'}`} />
            ))}
          </div>
        </aside>
      </div>
    </div>
  );
}

function StatCard({ title, value, icon, variant }: any) {
  const isRed = variant === 'red';
  return (
    <div className="bg-white border-2 border-[#0A192F] p-6 shadow-[6px_6px_0px_0px_rgba(10,25,47,1)] relative overflow-hidden group">
      <div className={`absolute top-0 right-0 w-12 h-12 flex items-center justify-center ${isRed ? 'bg-[#8B0000]' : 'bg-[#0A192F]'} text-white`}>
        {icon}
      </div>
      <p className="text-xs font-black text-[#0A192F] uppercase tracking-widest mb-1">{title}</p>
      <p className="text-3xl font-black text-[#0A192F] italic">{value}</p>
    </div>
  );
}

function AppointmentRow({ name, service, time, status }: any) {
  return (
    <tr className="hover:bg-[#F4F1EA] transition-colors">
      <td className="px-6 py-5">
        <span className="font-black text-[#0A192F] uppercase text-sm tracking-tighter">{name}</span>
      </td>
      <td className="px-6 py-5 text-sm font-bold text-[#555] italic">{service}</td>
      <td className="px-6 py-5 text-sm font-black text-[#0A192F] text-center">{time}</td>
      <td className="px-6 py-5 text-center">
        <span className={`text-[10px] font-black px-3 py-1 uppercase border-2 ${status === 'Confirmado' ? 'border-[#0A192F] text-[#0A192F]' : 'border-[#8B0000] text-[#8B0000]'}`}>
          {status}
        </span>
      </td>
      <td className="px-6 py-5 text-right">
        <button className="text-[#0A192F] hover:scale-110 transition-transform">
          <MoreVertical size={20} />
        </button>
      </td>
    </tr>
  );
}

function QuickActionButton({ label, isPrimary }: any) {
  return (
    <button className={`w-full text-center p-3 font-black text-xs uppercase border-2 transition-all ${isPrimary ? 'bg-[#0A192F] text-white border-[#0A192F] hover:bg-[#1a2a44]' : 'bg-white text-[#0A192F] border-[#0A192F] hover:bg-[#F4F1EA]'}`}>
      {label}
    </button>
  );
}
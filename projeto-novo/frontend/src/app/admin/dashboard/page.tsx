"use client";

import React, { useState } from 'react';
import { Users, Calendar, DollarSign, Clock, Scissors, X } from 'lucide-react';

const COLORS = {
  red: "#C8102E",
  blue: "#1A3A6B",
  white: "#FFFFFF",
  offWhite: "#F8F7F5",
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  overlay: "rgba(26, 58, 107, 0.5)", // Fundo escuro para o modal
};

export default function AdminDashboard() {
  // 1. Estado para guardar a lista de agendamentos
  const [appointments, setAppointments] = useState([
    { id: 1, name: "João Silva", service: "Corte + Barba", time: "14:30", status: "Confirmado" },
    { id: 2, name: "Apolo Husky", service: "Barba Tradicional", time: "15:15", status: "Pendente" }
  ]);

  // 2. Estados para controlar o Modal e o formulário
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [formData, setFormData] = useState({ name: '', service: '', time: '', status: 'Confirmado' });

  // 3. Função para salvar o novo agendamento
  const handleAddAppointment = (e: React.FormEvent) => {
    e.preventDefault();
    
    if (!formData.name || !formData.time || !formData.service) return;

    const newAppointment = {
      id: appointments.length + 1,
      ...formData
    };

    setAppointments([...appointments, newAppointment]);
    setIsModalOpen(false); // Fecha o modal
    setFormData({ name: '', service: '', time: '', status: 'Confirmado' }); // Limpa o form
  };

  return (
    <div style={{ minHeight: "100vh", background: COLORS.offWhite, padding: "32px", fontFamily: "'Playfair Display', Georgia, serif", color: COLORS.blue, position: "relative" }}>
      <div style={{ maxWidth: "1200px", margin: "0 auto" }}>
        
        {/* Header */}
        <header style={{ display: "flex", justifyContent: "space-between", alignItems: "center", marginBottom: "40px" }}>
          <div style={{ display: "flex", alignItems: "center", gap: "16px" }}>
            <div style={{ background: COLORS.blue, padding: "12px", color: COLORS.white, borderRadius: "12px" }}>
              <Scissors size={28} />
            </div>
            <div>
              <h1 style={{ fontSize: "32px", fontWeight: 900, margin: 0 }}>CORTE & ESTILO</h1>
              <p style={{ color: COLORS.red, fontSize: "12px", textTransform: "uppercase", letterSpacing: "0.2em", fontWeight: 700 }}>Painel Administrativo</p>
            </div>
          </div>
          <button 
            onClick={() => setIsModalOpen(true)}
            style={{ background: COLORS.red, color: COLORS.white, padding: "12px 24px", borderRadius: "10px", border: "none", fontWeight: 700, cursor: "pointer", transition: "opacity 0.2s" }}
          >
            + Novo Agendamento
          </button>
        </header>

        {/* Métricas dinâmicas baseadas no estado */}
        <div style={{ display: "grid", gridTemplateColumns: "repeat(4, 1fr)", gap: "20px", marginBottom: "40px" }}>
          <MetricCard title="Faturamento Previsto" value={`R$ ${appointments.length * 60},00`} icon={<DollarSign />} />
          <MetricCard title="Agendamentos" value={appointments.length.toString()} icon={<Calendar />} />
          <MetricCard title="Clientes" value={appointments.length.toString()} icon={<Users />} />
          <MetricCard title="Disponibilidade" value={(10 - appointments.length).toString()} icon={<Clock />} />
        </div>

        {/* Tabela */}
        <div style={{ background: COLORS.white, borderRadius: "20px", padding: "32px", border: `1px solid ${COLORS.grayLight}`, boxShadow: "0 4px 20px rgba(0,0,0,0.05)" }}>
          <h3 style={{ marginBottom: "24px", fontSize: "22px" }}>Ordem do Dia</h3>
          <table style={{ width: "100%", borderCollapse: "collapse" }}>
            <thead>
              <tr style={{ color: COLORS.gray, textAlign: "left", fontSize: "14px" }}>
                <th style={{ paddingBottom: "16px" }}>Cavalheiro</th>
                <th style={{ paddingBottom: "16px" }}>Serviço</th>
                <th style={{ paddingBottom: "16px" }}>Horário</th>
                <th style={{ paddingBottom: "16px" }}>Status</th>
              </tr>
            </thead>
            <tbody>
              {appointments.length === 0 ? (
                <tr>
                  <td colSpan={4} style={{ padding: "20px 0", textAlign: "center", color: COLORS.gray }}>Nenhum agendamento para hoje.</td>
                </tr>
              ) : (
                appointments.map((appt) => (
                  <Row key={appt.id} name={appt.name} service={appt.service} time={appt.time} status={appt.status} />
                ))
              )}
            </tbody>
          </table>
        </div>
      </div>

      {/* Modal de Novo Agendamento */}
      {isModalOpen && (
        <div style={{ position: "fixed", top: 0, left: 0, right: 0, bottom: 0, background: COLORS.overlay, display: "flex", alignItems: "center", justifyContent: "center", zIndex: 50, padding: "20px" }}>
          <div style={{ background: COLORS.white, padding: "32px", borderRadius: "20px", width: "100%", maxWidth: "400px", position: "relative", boxShadow: "0 20px 40px rgba(0,0,0,0.2)" }}>
            
            <button onClick={() => setIsModalOpen(false)} style={{ position: "absolute", top: "24px", right: "24px", background: "none", border: "none", cursor: "pointer", color: COLORS.gray }}>
              <X size={24} />
            </button>

            <h3 style={{ fontSize: "24px", marginBottom: "24px", color: COLORS.blue, marginTop: 0 }}>Novo Agendamento</h3>
            
            <form onSubmit={handleAddAppointment} style={{ display: "flex", flexDirection: "column", gap: "16px" }}>
              
              <div>
                <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>Nome do Cliente</label>
                <input 
                  type="text" 
                  required
                  value={formData.name}
                  onChange={(e) => setFormData({...formData, name: e.target.value})}
                  style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit" }}
                  placeholder="Ex: Carlos Silva"
                />
              </div>

              <div>
                <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>Serviço</label>
                <select 
                  required
                  value={formData.service}
                  onChange={(e) => setFormData({...formData, service: e.target.value})}
                  style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit", backgroundColor: COLORS.white }}
                >
                  <option value="" disabled>Selecione um serviço</option>
                  <option value="Corte Clássico">Corte Clássico</option>
                  <option value="Barba Tradicional">Barba Tradicional</option>
                  <option value="Corte + Barba">Corte + Barba</option>
                  <option value="Pigmentação">Pigmentação</option>
                </select>
              </div>

              <div style={{ display: "flex", gap: "16px" }}>
                <div style={{ flex: 1 }}>
                  <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>Horário</label>
                  <input 
                    type="time" 
                    required
                    value={formData.time}
                    onChange={(e) => setFormData({...formData, time: e.target.value})}
                    style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit" }}
                  />
                </div>
                <div style={{ flex: 1 }}>
                  <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>Status</label>
                  <select 
                    value={formData.status}
                    onChange={(e) => setFormData({...formData, status: e.target.value})}
                    style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit", backgroundColor: COLORS.white }}
                  >
                    <option value="Confirmado">Confirmado</option>
                    <option value="Pendente">Pendente</option>
                  </select>
                </div>
              </div>

              <button type="submit" style={{ background: COLORS.blue, color: COLORS.white, padding: "16px", borderRadius: "10px", border: "none", fontWeight: 700, cursor: "pointer", marginTop: "8px", fontSize: "16px" }}>
                Salvar Agendamento
              </button>
            </form>

          </div>
        </div>
      )}
    </div>
  );
}

function MetricCard({ title, value, icon }: any) {
  return (
    <div style={{ background: COLORS.white, padding: "24px", borderRadius: "16px", border: `1px solid ${COLORS.grayLight}` }}>
      <div style={{ color: COLORS.blue, marginBottom: "12px" }}>{icon}</div>
      <p style={{ color: COLORS.gray, fontSize: "12px", textTransform: "uppercase", margin: 0 }}>{title}</p>
      <p style={{ fontSize: "22px", fontWeight: 700, margin: "4px 0 0" }}>{value}</p>
    </div>
  );
}

function Row({ name, service, time, status }: any) {
  return (
    <tr style={{ borderTop: `1px solid ${COLORS.grayLight}` }}>
      <td style={{ padding: "20px 0", fontWeight: 600 }}>{name}</td>
      <td style={{ padding: "20px 0", color: COLORS.gray }}>{service}</td>
      <td style={{ padding: "20px 0", fontWeight: 700 }}>{time}</td>
      <td style={{ padding: "20px 0" }}>
        <span style={{ fontSize: "11px", padding: "6px 12px", borderRadius: "20px", background: status === 'Confirmado' ? COLORS.red : '#F5A623', color: COLORS.white, fontWeight: 700 }}>
          {status}
        </span>
      </td>
    </tr>
  );
}
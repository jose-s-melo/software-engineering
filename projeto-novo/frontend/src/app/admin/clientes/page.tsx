"use client";

import React, { useState } from 'react';
import { Users, X, Search, Edit2, Trash2, Calendar } from 'lucide-react';
import { Cliente } from "@/types/cliente";
import ClientAppointmentsModal from "@/components/modals/ClientAppointmentsModal";

const COLORS = {
  red: "#C8102E",
  blue: "#1A3A6B",
  white: "#FFFFFF",
  offWhite: "#F8F7F5",
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  overlay: "rgba(26, 58, 107, 0.5)",
};

const clientesMock: Cliente[] = [
  { id: "1", clientName: "Lucas Henrique", clientPhone: "(83) 99999-9999", clientEmail: "lucas@email.com" },
  { id: "2", clientName: "João Pedro", clientPhone: "(83) 98888-8888", clientEmail: "joao@email.com" },
  { id: "3", clientName: "Carlos Eduardo", clientPhone: "(83) 97777-7777", clientEmail: "carlos@email.com" },
];

export default function ClientesAdminPage() {
  const [search, setSearch] = useState("");
  const [clientes, setClientes] = useState<Cliente[]>(clientesMock);
  
  // Controles de Modal
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [isAppointmentsModalOpen, setIsAppointmentsModalOpen] = useState(false);
  
  const [selectedClient, setSelectedClient] = useState<Cliente | null>(null);
  const [formData, setFormData] = useState({ clientName: '', clientPhone: '', clientEmail: '' });

  // Filtro
  const clientesFiltrados = clientes.filter((cliente) =>
    cliente.clientName.toLowerCase().includes(search.toLowerCase())
  );

  // Abrir modal NOVO
  const handleOpenNew = () => {
    setSelectedClient(null);
    setFormData({ clientName: '', clientPhone: '', clientEmail: '' });
    setIsModalOpen(true);
  };

  // Abrir modal EDITAR
  const handleOpenEdit = (cliente: Cliente) => {
    setSelectedClient(cliente);
    setFormData({ 
      clientName: cliente.clientName, 
      clientPhone: cliente.clientPhone, 
      clientEmail: cliente.clientEmail 
    });
    setIsModalOpen(true);
  };

  // Abrir modal de AGENDAMENTOS DO CLIENTE
  const handleManageAppointments = (cliente: Cliente) => {
    setSelectedClient(cliente);
    setIsAppointmentsModalOpen(true);
  };

  // Excluir
  const handleDelete = (id: string) => {
    if (confirm("Tem certeza que deseja excluir este cliente?")) {
      setClientes((prev) => prev.filter((c) => c.id !== id));
    }
  };

  // Salvar (Criar ou Atualizar)
  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    if (!formData.clientName || !formData.clientPhone) return;

    if (selectedClient) {
      setClientes((prev) => prev.map((c) => 
        c.id === selectedClient.id 
          ? { ...c, clientName: formData.clientName, clientPhone: formData.clientPhone, clientEmail: formData.clientEmail } 
          : c
      ));
    } else {
      const novoCliente: Cliente = {
        id: String(clientes.length + 1),
        clientName: formData.clientName,
        clientPhone: formData.clientPhone,
        clientEmail: formData.clientEmail,
      };
      setClientes([...clientes, novoCliente]);
    }
    setIsModalOpen(false);
  };

  return (
    <div style={{ minHeight: "100vh", background: COLORS.offWhite, padding: "32px", fontFamily: "'Playfair Display', Georgia, serif", color: COLORS.blue, position: "relative" }}>
      <div style={{ maxWidth: "1200px", margin: "0 auto" }}>
        
        {/* Header */}
        <header style={{ display: "flex", justifyContent: "space-between", alignItems: "center", marginBottom: "40px" }}>
          <div style={{ display: "flex", alignItems: "center", gap: "16px" }}>
            <div style={{ background: COLORS.blue, padding: "12px", color: COLORS.white, borderRadius: "12px" }}>
              <Users size={28} />
            </div>
            <div>
              <h1 style={{ fontSize: "32px", fontWeight: 900, margin: 0 }}>CORTE & ESTILO</h1>
              <p style={{ color: COLORS.red, fontSize: "12px", textTransform: "uppercase", letterSpacing: "0.2em", fontWeight: 700 }}>Gestão de Clientes</p>
            </div>
          </div>
          <button 
            onClick={handleOpenNew}
            style={{ background: COLORS.red, color: COLORS.white, padding: "12px 24px", borderRadius: "10px", border: "none", fontWeight: 700, cursor: "pointer", transition: "opacity 0.2s" }}
          >
            + Novo Cliente
          </button>
        </header>

        {/* Barra de Busca */}
        <div style={{ background: COLORS.white, padding: "20px", borderRadius: "16px", border: `1px solid ${COLORS.grayLight}`, marginBottom: "32px", display: "flex", alignItems: "center", gap: "12px" }}>
          <Search size={20} color={COLORS.gray} />
          <input 
            type="text" 
            placeholder="Buscar cliente pelo nome..." 
            value={search}
            onChange={(e) => setSearch(e.target.value)}
            style={{ width: "100%", border: "none", outline: "none", fontSize: "16px", fontFamily: "inherit", color: COLORS.blue }}
          />
        </div>

        {/* Tabela de Clientes */}
        <div style={{ background: COLORS.white, borderRadius: "20px", padding: "32px", border: `1px solid ${COLORS.grayLight}`, boxShadow: "0 4px 20px rgba(0,0,0,0.05)" }}>
          <h3 style={{ marginBottom: "24px", fontSize: "22px", marginTop: 0 }}>Carteira de Clientes</h3>
          <table style={{ width: "100%", borderCollapse: "collapse" }}>
            <thead>
              <tr style={{ color: COLORS.gray, textAlign: "left", fontSize: "14px" }}>
                <th style={{ paddingBottom: "16px", textTransform: "uppercase", letterSpacing: "0.05em" }}>Cliente</th>
                <th style={{ paddingBottom: "16px", textTransform: "uppercase", letterSpacing: "0.05em" }}>Telefone</th>
                <th style={{ paddingBottom: "16px", textTransform: "uppercase", letterSpacing: "0.05em" }}>E-mail</th>
                <th style={{ paddingBottom: "16px", textTransform: "uppercase", letterSpacing: "0.05em", textAlign: "right" }}>Ações</th>
              </tr>
            </thead>
            <tbody>
              {clientesFiltrados.length === 0 ? (
                <tr>
                  <td colSpan={4} style={{ padding: "20px 0", textAlign: "center", color: COLORS.gray }}>Nenhum cliente encontrado.</td>
                </tr>
              ) : (
                clientesFiltrados.map((cliente) => (
                  <tr key={cliente.id} style={{ borderTop: `1px solid ${COLORS.grayLight}` }}>
                    <td style={{ padding: "20px 0", fontWeight: 700, width: "30%" }}>{cliente.clientName}</td>
                    <td style={{ padding: "20px 0", color: COLORS.gray, width: "25%" }}>{cliente.clientPhone}</td>
                    <td style={{ padding: "20px 0", color: COLORS.gray, width: "25%" }}>{cliente.clientEmail}</td>
                    <td style={{ padding: "20px 0", textAlign: "right", width: "20%" }}>
                      <button title="Agendamentos" onClick={() => handleManageAppointments(cliente)} style={{ background: "transparent", border: "none", cursor: "pointer", color: COLORS.blue, marginRight: "16px" }}>
                        <Calendar size={18} />
                      </button>
                      <button title="Editar" onClick={() => handleOpenEdit(cliente)} style={{ background: "transparent", border: "none", cursor: "pointer", color: COLORS.gray, marginRight: "16px" }}>
                        <Edit2 size={18} />
                      </button>
                      <button title="Excluir" onClick={() => handleDelete(cliente.id)} style={{ background: "transparent", border: "none", cursor: "pointer", color: COLORS.red }}>
                        <Trash2 size={18} />
                      </button>
                    </td>
                  </tr>
                ))
              )}
            </tbody>
          </table>
        </div>
      </div>

      {/* Modal Principal (Novo/Editar Cliente) */}
      {isModalOpen && (
        <div style={{ position: "fixed", top: 0, left: 0, right: 0, bottom: 0, background: COLORS.overlay, display: "flex", alignItems: "center", justifyContent: "center", zIndex: 50, padding: "20px" }}>
          <div style={{ background: COLORS.white, padding: "32px", borderRadius: "20px", width: "100%", maxWidth: "500px", position: "relative", boxShadow: "0 20px 40px rgba(0,0,0,0.2)" }}>
            
            <button onClick={() => setIsModalOpen(false)} style={{ position: "absolute", top: "24px", right: "24px", background: "none", border: "none", cursor: "pointer", color: COLORS.gray }}>
              <X size={24} />
            </button>

            <h3 style={{ fontSize: "24px", marginBottom: "24px", color: COLORS.blue, marginTop: 0 }}>
              {selectedClient ? "Editar Cliente" : "Novo Cliente"}
            </h3>
            
            <form onSubmit={handleSubmit} style={{ display: "flex", flexDirection: "column", gap: "16px" }}>
              
              <div>
                <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>Nome Completo</label>
                <input 
                  type="text" 
                  required
                  value={formData.clientName}
                  onChange={(e) => setFormData({...formData, clientName: e.target.value})}
                  style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit" }}
                  placeholder="Ex: Carlos Eduardo"
                />
              </div>

              <div>
                <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>Telefone / WhatsApp</label>
                <input 
                  type="text" 
                  required
                  value={formData.clientPhone}
                  onChange={(e) => setFormData({...formData, clientPhone: e.target.value})}
                  style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit" }}
                  placeholder="(83) 90000-0000"
                />
              </div>

              <div>
                <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>E-mail</label>
                <input 
                  type="email" 
                  required
                  value={formData.clientEmail}
                  onChange={(e) => setFormData({...formData, clientEmail: e.target.value})}
                  style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit" }}
                  placeholder="cliente@email.com"
                />
              </div>

              <button type="submit" style={{ background: COLORS.blue, color: COLORS.white, padding: "16px", borderRadius: "10px", border: "none", fontWeight: 700, cursor: "pointer", marginTop: "8px", fontSize: "16px" }}>
                {selectedClient ? "Salvar Alterações" : "Cadastrar Cliente"}
              </button>
            </form>
          </div>
        </div>
      )}

      {/* Mantendo o seu Modal de Agendamentos externo */}
      <ClientAppointmentsModal
        clientId={selectedClient?.id || ""}
        clientName={selectedClient?.clientName || ""}
        isOpen={isAppointmentsModalOpen}
        onClose={() => setIsAppointmentsModalOpen(false)}
      />
    </div>
  );
}
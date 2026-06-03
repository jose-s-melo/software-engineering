"use client";

import React, { useState } from 'react';
import { Scissors, X, Search, Edit2, Trash2 } from 'lucide-react';
import { Servico } from "@/types/servico"; // Mantendo sua tipagem

const COLORS = {
  red: "#C8102E",
  blue: "#1A3A6B",
  white: "#FFFFFF",
  offWhite: "#F8F7F5",
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  overlay: "rgba(26, 58, 107, 0.5)",
};

const servicosMock: Servico[] = [
  { id: "1", serviceName: "Corte + Barba", price: 35.00, description: "Serviço básico de corte e barba, lavagem e finalização." },
  { id: "2", serviceName: "Coloração", price: 30.00, description: "Serviço de coloração completa." },
  { id: "3", serviceName: "Barba Tradicional", price: 20.00, description: "Serviço básico de barba, corte e finalização." },
  { id: "4", serviceName: "Corte Clássico", price: 20.00, description: "Corte clássico, lavagem e finalização." },
  { id: "5", serviceName: "Pigmentação", price: 20.00, description: "Pigmentação de falhas na barba ou cabelo." }
];

export default function ServicosAdminPage() {
  const [search, setSearch] = useState("");
  const [servicos, setServicos] = useState<Servico[]>(servicosMock);
  
  // Controle do Modal
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [selectedService, setSelectedService] = useState<Servico | null>(null);
  const [formData, setFormData] = useState({ serviceName: '', price: '', description: '' });

  // Filtro de busca
  const servicosFiltrados = servicos.filter((servico) =>
    servico.serviceName.toLowerCase().includes(search.toLowerCase())
  );

  // Abrir modal para NOVO
  const handleOpenNew = () => {
    setSelectedService(null);
    setFormData({ serviceName: '', price: '', description: '' });
    setIsModalOpen(true);
  };

  // Abrir modal para EDITAR
  const handleOpenEdit = (servico: Servico) => {
    setSelectedService(servico);
    setFormData({ 
      serviceName: servico.serviceName, 
      price: servico.price.toString(), 
      description: servico.description 
    });
    setIsModalOpen(true);
  };

  // Excluir
  const handleDelete = (id: string) => {
    if (confirm("Tem certeza que deseja excluir este serviço?")) {
      setServicos((prev) => prev.filter((s) => s.id !== id));
    }
  };

  // Salvar (Criar ou Atualizar)
  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    if (!formData.serviceName || !formData.price) return;

    if (selectedService) {
      // Atualizar existente
      setServicos((prev) => prev.map((s) => 
        s.id === selectedService.id 
          ? { ...s, serviceName: formData.serviceName, price: Number(formData.price), description: formData.description } 
          : s
      ));
    } else {
      // Criar novo
      const novoServico: Servico = {
        id: String(servicos.length + 1),
        serviceName: formData.serviceName,
        price: Number(formData.price),
        description: formData.description,
      };
      setServicos([...servicos, novoServico]);
    }
    setIsModalOpen(false);
  };

  return (
    <div style={{ minHeight: "100vh", background: COLORS.offWhite, padding: "32px", fontFamily: "'Playfair Display', Georgia, serif", color: COLORS.blue, position: "relative" }}>
      <div style={{ maxWidth: "1200px", margin: "0 auto" }}>
        
        {/* Header igual ao Dashboard */}
        <header style={{ display: "flex", justifyContent: "space-between", alignItems: "center", marginBottom: "40px" }}>
          <div style={{ display: "flex", alignItems: "center", gap: "16px" }}>
            <div style={{ background: COLORS.blue, padding: "12px", color: COLORS.white, borderRadius: "12px" }}>
              <Scissors size={28} />
            </div>
            <div>
              <h1 style={{ fontSize: "32px", fontWeight: 900, margin: 0 }}>CORTE & ESTILO</h1>
              <p style={{ color: COLORS.red, fontSize: "12px", textTransform: "uppercase", letterSpacing: "0.2em", fontWeight: 700 }}>Gestão de Serviços</p>
            </div>
          </div>
          <button 
            onClick={handleOpenNew}
            style={{ background: COLORS.red, color: COLORS.white, padding: "12px 24px", borderRadius: "10px", border: "none", fontWeight: 700, cursor: "pointer", transition: "opacity 0.2s" }}
          >
            + Novo Serviço
          </button>
        </header>

        {/* Barra de Busca (Mesmo estilo dos inputs do Dashboard) */}
        <div style={{ background: COLORS.white, padding: "20px", borderRadius: "16px", border: `1px solid ${COLORS.grayLight}`, marginBottom: "32px", display: "flex", alignItems: "center", gap: "12px" }}>
          <Search size={20} color={COLORS.gray} />
          <input 
            type="text" 
            placeholder="Buscar serviço..." 
            value={search}
            onChange={(e) => setSearch(e.target.value)}
            style={{ width: "100%", border: "none", outline: "none", fontSize: "16px", fontFamily: "inherit", color: COLORS.blue }}
          />
        </div>

        {/* Tabela igual ao Dashboard */}
        <div style={{ background: COLORS.white, borderRadius: "20px", padding: "32px", border: `1px solid ${COLORS.grayLight}`, boxShadow: "0 4px 20px rgba(0,0,0,0.05)" }}>
          <h3 style={{ marginBottom: "24px", fontSize: "22px", marginTop: 0 }}>Catálogo de Serviços</h3>
          <table style={{ width: "100%", borderCollapse: "collapse" }}>
            <thead>
              <tr style={{ color: COLORS.gray, textAlign: "left", fontSize: "14px" }}>
                <th style={{ paddingBottom: "16px", textTransform: "uppercase", letterSpacing: "0.05em" }}>Serviço</th>
                <th style={{ paddingBottom: "16px", textTransform: "uppercase", letterSpacing: "0.05em" }}>Descrição</th>
                <th style={{ paddingBottom: "16px", textTransform: "uppercase", letterSpacing: "0.05em" }}>Preço</th>
                <th style={{ paddingBottom: "16px", textTransform: "uppercase", letterSpacing: "0.05em", textAlign: "right" }}>Ações</th>
              </tr>
            </thead>
            <tbody>
              {servicosFiltrados.length === 0 ? (
                <tr>
                  <td colSpan={4} style={{ padding: "20px 0", textAlign: "center", color: COLORS.gray }}>Nenhum serviço encontrado.</td>
                </tr>
              ) : (
                servicosFiltrados.map((servico) => (
                  <tr key={servico.id} style={{ borderTop: `1px solid ${COLORS.grayLight}` }}>
                    <td style={{ padding: "20px 0", fontWeight: 700, width: "20%" }}>{servico.serviceName}</td>
                    <td style={{ padding: "20px 0", color: COLORS.gray, fontSize: "14px", width: "45%", paddingRight: "20px" }}>{servico.description}</td>
                    <td style={{ padding: "20px 0", fontWeight: 700, color: COLORS.red, width: "15%" }}>
                      R$ {servico.price.toFixed(2).replace('.', ',')}
                    </td>
                    <td style={{ padding: "20px 0", textAlign: "right", width: "20%" }}>
                      <button onClick={() => handleOpenEdit(servico)} style={{ background: "transparent", border: "none", cursor: "pointer", color: COLORS.blue, marginRight: "16px" }}>
                        <Edit2 size={18} />
                      </button>
                      <button onClick={() => handleDelete(servico.id)} style={{ background: "transparent", border: "none", cursor: "pointer", color: COLORS.gray }}>
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

      {/* Modal igual ao do Dashboard */}
      {isModalOpen && (
        <div style={{ position: "fixed", top: 0, left: 0, right: 0, bottom: 0, background: COLORS.overlay, display: "flex", alignItems: "center", justifyContent: "center", zIndex: 50, padding: "20px" }}>
          <div style={{ background: COLORS.white, padding: "32px", borderRadius: "20px", width: "100%", maxWidth: "500px", position: "relative", boxShadow: "0 20px 40px rgba(0,0,0,0.2)" }}>
            
            <button onClick={() => setIsModalOpen(false)} style={{ position: "absolute", top: "24px", right: "24px", background: "none", border: "none", cursor: "pointer", color: COLORS.gray }}>
              <X size={24} />
            </button>

            <h3 style={{ fontSize: "24px", marginBottom: "24px", color: COLORS.blue, marginTop: 0 }}>
              {selectedService ? "Editar Serviço" : "Novo Serviço"}
            </h3>
            
            <form onSubmit={handleSubmit} style={{ display: "flex", flexDirection: "column", gap: "16px" }}>
              
              <div>
                <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>Nome do Serviço</label>
                <input 
                  type="text" 
                  required
                  value={formData.serviceName}
                  onChange={(e) => setFormData({...formData, serviceName: e.target.value})}
                  style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit" }}
                  placeholder="Ex: Corte Degrade"
                />
              </div>

              <div>
                <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>Preço (R$)</label>
                <input 
                  type="number" 
                  step="0.01"
                  required
                  value={formData.price}
                  onChange={(e) => setFormData({...formData, price: e.target.value})}
                  style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit" }}
                  placeholder="Ex: 35.00"
                />
              </div>

              <div>
                <label style={{ display: "block", fontSize: "12px", fontWeight: 700, color: COLORS.gray, marginBottom: "8px", textTransform: "uppercase" }}>Descrição</label>
                <textarea 
                  required
                  value={formData.description}
                  onChange={(e) => setFormData({...formData, description: e.target.value})}
                  style={{ width: "100%", padding: "12px", borderRadius: "8px", border: `1px solid ${COLORS.grayLight}`, boxSizing: "border-box", fontFamily: "inherit", minHeight: "80px", resize: "vertical" }}
                  placeholder="Detalhes sobre o serviço..."
                />
              </div>

              <button type="submit" style={{ background: COLORS.blue, color: COLORS.white, padding: "16px", borderRadius: "10px", border: "none", fontWeight: 700, cursor: "pointer", marginTop: "8px", fontSize: "16px" }}>
                {selectedService ? "Salvar Alterações" : "Cadastrar Serviço"}
              </button>
            </form>

          </div>
        </div>
      )}
    </div>
  );
}
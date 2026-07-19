"use client";

import React, { useEffect, useMemo, useState } from "react";
import {
  Users,
  Calendar,
  DollarSign,
  Clock,
  Scissors,
  X,
  Plus,
  Trash2,
} from "lucide-react";
import {
  getAtendimentos,
  Atendimento,
  StatusAtendimento,
} from "@/app/api/atendimentos/atendimentoService";
import { getClients } from "@/app/api/clients/clientService";
import { getServicos } from "@/app/api/servicos/servicoService";
// Importando o novo serviço de agendamentos/disponibilidade
import {
  criarAgendamento,
  NovoAgendamento,
} from "@/app/api/agendamentos/agendamentoService";
import { Cliente } from "@/types/cliente";
import { Servico } from "@/types/servico";

const COLORS = {
  red: "#C8102E",
  blue: "#1A3A6B",
  white: "#FFFFFF",
  offWhite: "#F8F7F5",
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  overlay: "rgba(26, 58, 107, 0.5)",
};

const STATUS_LABELS: Record<StatusAtendimento, string> = {
  CONFIRMADO: "Confirmado",
  PENDENTE: "Pendente",
  CANCELADO: "Cancelado",
  AGENDADO: "Agendado",
};

function hojeISO() {
  const agora = new Date();
  const ano = agora.getFullYear();
  const mes = String(agora.getMonth() + 1).padStart(2, "0");
  const dia = String(agora.getDate()).padStart(2, "0");
  return `${ano}-${mes}-${dia}`;
}

export default function AdminDashboard() {
  const [appointments, setAppointments] = useState<Atendimento[]>([]);
  const [clientes, setClientes] = useState<Cliente[]>([]);
  const [servicos, setServicos] = useState<Servico[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  // Estados para controlar o Modal e o novo formulário de disponibilidade
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [saving, setSaving] = useState(false);

  // Novo formato do formulário alinhado ao NovoAgendamento
  const [formData, setFormData] = useState<{
    data: string;
    horariosDisponiveis: string[];
  }>({
    data: hojeISO(),
    horariosDisponiveis: [],
  });
  const [novoHorario, setNovoHorario] = useState("");

  const carregarDados = () => {
    setLoading(true);
    setError(null);
    Promise.all([getAtendimentos(), getClients(), getServicos()])
      .then(([atendimentosData, clientesData, servicosData]) => {
        setAppointments(atendimentosData);
        setClientes(clientesData);
        setServicos(servicosData);
      })
      .catch(() => setError("Não foi possível carregar os dados do painel."))
      .finally(() => setLoading(false));
  };

  useEffect(() => {
    carregarDados();
  }, []);

  const clientesPorEmail = useMemo(() => {
    const mapa = new Map<string, Cliente>();
    clientes.forEach((c) => mapa.set(c.clientEmail.toLowerCase(), c));
    return mapa;
  }, [clientes]);

  const agendamentosDeHoje = useMemo(() => {
    const hoje = hojeISO();
    return appointments
      .filter((a) => a.data === hoje)
      .sort((a, b) => a.hora.localeCompare(b.hora));
  }, [appointments]);

  const faturamentoPrevisto = useMemo(() => {
    return agendamentosDeHoje
      .filter((a) => a.status !== "CANCELADO")
      .reduce((total, a) => total + Number(a.precoServico || 0), 0);
  }, [agendamentosDeHoje]);

  const nomeCliente = (emailClient: string) => {
    return (
      clientesPorEmail.get(emailClient.toLowerCase())?.clientName || emailClient
    );
  };

  // Adiciona um horário temporariamente na lista do formulário
  const handleAddHorarioLista = () => {
    if (!novoHorario || formData.horariosDisponiveis.includes(novoHorario))
      return;
    setFormData((prev) => ({
      ...prev,
      horariosDisponiveis: [...prev.horariosDisponiveis, novoHorario].sort(),
    }));
    setNovoHorario("");
  };

  // Remove um horário da lista do formulário
  const handleRemoveHorarioLista = (horarioRemover: string) => {
    setFormData((prev) => ({
      ...prev,
      horariosDisponiveis: prev.horariosDisponiveis.filter(
        (h) => h !== horarioRemover,
      ),
    }));
  };

  // Envia a nova janela de agendamento para a API
  const handleAddAppointment = async (e: React.FormEvent) => {
    e.preventDefault();

    if (!formData.data || formData.horariosDisponiveis.length === 0) {
      alert(
        "Por favor, selecione uma data e adicione pelo menos um horário disponível.",
      );
      return;
    }

    setSaving(true);
    try {
      const payload: NovoAgendamento = {
        data: formData.data,
        horariosDisponiveis: formData.horariosDisponiveis,
      };

      await criarAgendamento(payload);

      // Feedback de sucesso e reset
      alert("Nova janela de agendamentos cadastrada com sucesso!");
      setIsModalOpen(false);
      setFormData({ data: hojeISO(), horariosDisponiveis: [] });

      // Opcional: Se você quiser recarregar a lista geral após cadastrar
      carregarDados();
    } catch {
      alert(
        "Não foi possível salvar os horários de agendamento. Verifique os dados e tente novamente.",
      );
    } finally {
      setSaving(false);
    }
  };

  return (
    <div
      style={{
        minHeight: "100vh",
        background: COLORS.offWhite,
        padding: "32px",
        fontFamily: "'Playfair Display', Georgia, serif",
        color: COLORS.blue,
        position: "relative",
      }}
    >
      <div style={{ maxWidth: "1200px", margin: "0 auto" }}>
        {/* Header */}
        <header
          style={{
            display: "flex",
            justifyContent: "space-between",
            alignItems: "center",
            marginBottom: "40px",
          }}
        >
          <div style={{ display: "flex", alignItems: "center", gap: "16px" }}>
            <div
              style={{
                background: COLORS.blue,
                padding: "12px",
                color: COLORS.white,
                borderRadius: "12px",
              }}
            >
              <Scissors size={28} />
            </div>
            <div>
              <h1 style={{ fontSize: "32px", fontWeight: 900, margin: 0 }}>
                CORTE & ESTILO
              </h1>
              <p
                style={{
                  color: COLORS.red,
                  fontSize: "12px",
                  textTransform: "uppercase",
                  letterSpacing: "0.2em",
                  fontWeight: 700,
                }}
              >
                Painel Administrativo
              </p>
            </div>
          </div>
          <button
            onClick={() => setIsModalOpen(true)}
            style={{
              background: COLORS.red,
              color: COLORS.white,
              padding: "12px 24px",
              borderRadius: "10px",
              border: "none",
              fontWeight: 700,
              cursor: "pointer",
              transition: "opacity 0.2s",
            }}
          >
            + Abrir Horários
          </button>
        </header>

        {error && (
          <div
            style={{
              background: "#FDEDEC",
              color: COLORS.red,
              padding: "16px 20px",
              borderRadius: "12px",
              marginBottom: "24px",
              fontWeight: 600,
            }}
          >
            {error}
          </div>
        )}

        {/* Métricas */}
        <div
          style={{
            display: "grid",
            gridTemplateColumns: "repeat(4, 1fr)",
            gap: "20px",
            marginBottom: "40px",
          }}
        >
          <MetricCard
            title="Faturamento Previsto"
            value={`R$ ${faturamentoPrevisto.toFixed(2).replace(".", ",")}`}
            icon={<DollarSign />}
          />
          <MetricCard
            title="Agendamentos Hoje"
            value={agendamentosDeHoje.length.toString()}
            icon={<Calendar />}
          />
          <MetricCard
            title="Clientes"
            value={clientes.length.toString()}
            icon={<Users />}
          />
          <MetricCard
            title="Disponibilidade"
            value={Math.max(0, 10 - agendamentosDeHoje.length).toString()}
            icon={<Clock />}
          />
        </div>

        {/* Tabela */}
        <div
          style={{
            background: COLORS.white,
            borderRadius: "20px",
            padding: "32px",
            border: `1px solid ${COLORS.grayLight}`,
            boxShadow: "0 4px 20px rgba(0,0,0,0.05)",
          }}
        >
          <h3 style={{ marginBottom: "24px", fontSize: "22px" }}>
            Ordem do Dia
          </h3>
          <table style={{ width: "100%", borderCollapse: "collapse" }}>
            <thead>
              <tr
                style={{
                  color: COLORS.gray,
                  textAlign: "left",
                  fontSize: "14px",
                }}
              >
                <th style={{ paddingBottom: "16px" }}>Cavalheiro</th>
                <th style={{ paddingBottom: "16px" }}>Serviço</th>
                <th style={{ paddingBottom: "16px" }}>Horário</th>
                <th style={{ paddingBottom: "16px" }}>Status</th>
              </tr>
            </thead>
            <tbody>
              {loading ? (
                <tr>
                  <td
                    colSpan={4}
                    style={{
                      padding: "20px 0",
                      textAlign: "center",
                      color: COLORS.gray,
                    }}
                  >
                    Carregando agendamentos...
                  </td>
                </tr>
              ) : agendamentosDeHoje.length === 0 ? (
                <tr>
                  <td
                    colSpan={4}
                    style={{
                      padding: "20px 0",
                      textAlign: "center",
                      color: COLORS.gray,
                    }}
                  >
                    Nenhum agendamento para hoje.
                  </td>
                </tr>
              ) : (
                agendamentosDeHoje.map((appt) => (
                  <Row
                    key={appt.id}
                    name={nomeCliente(appt.emailClient)}
                    service={appt.nomeServico}
                    time={appt.hora}
                    status={STATUS_LABELS[appt.status]}
                  />
                ))
              )}
            </tbody>
          </table>
        </div>
      </div>

      {/* Modal de Nova Disponibilidade de Agendamento */}
      {isModalOpen && (
        <div
          style={{
            position: "fixed",
            top: 0,
            left: 0,
            right: 0,
            bottom: 0,
            background: COLORS.overlay,
            display: "flex",
            alignItems: "center",
            justifyContent: "center",
            zIndex: 50,
            padding: "20px",
          }}
        >
          <div
            style={{
              background: COLORS.white,
              padding: "32px",
              borderRadius: "20px",
              width: "100%",
              maxWidth: "420px",
              position: "relative",
              boxShadow: "0 20px 40px rgba(0,0,0,0.2)",
            }}
          >
            <button
              onClick={() => setIsModalOpen(false)}
              style={{
                position: "absolute",
                top: "24px",
                right: "24px",
                background: "none",
                border: "none",
                cursor: "pointer",
                color: COLORS.gray,
              }}
            >
              <X size={24} />
            </button>

            <h3
              style={{
                fontSize: "24px",
                marginBottom: "24px",
                color: COLORS.blue,
                marginTop: 0,
              }}
            >
              Liberar Agenda
            </h3>

            <form
              onSubmit={handleAddAppointment}
              style={{ display: "flex", flexDirection: "column", gap: "20px" }}
            >
              <div>
                <label
                  style={{
                    display: "block",
                    fontSize: "12px",
                    fontWeight: 700,
                    color: COLORS.gray,
                    marginBottom: "8px",
                    textTransform: "uppercase",
                  }}
                >
                  Data da Agenda
                </label>
                <input
                  type="date"
                  required
                  value={formData.data}
                  onChange={(e) =>
                    setFormData({ ...formData, data: e.target.value })
                  }
                  style={{
                    width: "100%",
                    padding: "12px",
                    borderRadius: "8px",
                    border: `1px solid ${COLORS.grayLight}`,
                    boxSizing: "border-box",
                    fontFamily: "inherit",
                  }}
                />
              </div>

              <div>
                <label
                  style={{
                    display: "block",
                    fontSize: "12px",
                    fontWeight: 700,
                    color: COLORS.gray,
                    marginBottom: "8px",
                    textTransform: "uppercase",
                  }}
                >
                  Adicionar Horário
                </label>
                <div style={{ display: "flex", gap: "8px" }}>
                  <input
                    type="time"
                    value={novoHorario}
                    onChange={(e) => setNovoHorario(e.target.value)}
                    style={{
                      flex: 1,
                      padding: "12px",
                      borderRadius: "8px",
                      border: `1px solid ${COLORS.grayLight}`,
                      fontFamily: "inherit",
                    }}
                  />
                  <button
                    type="button"
                    onClick={handleAddHorarioLista}
                    style={{
                      background: COLORS.blue,
                      color: COLORS.white,
                      border: "none",
                      borderRadius: "8px",
                      padding: "0 16px",
                      cursor: "pointer",
                      display: "flex",
                      alignItems: "center",
                      justifyContent: "center",
                    }}
                  >
                    <Plus size={20} />
                  </button>
                </div>
              </div>

              {/* Lista visual dos horários adicionados */}
              <div>
                <label
                  style={{
                    display: "block",
                    fontSize: "12px",
                    fontWeight: 700,
                    color: COLORS.gray,
                    marginBottom: "8px",
                    textTransform: "uppercase",
                  }}
                >
                  Horários Selecionados
                </label>
                {formData.horariosDisponiveis.length === 0 ? (
                  <p
                    style={{
                      color: COLORS.gray,
                      fontSize: "14px",
                      margin: "4px 0",
                      fontStyle: "italic",
                    }}
                  >
                    Nenhum horário adicionado ainda.
                  </p>
                ) : (
                  <div
                    style={{
                      display: "flex",
                      flexWrap: "wrap",
                      gap: "8px",
                      maxHeight: "120px",
                      overflowY: "auto",
                      padding: "4px",
                    }}
                  >
                    {formData.horariosDisponiveis.map((hr) => (
                      <span
                        key={hr}
                        style={{
                          display: "inline-flex",
                          alignItems: "center",
                          gap: "6px",
                          background: COLORS.offWhite,
                          border: `1px solid ${COLORS.grayLight}`,
                          padding: "6px 12px",
                          borderRadius: "20px",
                          fontSize: "14px",
                          fontWeight: 700,
                          color: COLORS.blue,
                        }}
                      >
                        {hr}
                        <Trash2
                          size={14}
                          style={{ color: COLORS.red, cursor: "pointer" }}
                          onClick={() => handleRemoveHorarioLista(hr)}
                        />
                      </span>
                    ))}
                  </div>
                )}
              </div>

              <button
                type="submit"
                disabled={saving}
                style={{
                  background: COLORS.red,
                  color: COLORS.white,
                  padding: "16px",
                  borderRadius: "10px",
                  border: "none",
                  fontWeight: 700,
                  cursor: saving ? "default" : "pointer",
                  marginTop: "8px",
                  fontSize: "16px",
                  opacity: saving ? 0.7 : 1,
                }}
              >
                {saving ? "Salvando..." : "Salvar Disponibilidade"}
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
    <div
      style={{
        background: COLORS.white,
        padding: "24px",
        borderRadius: "16px",
        border: `1px solid ${COLORS.grayLight}`,
      }}
    >
      <div style={{ color: COLORS.blue, marginBottom: "12px" }}>{icon}</div>
      <p
        style={{
          color: COLORS.gray,
          fontSize: "12px",
          textTransform: "uppercase",
          margin: 0,
        }}
      >
        {title}
      </p>
      <p style={{ fontSize: "22px", fontWeight: 700, margin: "4px 0 0" }}>
        {value}
      </p>
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
        <span
          style={{
            fontSize: "11px",
            padding: "6px 12px",
            borderRadius: "20px",
            background: status === "Confirmado" ? COLORS.red : "#F5A623",
            color: COLORS.white,
            fontWeight: 700,
          }}
        >
          {status}
        </span>
      </td>
    </tr>
  );
}

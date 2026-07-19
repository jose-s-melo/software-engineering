"use client";

import React, { useState, useEffect } from "react";
import { Scissors, X, Search, Edit2, Trash2 } from "lucide-react";
import { Servico } from "@/types/servico"; 
import {
  getServicos,
  getServico,
  createServico,
  updateServico,
  deleteServico
} from "@/app/api/servicos/servicoService";

const COLORS = {
  red: "#C8102E",
  blue: "#1A3A6B",
  white: "#FFFFFF",
  offWhite: "#F8F7F5",
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  overlay: "rgba(26, 58, 107, 0.5)",
};

type FormData = {
  serviceName: string;
  price: string;
  description: string;
  estimatedTime: string;
};

const initialFormData: FormData = {
  serviceName: "",
  price: "",
  description: "",
  estimatedTime: "",
};

export default function ServicosAdminPage() {
  const [search, setSearch] = useState("");
  const [servicos, setServicos] = useState<Servico[]>([]);
  const [loading, setLoading] = useState(true);
  const [saving, setSaving] = useState(false);
  const [error, setError] = useState<string | null>(null);

  const [isModalOpen, setIsModalOpen] = useState(false);
  const [selectedService, setSelectedService] = useState<Servico | null>(null);
  const [formData, setFormData] = useState<FormData>(initialFormData);

  useEffect(() => {
    carregarServicos();
  }, []);

  async function carregarServicos() {
    try {
      setLoading(true);
      setError(null);

      const data = await getServicos();

      setServicos(data);
    } catch (error) {
      console.error("Erro ao carregar serviços:", error);
      setError("Não foi possível carregar os serviços.");
    } finally {
      setLoading(false);
    }
  }

  const servicosFiltrados = servicos.filter((servico) => {
        if (servico.serviceName) {
            return servico.serviceName.toLowerCase().includes(search.toLowerCase());
        }
    }
  );

  const handleOpenNew = () => {
    setSelectedService(null);
    setFormData(initialFormData);
    setIsModalOpen(true);
  };

  const handleOpenEdit = (servico: Servico) => {
    setSelectedService(servico);

    setFormData({
      serviceName: servico.serviceName,
      price: servico.price.toString(),
      description: servico.description,
      estimatedTime: servico.estimatedTime,
    });

    setIsModalOpen(true);
  };

  const handleDelete = async (id: string) => {
    if (!confirm("Tem certeza que deseja excluir este serviço?")) {
      return;
    }

    const servicosAnteriores = servicos;

    setServicos((prev) => prev.filter((servico) => servico.id !== id));

    try {
      await deleteServico(id);
    } catch (error) {
      console.error("Erro ao excluir serviço:", error);

      setServicos(servicosAnteriores);

      alert("Não foi possível excluir o serviço. Tente novamente.");
    }
  };

  const handleSubmit = async (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    if (
      !formData.serviceName ||
      !formData.price ||
      !formData.description ||
      !formData.estimatedTime
    ) {
      return;
    }

    const price = Number(formData.price);

    if (Number.isNaN(price) || price <= 0) {
      alert("Informe um preço válido.");
      return;
    }

    const serviceData = {
      serviceName: formData.serviceName,
      price,
      description: formData.description,
      estimatedTime: formData.estimatedTime,
    };

    try {
      setSaving(true);

      if (selectedService) {
        const servicoAtualizado = await updateServico(
          selectedService.id,
          serviceData,
        );

        setServicos((prev) =>
          prev.map((servico) =>
            servico.id === selectedService.id ? servicoAtualizado : servico,
          ),
        );
      } else {
        const novoServico = await createServico(serviceData);

        setServicos((prev) => [...prev, novoServico]);
      }

      setIsModalOpen(false);
      setFormData(initialFormData);
      setSelectedService(null);
    } catch (error) {
      console.error("Erro ao salvar serviço:", error);

      alert(
        "Não foi possível salvar o serviço. Verifique os dados e tente novamente.",
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
                Gestão de Serviços
              </p>
            </div>
          </div>

          <button
            onClick={handleOpenNew}
            style={{
              background: COLORS.red,
              color: COLORS.white,
              padding: "12px 24px",
              borderRadius: "10px",
              border: "none",
              fontWeight: 700,
              cursor: "pointer",
            }}
          >
            + Novo Serviço
          </button>
        </header>

        <div
          style={{
            background: COLORS.white,
            padding: "20px",
            borderRadius: "16px",
            border: `1px solid ${COLORS.grayLight}`,
            marginBottom: "32px",
            display: "flex",
            alignItems: "center",
            gap: "12px",
          }}
        >
          <Search size={20} color={COLORS.gray} />

          <input
            type="text"
            placeholder="Buscar serviço..."
            value={search}
            onChange={(e) => setSearch(e.target.value)}
            style={{
              width: "100%",
              border: "none",
              outline: "none",
              fontSize: "16px",
              fontFamily: "inherit",
              color: COLORS.blue,
            }}
          />
        </div>

        <div
          style={{
            background: COLORS.white,
            borderRadius: "20px",
            padding: "32px",
            border: `1px solid ${COLORS.grayLight}`,
            boxShadow: "0 4px 20px rgba(0,0,0,0.05)",
          }}
        >
          <h3
            style={{
              marginBottom: "24px",
              fontSize: "22px",
              marginTop: 0,
            }}
          >
            Catálogo de Serviços
          </h3>

          <table
            style={{
              width: "100%",
              borderCollapse: "collapse",
            }}
          >
            <thead>
              <tr
                style={{
                  color: COLORS.gray,
                  textAlign: "left",
                  fontSize: "14px",
                }}
              >
                <th style={{ paddingBottom: "16px" }}>Serviço</th>
                <th style={{ paddingBottom: "16px" }}>Descrição</th>
                <th style={{ paddingBottom: "16px" }}>Tempo</th>
                <th style={{ paddingBottom: "16px" }}>Preço</th>
                <th
                  style={{
                    paddingBottom: "16px",
                    textAlign: "right",
                  }}
                >
                  Ações
                </th>
              </tr>
            </thead>

            <tbody>
              {loading ? (
                <tr>
                  <td
                    colSpan={5}
                    style={{
                      padding: "20px 0",
                      textAlign: "center",
                      color: COLORS.gray,
                    }}
                  >
                    Carregando serviços...
                  </td>
                </tr>
              ) : error ? (
                <tr>
                  <td
                    colSpan={5}
                    style={{
                      padding: "20px 0",
                      textAlign: "center",
                      color: COLORS.red,
                    }}
                  >
                    {error}
                  </td>
                </tr>
              ) : servicosFiltrados.length === 0 ? (
                <tr>
                  <td
                    colSpan={5}
                    style={{
                      padding: "20px 0",
                      textAlign: "center",
                      color: COLORS.gray,
                    }}
                  >
                    Nenhum serviço encontrado.
                  </td>
                </tr>
              ) : (
                servicosFiltrados.map((servico) => (
                  <tr
                    key={servico.id}
                    style={{
                      borderTop: `1px solid ${COLORS.grayLight}`,
                    }}
                  >
                    <td
                      style={{
                        padding: "20px 0",
                        fontWeight: 700,
                        width: "20%",
                      }}
                    >
                      {servico.serviceName}
                    </td>

                    <td
                      style={{
                        padding: "20px 0",
                        color: COLORS.gray,
                        fontSize: "14px",
                        width: "35%",
                        paddingRight: "20px",
                      }}
                    >
                      {servico.description}
                    </td>

                    <td
                      style={{
                        padding: "20px 0",
                        color: COLORS.gray,
                        width: "15%",
                      }}
                    >
                      {servico.estimatedTime}
                    </td>

                    <td
                      style={{
                        padding: "20px 0",
                        fontWeight: 700,
                        color: COLORS.red,
                        width: "15%",
                      }}
                    >
                      R$ {servico.price.toFixed(2).replace(".", ",")}
                    </td>

                    <td
                      style={{
                        padding: "20px 0",
                        textAlign: "right",
                        width: "15%",
                      }}
                    >
                      <button
                        onClick={() => handleOpenEdit(servico)}
                        style={{
                          background: "transparent",
                          border: "none",
                          cursor: "pointer",
                          color: COLORS.blue,
                          marginRight: "16px",
                        }}
                      >
                        <Edit2 size={18} />
                      </button>

                      <button
                        onClick={() => handleDelete(servico.id)}
                        style={{
                          background: "transparent",
                          border: "none",
                          cursor: "pointer",
                          color: COLORS.gray,
                        }}
                      >
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
              maxWidth: "500px",
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
              {selectedService ? "Editar Serviço" : "Novo Serviço"}
            </h3>

            <form
              onSubmit={handleSubmit}
              style={{
                display: "flex",
                flexDirection: "column",
                gap: "16px",
              }}
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
                  Nome do Serviço
                </label>

                <input
                  type="text"
                  required
                  value={formData.serviceName}
                  onChange={(e) =>
                    setFormData({
                      ...formData,
                      serviceName: e.target.value,
                    })
                  }
                  style={{
                    width: "100%",
                    padding: "12px",
                    borderRadius: "8px",
                    border: `1px solid ${COLORS.grayLight}`,
                    boxSizing: "border-box",
                    fontFamily: "inherit",
                  }}
                  placeholder="Ex: Corte Degradê"
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
                  Preço (R$)
                </label>

                <input
                  type="number"
                  step="0.01"
                  min="0"
                  required
                  value={formData.price}
                  onChange={(e) =>
                    setFormData({
                      ...formData,
                      price: e.target.value,
                    })
                  }
                  style={{
                    width: "100%",
                    padding: "12px",
                    borderRadius: "8px",
                    border: `1px solid ${COLORS.grayLight}`,
                    boxSizing: "border-box",
                    fontFamily: "inherit",
                  }}
                  placeholder="Ex: 35.00"
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
                  Tempo Estimado
                </label>

                <input
                  type="text"
                  required
                  value={formData.estimatedTime}
                  onChange={(e) =>
                    setFormData({
                      ...formData,
                      estimatedTime: e.target.value,
                    })
                  }
                  style={{
                    width: "100%",
                    padding: "12px",
                    borderRadius: "8px",
                    border: `1px solid ${COLORS.grayLight}`,
                    boxSizing: "border-box",
                    fontFamily: "inherit",
                  }}
                  placeholder="Ex: 00:45"
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
                  Descrição
                </label>

                <textarea
                  required
                  value={formData.description}
                  onChange={(e) =>
                    setFormData({
                      ...formData,
                      description: e.target.value,
                    })
                  }
                  style={{
                    width: "100%",
                    padding: "12px",
                    borderRadius: "8px",
                    border: `1px solid ${COLORS.grayLight}`,
                    boxSizing: "border-box",
                    fontFamily: "inherit",
                    minHeight: "80px",
                    resize: "vertical",
                  }}
                  placeholder="Detalhes sobre o serviço..."
                />
              </div>

              <button
                type="submit"
                disabled={saving}
                style={{
                  background: COLORS.blue,
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
                {saving
                  ? "Salvando..."
                  : selectedService
                    ? "Salvar Alterações"
                    : "Cadastrar Serviço"}
              </button>
            </form>
          </div>
        </div>
      )}
    </div>
  );
}
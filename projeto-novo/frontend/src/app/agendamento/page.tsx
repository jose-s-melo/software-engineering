"use client";

import { useState, useEffect } from "react";
import localFont from "next/font/local";
import {
  criarAtendimento,
  getAtendimentosPorCliente,
  cancelarAtendimento,
  Atendimento,
  NovoAtendimentoCliente,
} from "@/app/api/atendimentos/atendimentoService";
import { Servico } from "@/types/servico";
import api from "@/app/api/auth/api";
import { getServicos } from "../api/servicos/servicoService";

const fonteMagilio = localFont({
  src: "../../fonts/MagilioRegular-8Mxvg.otf",
  display: "swap",
});
const fonteHarmondBold = localFont({
  src: "../../fonts/Harmond-ExtraBoldExpanded.otf",
  display: "swap",
});
const fonteNewake = localFont({
  src: "../../fonts/Newake-Font-Demo.otf",
  display: "swap",
});
const fonteAttena = localFont({
  src: "../../fonts/Attena.otf",
  display: "swap",
});
const fonteStrong = localFont({
  src: "../../fonts/Strong.ttf",
  display: "swap",
});
const fonteGotham = localFont({
  src: "../../fonts/GothamBold.ttf",
  display: "swap",
});

const COLORS = {
  red: "#C8102E",
  redDark: "#9B0C21",
  redLight: "#FDEAEA",
  blue: "#1A3A6B",
  blueMid: "#1E4D8C",
  blueLight: "#E8EEF7",
  white: "#FFFFFF",
  offWhite: "#F8F7F5",
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  grayLighter: "#F2F1EE",
  text: "#1A1A1A",
};

interface DisponibilidadeDTO {
  id: string;
  data: string;
  diaSemana: string;
  horariosDisponiveis: string[];
}

export default function AgendamentoPage() {
  const [datas, setDatas] = useState<any[]>([]);

  const [dataSelecionada, setDataSelecionada] = useState(() => {
    return new Date().toISOString().split("T")[0];
  });

  const [servicoSelecionado, setServicoSelecionado] = useState<string | null>(
    null,
  );
  const [horarioSelecionado, setHorarioSelecionado] = useState("");
  const [servicos, setServicos] = useState<Servico[]>([]);
  const [horariosDisponiveis, setHorariosDisponiveis] = useState<string[]>([]);
  const [carregandoServicos, setCarregandoServicos] = useState(true);
  const [carregandoHorarios, setCarregandoHorarios] = useState(false);

  const [meusAgendamentos, setMeusAgendamentos] = useState<Atendimento[]>([]);
  const [carregandoMeusAgendamentos, setCarregandoMeusAgendamentos] = useState(true);
  const [cancelandoId, setCancelandoId] = useState<string | null>(null);

  const carregarMeusAgendamentos = async () => {
    const email = localStorage.getItem("email");
    if (!email) {
      setCarregandoMeusAgendamentos(false);
      return;
    }
    try {
      setCarregandoMeusAgendamentos(true);
      const data = await getAtendimentosPorCliente(email);
      setMeusAgendamentos(data);
    } catch (err) {
      console.error("Erro ao buscar meus agendamentos:", err);
    } finally {
      setCarregandoMeusAgendamentos(false);
    }
  };

  useEffect(() => {
    carregarMeusAgendamentos();
  }, []);

  const handleCancelarMeuAgendamento = async (atendimento: Atendimento) => {
    if (!window.confirm(`Cancelar seu agendamento de ${atendimento.nomeServico}?`)) return;

    setCancelandoId(atendimento.id);
    try {
      const atualizado = await cancelarAtendimento(atendimento.id);
      setMeusAgendamentos((prev) =>
        prev.map((a) => (a.id === atualizado.id ? atualizado : a))
      );
    } catch (err) {
      console.error("Erro ao cancelar agendamento:", err);
      alert("Não foi possível cancelar o agendamento.");
    } finally {
      setCancelandoId(null);
    }
  };

  useEffect(() => {
    const gerarProximosDias = () => {
      const diasGerados = [];
      const hoje = new Date();
      const diasDaSemana = ["DOM", "SEG", "TER", "QUA", "QUI", "SEX", "SÁB"];
      const meses = [
        "JAN",
        "FEV",
        "MAR",
        "ABR",
        "MAI",
        "JUN",
        "JUL",
        "AGO",
        "SET",
        "OUT",
        "NOV",
        "DEZ",
      ];

      for (let i = 0; i < 15; i++) {
        const dataAtual = new Date();
        dataAtual.setDate(hoje.getDate() + i);

        let nomeDia = diasDaSemana[dataAtual.getDay()];
        if (i === 0) nomeDia = "HOJE";
        else if (i === 1) nomeDia = "AMANHÃ";

        const numeroDia = dataAtual.getDate().toString().padStart(2, "0");
        const idData = dataAtual.toISOString().split("T")[0];

        diasGerados.push({
          id: idData,
          dia: nomeDia,
          numero: numeroDia,
          mes: meses[dataAtual.getMonth()],
        });
      }
      setDatas(diasGerados);
    };

    gerarProximosDias();
  }, []);

  useEffect(() => {
    const buscarServicos = async () => {
      try {
        setCarregandoServicos(true);
        const data = await getServicos();
        console.log("Serviços buscados:", data);
        setServicos(data || []);
      } catch (err) {
        console.error("Erro ao buscar serviços:", err);
        setServicos([]);
      } finally {
        setCarregandoServicos(false);
      }
    };
    buscarServicos();
  }, []);

  useEffect(() => {
    if (!dataSelecionada) return;

    const buscarHorarios = async () => {
      try {
        setCarregandoHorarios(true);
        const response = await api.get<DisponibilidadeDTO>(
          "agendamentos/disponibilidade",
          {
            params: { data: dataSelecionada },
          },
        );

        if (response.data && response.data.horariosDisponiveis) {
          setHorariosDisponiveis([...response.data.horariosDisponiveis]);
        } else {
          setHorariosDisponiveis([]);
        }
        setHorarioSelecionado("");
      } catch (err) {
        console.error("Erro na requisição de horários:", err);
        setHorariosDisponiveis([]);
      } finally {
        setCarregandoHorarios(false);
      }
    };

    buscarHorarios();
  }, [dataSelecionada]);

  const handleConfirmarAgendamento = async () => {
    if (!servicoSelecionado || !dataSelecionada || !horarioSelecionado) {
      alert("Por favor, preencha todos os campos antes de agendar.");
      return;
    }

    const pacoteDeDados: NovoAtendimentoCliente = {
      servicoId: servicoSelecionado,
      data: dataSelecionada,
      horarioEscolhido: horarioSelecionado,
    };

    try {
      await criarAtendimento(pacoteDeDados);
      alert("Agendamento realizado com sucesso!");
      setServicoSelecionado(null);
      setHorarioSelecionado("");
      carregarMeusAgendamentos();
    } catch (error) {
      console.error("Erro ao agendar:", error);
      alert("Erro ao confirmar agendamento. O servidor retornou um erro.");
    }
  };

  const renderSelecaoDatas = () => (
    <div className="flex gap-4 mb-10 overflow-x-auto pb-6 pt-2 px-2">
      {datas.map((data) => {
        const isSelected = dataSelecionada === data.id;
        return (
          <button
            key={data.id}
            onClick={() => setDataSelecionada(data.id)}
            style={
              isSelected
                ? {
                    backgroundColor: COLORS.redDark,
                    borderColor: COLORS.redDark,
                  }
                : { borderColor: COLORS.grayLight }
            }
            className={`flex flex-col items-center justify-center min-w-[90px] h-[100px] rounded-none border transition-transform duration-300 hover:scale-110 shadow-lg ${
              isSelected ? "text-white" : "bg-transparent text-gray-800"
            }`}
          >
            <span className="text-[10px] font-bold tracking-wider uppercase">
              {data.dia}
            </span>
            <span className="text-3xl font-bold my-1">{data.numero}</span>
            <span className="text-xs font-semibold uppercase">{data.mes}</span>
          </button>
        );
      })}
    </div>
  );

  const renderPainelServicos = () => (
    <div
      style={{ backgroundColor: COLORS.blue }}
      className="p-8 rounded-none border border-transparent shadow-xl"
    >
      <h2
        style={{ color: COLORS.white }}
        className={`${fonteGotham.className} text-base tracking-[0.1px] mb-2`}
      >
        ESCOLHA O SERVIÇO
      </h2>
      <div
        style={{ borderColor: COLORS.blueMid }}
        className="border-b mb-6 w-full"
      />

      {carregandoServicos ? (
        <p className="text-blue-200 italic text-center py-6">
          Carregando serviços disponíveis...
        </p>
      ) : servicos.length === 0 ? (
        <div className="text-center py-6">
          <p className="text-blue-200 italic mb-2">
            Nenhum serviço encontrado ou disponível no momento.
          </p>
        </div>
      ) : (
        <div className="grid grid-cols-1 md:grid-cols-3 gap-6">
          {servicos.map((servico) => {
            const isSelected = servicoSelecionado === servico.id;
            return (
              <button
                key={servico.id}
                onClick={() => setServicoSelecionado(servico.id)}
                className={`flex flex-col items-start p-6 bg-blue-900 hover:bg-blue-800 text-white rounded-none border transition-transform duration-300 hover:scale-105 shadow-md w-full ${
                  isSelected
                    ? "ring-2 ring-red-500 border-white"
                    : "border-transparent"
                }`}
              >
                <span
                  style={{ color: COLORS.white }}
                  className={`${fonteStrong.className} tracking-wider text-lg mb-2`}
                >
                  {/* AJUSTADO: servico.serviceName */}
                  {servico.serviceName}
                </span>
                <span className="text-blue-300 text-sm mb-4">
                  {/* AJUSTADO: servico.estimatedTime */}
                  {servico.estimatedTime || "Tempo não estimado"}
                </span>
                <span
                  style={{
                    color: COLORS.blue,
                    backgroundColor: COLORS.offWhite,
                  }}
                  className="font-extrabold text-xl mt-auto px-3 py-1"
                >
                  {/* AJUSTADO: servico.price */}
                  R$ {servico.price}
                </span>
              </button>
            );
          })}
        </div>
      )}
    </div>
  );

  const STATUS_LABELS: Record<string, string> = {
    CONFIRMADO: "Confirmado",
    PENDENTE: "Pendente",
    CANCELADO: "Cancelado",
    AGENDADO: "Agendado",
  };

  const renderMeusAgendamentos = () => (
    <div className="mt-12">
      <h2
        style={{ color: COLORS.text }}
        className={`${fonteGotham.className} text-base tracking-[0.1px] mb-2`}
      >
        MEUS AGENDAMENTOS
      </h2>
      <div style={{ borderColor: COLORS.grayLight }} className="border-b mb-6 w-full" />

      {carregandoMeusAgendamentos ? (
        <p className="text-gray-500 italic text-center py-6">Carregando seus agendamentos...</p>
      ) : meusAgendamentos.length === 0 ? (
        <p className="text-gray-500 italic text-center py-6">
          Você ainda não tem nenhum agendamento.
        </p>
      ) : (
        <div className="flex flex-col gap-4">
          {meusAgendamentos.map((atendimento) => (
            <div
              key={atendimento.id}
              style={{ borderColor: COLORS.grayLight }}
              className="flex items-center justify-between gap-4 p-5 border bg-white shadow-sm flex-wrap"
            >
              <div>
                <p style={{ color: COLORS.text }} className="font-bold">
                  {atendimento.nomeServico}
                </p>
                <p style={{ color: COLORS.gray }} className="text-sm">
                  {atendimento.data
                    ? `${atendimento.data.split("-").reverse().join("/")} às ${atendimento.hora}`
                    : atendimento.hora}
                </p>
              </div>

              <div className="flex items-center gap-3">
                <span
                  style={{
                    color:
                      atendimento.status === "CONFIRMADO"
                        ? "#1E7E34"
                        : atendimento.status === "CANCELADO"
                        ? COLORS.red
                        : "#8A6D00",
                  }}
                  className="text-xs font-bold uppercase tracking-wider"
                >
                  {STATUS_LABELS[atendimento.status] || atendimento.status}
                </span>

                {atendimento.status !== "CANCELADO" && (
                  <button
                    onClick={() => handleCancelarMeuAgendamento(atendimento)}
                    disabled={cancelandoId === atendimento.id}
                    style={{ borderColor: COLORS.red, color: COLORS.red }}
                    className="px-3 py-2 text-xs font-bold uppercase border hover:bg-red-50 transition-colors disabled:opacity-50"
                  >
                    {cancelandoId === atendimento.id ? "Cancelando..." : "Cancelar"}
                  </button>
                )}
              </div>
            </div>
          ))}
        </div>
      )}
    </div>
  );

  const renderModalHorarios = () => {
    if (servicoSelecionado === null) return null;

    return (
      <div className="fixed inset-0 bg-black/70 flex items-center justify-center z-50 px-4">
        <div className="bg-blue-950 p-8 rounded-none border border-blue-900 w-full max-w-2xl shadow-2xl">
          <div className="flex justify-between items-center mb-6 pb-4 border-b border-blue-800">
            <h3
              style={{ color: COLORS.white }}
              className={`${fonteStrong.className} text-2xl`}
            >
              Horários Disponíveis
            </h3>
            <button
              onClick={() => {
                setServicoSelecionado(null);
                setHorarioSelecionado("");
              }}
              className="text-blue-300 hover:text-white text-xl font-bold px-4 py-2 hover:bg-blue-900 transition-colors rounded-none"
            >
              X
            </button>
          </div>

          <div className="flex flex-wrap gap-4 mt-8 justify-center">
            {carregandoHorarios ? (
              <p className="text-blue-300 italic text-center w-full py-4">
                Buscando horários na agenda...
              </p>
            ) : horariosDisponiveis.length === 0 ? (
              <p className="text-blue-300 italic text-center w-full py-4">
                Nenhum horário disponível para esta data.
              </p>
            ) : (
              horariosDisponiveis.map((horaString) => {
                const isSelected = horarioSelecionado === horaString;
                return (
                  <button
                    key={horaString}
                    onClick={() => setHorarioSelecionado(horaString)}
                    style={
                      isSelected ? { backgroundColor: COLORS.redDark } : {}
                    }
                    className="flex flex-col items-center justify-center w-[100px] py-2 rounded-none font-bold transition-transform duration-300 text-white bg-blue-900 hover:bg-blue-800 hover:scale-110"
                  >
                    <span className="text-[9px] uppercase tracking-wider mb-1 font-normal opacity-80">
                      {isSelected ? "Selecionado" : "Agendar"}
                    </span>
                    <span style={{ color: COLORS.white }} className="text-lg">
                      {horaString}
                    </span>
                  </button>
                );
              })
            )}
          </div>

          {horarioSelecionado && (
            <button
              onClick={handleConfirmarAgendamento}
              style={{ backgroundColor: COLORS.redDark }}
              className={`${fonteGotham.className} w-full mt-10 hover:opacity-90 text-white font-bold py-4 rounded-none transition-colors text-lg`}
            >
              CONFIRMAR AGENDAMENTO
            </button>
          )}
        </div>
      </div>
    );
  };

  return (
    <div
      style={{ backgroundColor: COLORS.offWhite }}
      className="min-h-screen flex flex-col items-center py-12 px-4 relative"
    >
      <div className="w-full max-w-4xl">
        <h1
          style={{ color: COLORS.text }}
          className={`${fonteAttena.className} text-5xl mb-8`}
        >
          AGENDE SEU HORÁRIO
        </h1>

        {renderSelecaoDatas()}
        {renderPainelServicos()}
        {renderMeusAgendamentos()}
      </div>

      {renderModalHorarios()}
    </div>
  );
}

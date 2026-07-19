"use client";

import { useState, useEffect } from "react";
import localFont from 'next/font/local';
import { criarAtendimento } from "../api/atendimentos/atendimentoService";
import { Servico } from "@/types/servico";
import api from "../api/auth/api";
import { Horario } from "@/types/horario";

// Fontes de texto oriundas de src/fonts
const fonteMagilio = localFont({ 
  src: '../../fonts/MagilioRegular-8Mxvg.otf',
  display: 'swap',
});

const fonteHarmondBold = localFont({ 
  src: '../../fonts/Harmond-ExtraBoldExpanded.otf',
  display: 'swap',
});

const fonteNewake = localFont({ 
  src: '../../fonts/Newake-Font-Demo.otf',
  display: 'swap',
});

const fonteAttena = localFont({ 
  src: '../../fonts/Attena.otf',
  display: 'swap',
});

const fonteStrong = localFont({
  src: '../../fonts/Strong.ttf',
  display: 'swap',
});

const fonteGotham = localFont({
  src: '../../fonts/GothamBold.ttf',
  display: 'swap',
})

const COLORS = {
  red: "#C8102E",
  redDark: "#9B0C21",
  redLight: "#FDEAEA",
  blue: "#1A3A6B",
  blueMid: "#1E4D8C",
  blueLight: "#E8EEF7",
  white: "#FFFFFF",
  offWhite: "#F8F7F5", // Substituiu o antigo #F4F1EA
  gray: "#6B6B6B",
  grayLight: "#E5E3DF",
  grayLighter: "#F2F1EE",
  text: "#1A1A1A",
};

export default function AgendamentoPage() {
  const [datas, setDatas] = useState<any[]>([]);
  const [dataSelecionada, setDataSelecionada] = useState("");
  const [servicoSelecionado, setServicoSelecionado] = useState<string | null>(null);
  const [horarioSelecionado, setHorarioSelecionado] = useState("");

  // Gera os 15 próximos dias (Agendamento só disponível até 14 dias depois do dia atual)
  useEffect(() => {
    const gerarProximosDias = () => {
      const diasGerados = [];
      const hoje = new Date();
      const diasDaSemana = ["DOM", "SEG", "TER", "QUA", "QUI", "SEX", "SÁB"];
      const meses = ["JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"];

      for (let i = 0; i < 15; i++) {
        const dataAtual = new Date();
        dataAtual.setDate(hoje.getDate() + i);

        let nomeDia = diasDaSemana[dataAtual.getDay()];
        if (i === 0) nomeDia = "HOJE";
        else if (i === 1) nomeDia = "AMANHÃ";

        const numeroDia = dataAtual.getDate().toString().padStart(2, "0");
        const idData = dataAtual.toISOString().split("T")[0];

        diasGerados.push({ id: idData, dia: nomeDia, numero: numeroDia, mes: meses[dataAtual.getMonth()] });
      }

      setDatas(diasGerados);
      setDataSelecionada(diasGerados[0].id);
    };

    gerarProximosDias();
  }, []);

  const [servicos, setServicos] = useState<Servico[]>([]);

  // Método de serviços integrado a API, totalmente desmockado.
  useEffect(() => {
    const buscarServicos = async () => {
      try {
        const response = await api.get("servicos");
        setServicos(response.data);
      } catch (err) {
        console.error(err);
      }
    };
    buscarServicos();
  }, []);

  const [horarios, setHorarios] = useState<Horario[]>([]);

  //Método de horario integrado a API, totalmente desmockado.
  useEffect(() => {
    if (!dataSelecionada) return;
    const buscarHorarios = async () => {
      try {
        const response = await api.get("agendamentos/disponibilidade", {
          params: { data: dataSelecionada }
        });
        setHorarios(response.data);
      } catch (err) {
        console.error(err);
      }
    };

    buscarHorarios();
  }, [dataSelecionada]);


  //Método para integrar o agendamento à API
  const handleConfirmarAgendamento = async () => {
    if (!servicoSelecionado || !dataSelecionada || !horarioSelecionado) {
      alert("Por favor, preencha todos os campos antes de agendar.");
      return;
    }

    const pacoteDeDados = {
      servicoId: servicoSelecionado, 
      data: dataSelecionada,
      horarioEscolhido: horarioSelecionado
    };

    try {
      await criarAtendimento(pacoteDeDados);
      
      alert("Agendamento realizado com sucesso!");
      
    } catch (error) {
      console.error("Erro ao agendar:", error);
      alert("Erro ao confirmar agendamento. O servidor retornou um erro.");
    }
  };

  // ==========================================
  // FUNÇÕES DE ENCAPSULAMENTO VISUAL (RENDER)
  // ==========================================

  // 1. Função para renderizar o carrossel de datas
  const renderSelecaoDatas = () => (
    <div className="flex gap-4 mb-10 overflow-x-auto pb-6 pt-2 px-2">
      {datas.map((data) => {
        const isSelected = dataSelecionada === data.id;
        return (
          <button
            key={data.id}
            onClick={() => setDataSelecionada(data.id)}
            // Usa as variáveis de cor para o fundo e para a borda quando selecionado
            style={isSelected ? { backgroundColor: COLORS.redDark, borderColor: COLORS.redDark } : { borderColor: COLORS.grayLight }}
            className={`flex flex-col items-center justify-center min-w-[90px] h-[100px] rounded-none border transition-transform duration-300 hover:scale-110 shadow-lg ${
              isSelected ? "text-white" : "bg-transparent text-gray-800"
            }`}
          >
            <span className="text-[10px] font-bold tracking-wider uppercase">{data.dia}</span>
            <span className="text-3xl font-bold my-1">{data.numero}</span>
            <span className="text-xs font-semibold uppercase">{data.mes}</span>
          </button>
        );
      })}
    </div>
  );

  // 2. Função para renderizar o painel de serviços disponíveis
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
      
      <div className="grid grid-cols-1 md:grid-cols-3 gap-6">
        {servicos.map((servico) => (
          <button
            key={servico.id}
            onClick={() => setServicoSelecionado(servico.id)}
            className="flex flex-col items-start p-6 bg-blue-900 hover:bg-blue-800 text-white rounded-none border border-transparent hover:border-blue-700 transition-transform duration-300 hover:scale-105 shadow-md w-full"
          >
            <span style={{ color: COLORS.white }} className={`${fonteStrong.className} tracking-wider text-lg mb-2`}>
              {servico.nome}
            </span>
            <span className="text-blue-300 text-sm mb-4">{servico.tempo}</span>
            {/* O preço recebe o fundo bege e o texto azul usando os atributos dinâmicos */}
            <span 
              style={{ color: COLORS.blue, backgroundColor: COLORS.offWhite }} 
              className="font-extrabold text-xl mt-auto px-3 py-1"
            >
              {servico.preco}
            </span>
          </button>
        ))}
      </div>
    </div>
  );

  // 3. Função para renderizar a janela modal de horários
  const renderModalHorarios = () => {
    if (servicoSelecionado === null) return null;

    return (
      <div className="fixed inset-0 bg-black/70 flex items-center justify-center z-50 px-4">
        <div className="bg-blue-950 p-8 rounded-none border border-blue-900 w-full max-w-2xl shadow-2xl">
          
          <div className="flex justify-between items-center mb-6 pb-4 border-b border-blue-800">
            <h3 style={{ color: COLORS.white }} className={`${fonteStrong.className} text-2xl`}>
              Horários Disponíveis
            </h3>
            <button 
              onClick={() => setServicoSelecionado(null)}
              className="text-blue-300 hover:text-white text-xl font-bold px-4 py-2 hover:bg-blue-900 transition-colors rounded-none"
            >
              X
            </button>
          </div>

          <div className="flex flex-wrap gap-4 mt-8">
            {horarios.map((hora) => {
              const isSelected = horarioSelecionado === hora.id;
              return (
                <button
                  key={hora.id}
                  disabled={!hora.disponivel}
                  onClick={() => setHorarioSelecionado(hora.id)}
                  // Aplica o vermelho escuro se for selecionado
                  style={isSelected ? { backgroundColor: COLORS.redDark } : {}}
                  className={`flex flex-col items-center justify-center w-[100px] py-2 rounded-none font-bold transition-transform duration-300 ${
                    !hora.disponivel
                      ? "bg-blue-900/50 text-blue-300 cursor-not-allowed opacity-50"
                      : isSelected
                      ? "text-white"
                      : "bg-blue-900 text-white hover:bg-blue-800 hover:scale-110"
                  }`}
                >
                  <span className="text-[9px] uppercase tracking-wider mb-1 font-normal opacity-80">
                    {!hora.disponivel ? "Horário cheio" : isSelected ? "Selecionado" : "Agendar"}
                  </span>
                  <span style={{ color: COLORS.white }} className="text-lg">
                    {hora.tempo}
                  </span>
                </button>
              );
            })}
          </div>

          {horarioSelecionado && (
            <button
              //Botão de confirmar agendamento implementado
              onClick={handleConfirmarAgendamento}
              // Aplica a cor no botão final de confirmação
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

  // ==========================================
  // RETORNO PRINCIPAL DA PÁGINA (ESTRUTURA)
  // ==========================================
  return (
    // Fundo bege aplicado via style dinâmico usando COLORS.offWhite
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

      </div>

      {renderModalHorarios()}
    </div>
  );
}
// Tipagem para os agendamentos que aparecem na visão cronológica
export interface Appointment {
  id: string;
  clientName: string;
  clientPhone: string;
  serviceName: string;
  price: number;
  startTime: Date;
  status: 'scheduled' | 'confirmed' | 'cancelled';
}

// Resumo financeiro e métricas diárias
export interface DashboardStats {
  dailyRevenue: number;
  weeklyRevenue: number;
  totalAppointmentsToday: number;
  pendingConfirmations: number;
}
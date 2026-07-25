import api from "@/app/api/auth/api";

export interface SendEmailRequest {
  emailTo: string;
  subject: string;
  text: string;
}

export async function sendEmail(data: SendEmailRequest) {
  const response = await api.post("email/send", data);
  return response.data;
}

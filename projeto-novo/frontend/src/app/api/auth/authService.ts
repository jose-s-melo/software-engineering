import api from "./api";

export async function login(data: LoginRequest): Promise<TokenResponse> {
  const tokenResponse: TokenResponse = (await api.post("auth/login", data)).data;
  localStorage.setItem("token", tokenResponse.token);
  return tokenResponse;
}

export async function register(data: RegisterRequest) {
  const registerResponse = await api.post("auth/register", data);
  return registerResponse.data
}

export async function changePassword(data: ChangePasswordRequest) {
  const response = await api.post("auth/changePassword", data);
  return response.data;
}

export async function forgotPassword(email: string) {
  const response = await api.post("auth/forgot", { email });
  return response.data;
}

export async function confirmForgotPassword(data: ConfirmForgotPasswordRequest) {
  const response = await api.post("auth/forgotConfirm", data);
  return response.data;
}

export interface LoginRequest {
  email: string;
  password: string;
}

export interface RegisterRequest {
  phone: string;
}

export interface ChangePasswordRequest {
  email: string;
  oldPassword: string;
  newPassword: string;
}

export interface ConfirmForgotPasswordRequest {
  email: string;
  code: string;
  newPassword: string;
}

export interface TokenResponse {
  token: string;
  message: string;
  user: User;
}

export interface User {
    id: string;
    email: string;
    role: string;
}

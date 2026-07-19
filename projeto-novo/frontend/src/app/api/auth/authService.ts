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

export interface LoginRequest {
  email: string;
  password: string;
}

export interface RegisterRequest {
  phone: string;
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

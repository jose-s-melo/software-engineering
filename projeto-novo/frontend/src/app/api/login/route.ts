import { NextResponse } from "next/server";

export async function LOGIN(request: Request) {
  const { email, password } = await request.json();

  // Mock do Administrador
  if (email === "admin@barbearia.com" && password === "123456") {
    return NextResponse.json({
      token: "token-falso-admin-123",
      user: { id: 1, name: "Admin", role: "ADMIN" },
    });
  }

  // Mock do Cliente
  if (email === "cliente@gmail.com" && password === "123456") {
    return NextResponse.json({
      token: "token-falso-cliente-456",
      user: { id: 2, name: "João Cliente", role: "CLIENT" },
    });
  }

  // Erro de credenciais
  return NextResponse.json(
    { message: "E-mail ou senha incorretos" },
    { status: 401 },
  );
}

export async function POST(request: Request) {
  try {
    const { email, password } = await request.json();

    const response = await fetch("http://api:8081/api/auth/login", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ email, password }),
    });

    const data = await response.json();

    if (!response.ok) {
      return NextResponse.json(
        { message: data.message ?? "Falha na autenticação" },
        { status: response.status },
      );
    }

    return NextResponse.json(data);
  } catch {
    return NextResponse.json(
      { message: "Erro ao conectar com o servidor" },
      { status: 500 },
    );
  }
}
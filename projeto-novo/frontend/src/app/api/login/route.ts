import { NextResponse } from 'next/server';

export async function POST(request: Request) {
  const { email, password } = await request.json();

  // Mock do Administrador
  if (email === 'admin@barbearia.com' && password === '123456') {
    return NextResponse.json({
      token: 'token-falso-admin-123',
      user: { id: 1, name: 'Admin', role: 'ADMIN' }
    });
  }

  // Mock do Cliente
  if (email === 'cliente@gmail.com' && password === '123456') {
    return NextResponse.json({
      token: 'token-falso-cliente-456',
      user: { id: 2, name: 'João Cliente', role: 'CLIENT' }
    });
  }

  // Erro de credenciais
  return NextResponse.json(
    { message: 'E-mail ou senha incorretos' },
    { status: 401 }
  );
}
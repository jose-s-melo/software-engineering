"use client";

import { useState, useEffect } from "react";
import Link from "next/link";
import { usePathname, useRouter } from "next/navigation";

export default function Navbar() {
  const [isOpen, setIsOpen] = useState(false);
  const [role, setRole] = useState<string | null>(null);
  
  const pathname = usePathname();
  const router = useRouter();

  useEffect(() => {
    const savedRole = localStorage.getItem("role");
    setRole(savedRole);
  }, [pathname]);

  if (pathname === "/login") return null;

  const handleLogout = () => {
    localStorage.removeItem("token");
    localStorage.removeItem("role");
    setRole(null);
    router.push("/login");
  };

  return (
    <nav className="bg-white border-b border-gray-200 shadow-sm w-full">
      <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div className="flex justify-between items-center h-16">
          
          {/* Logo */}
          <div className="flex-shrink-0 flex items-center">
            <Link href="/" className="text-xl font-bold text-blue-600">
              Corte & Estilo
            </Link>
          </div>

          {/* Links Desktop (Dinâmicos) */}
          <div className="hidden md:flex md:items-center md:space-x-8">
            
            {/* Mostra SÓ para Admin */}
            {role === "ADMIN" && (
              <>
                <Link href="/admin/dashboard" className="text-gray-700 hover:text-blue-600 px-3 py-2 rounded-md text-sm font-medium transition-colors">
                  Dashboard
                </Link>
                <Link href="/admin/clientes" className="text-gray-700 hover:text-blue-600 px-3 py-2 rounded-md text-sm font-medium transition-colors">
                  Clientes
                </Link>
                <Link href="/admin/services" className="text-gray-700 hover:text-blue-600 px-3 py-2 rounded-md text-sm font-medium transition-colors">
                  Serviços
                </Link>
              </>
            )}

            {/* Mostra SÓ para Cliente */}
            {role === "CLIENT" && (
              <Link href="/agendamento" className="text-gray-700 hover:text-blue-600 px-3 py-2 rounded-md text-sm font-medium transition-colors">
                Meus Agendamentos
              </Link>
            )}
          </div>

          {/* Botão de Login ou Sair Desktop */}
          <div className="hidden md:flex items-center">
            {!role ? (
              <Link href="/login" className="bg-blue-600 hover:bg-blue-700 text-white px-4 py-2 rounded-md text-sm font-medium transition-colors">
                Login
              </Link>
            ) : (
              <button onClick={handleLogout} className="bg-red-600 hover:bg-red-700 text-white px-4 py-2 rounded-md text-sm font-medium transition-colors">
                Sair
              </button>
            )}
          </div>

          {/* Botão Menu Mobile (Hambúrguer) */}
          <div className="flex items-center md:hidden">
            <button onClick={() => setIsOpen(!isOpen)} type="button" className="text-gray-400 hover:text-gray-500">
              <svg className="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                {isOpen ? (
                  <path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M6 18L18 6M6 6l12 12" />
                ) : (
                  <path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M4 6h16M4 12h16M4 18h16" />
                )}
              </svg>
            </button>
          </div>
        </div>
      </div>

      {/* Menu Mobile Dinâmico */}
      <div className={`${isOpen ? "block" : "hidden"} md:hidden`}>
        <div className="px-2 pt-2 pb-3 space-y-1 sm:px-3 border-t border-gray-200">
          
          {/* Mostra SÓ para Admin */}
          {role === "ADMIN" && (
            <>
              <Link href="/admin/dashboard" className="block text-gray-700 hover:text-blue-600 hover:bg-gray-50 px-3 py-2 rounded-md text-base font-medium" onClick={() => setIsOpen(false)}>
                Dashboard
              </Link>
              <Link href="/admin/clientes" className="block text-gray-700 hover:text-blue-600 hover:bg-gray-50 px-3 py-2 rounded-md text-base font-medium" onClick={() => setIsOpen(false)}>
                Clientes
              </Link>
              <Link href="/admin/services" className="block text-gray-700 hover:text-blue-600 hover:bg-gray-50 px-3 py-2 rounded-md text-base font-medium" onClick={() => setIsOpen(false)}>
                Serviços
              </Link>
            </>
          )}

          {/* Mostra SÓ para Cliente */}
          {role === "CLIENT" && (
            <Link href="/agendamento" className="block text-gray-700 hover:text-blue-600 hover:bg-gray-50 px-3 py-2 rounded-md text-base font-medium" onClick={() => setIsOpen(false)}>
              Meus Agendamentos
            </Link>
          )}

          {!role ? (
            <Link href="/login" className="block w-full text-center mt-4 bg-blue-600 hover:bg-blue-700 text-white px-4 py-2 rounded-md text-base font-medium" onClick={() => setIsOpen(false)}>
              Login
            </Link>
          ) : (
            <button onClick={() => { handleLogout(); setIsOpen(false); }} className="block w-full text-center mt-4 bg-red-600 hover:bg-red-700 text-white px-4 py-2 rounded-md text-base font-medium">
              Sair
            </button>
          )}
        </div>
      </div>
    </nav>
  );
}
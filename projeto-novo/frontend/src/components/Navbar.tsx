"use client";

import { useState } from "react";
import Link from "next/link";

export default function Navbar() {
  const [isOpen, setIsOpen] = useState(false);

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

          {/* Links Desktop */}
          <div className="hidden md:flex md:items-center md:space-x-8">
            <Link
              href="/admin"
              className="text-gray-700 hover:text-blue-600 px-3 py-2 rounded-md text-sm font-medium transition-colors"
            >
              Dashboard Admin
            </Link>
            <Link
              href="/agendamento"
              className="text-gray-700 hover:text-blue-600 px-3 py-2 rounded-md text-sm font-medium transition-colors"
            >
              Agendamento
            </Link>
            <Link
              href="/services"
              className="text-gray-700 hover:text-blue-600 px-3 py-2 rounded-md text-sm font-medium transition-colors"
            >
              Serviços
            </Link>
            <Link
              href="/registration"
              className="text-gray-700 hover:text-blue-600 px-3 py-2 rounded-md text-sm font-medium transition-colors"
            >
              Registrar
            </Link>
          </div>

          {/* Botão de Login Desktop */}
          <div className="hidden md:flex items-center">
            <Link
              href="/login"
              className="bg-blue-600 hover:bg-blue-700 text-white px-4 py-2 rounded-md text-sm font-medium transition-colors"
            >
              Login
            </Link>
          </div>

          {/* Botão Menu Mobile (Hambúrguer) */}
          <div className="flex items-center md:hidden">
            <button
              onClick={() => setIsOpen(!isOpen)}
              type="button"
              className="inline-flex items-center justify-center p-2 rounded-md text-gray-400 hover:text-gray-500 hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-inset focus:ring-blue-500"
              aria-expanded="false"
            >
              <span className="sr-only">Abrir menu principal</span>
              {/* Ícone de hambúrguer */}
              <svg
                className={`${isOpen ? "hidden" : "block"} h-6 w-6`}
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
                aria-hidden="true"
              >
                <path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M4 6h16M4 12h16M4 18h16" />
              </svg>
              {/* Ícone de fechar */}
              <svg
                className={`${isOpen ? "block" : "hidden"} h-6 w-6`}
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                stroke="currentColor"
                aria-hidden="true"
              >
                <path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M6 18L18 6M6 6l12 12" />
              </svg>
            </button>
          </div>
        </div>
      </div>

      {/* Menu Mobile */}
      <div className={`${isOpen ? "block" : "hidden"} md:hidden`}>
        <div className="px-2 pt-2 pb-3 space-y-1 sm:px-3 border-t border-gray-200">
          <Link
            href="/admin/dashboard"
            className="block text-gray-700 hover:text-blue-600 hover:bg-gray-50 px-3 py-2 rounded-md text-base font-medium"
            onClick={() => setIsOpen(false)}
          >
            Dashboard Admin
          </Link>
          <Link
            href="/agendamento"
            className="block text-gray-700 hover:text-blue-600 hover:bg-gray-50 px-3 py-2 rounded-md text-base font-medium"
            onClick={() => setIsOpen(false)}
          >
            Agendamento
          </Link>
          <Link
            href="/admin/services"
            className="block text-gray-700 hover:text-blue-600 hover:bg-gray-50 px-3 py-2 rounded-md text-base font-medium"
            onClick={() => setIsOpen(false)}
          >
            Serviços
          </Link>
          <Link
            href="/login"
            className="block w-full text-center mt-4 bg-blue-600 hover:bg-blue-700 text-white px-4 py-2 rounded-md text-base font-medium"
            onClick={() => setIsOpen(false)}
          >
            Login
          </Link>
        </div>
      </div>
    </nav>
  );
}
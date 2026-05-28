type ButtonProps = {
  children: React.ReactNode;
  variant?: "primary" | "danger" | "outline";
};

export default function Button({
  children,
  variant = "primary",
}: ButtonProps) {

  const variants = {
    primary: `
      bg-[#0A192F]
      text-white
      border-[#0A192F]
      hover:bg-white
      hover:text-[#0A192F]
    `,

    danger: `
      bg-[#8B0000]
      text-white
      border-[#8B0000]
      hover:bg-white
      hover:text-[#8B0000]
    `,

    outline: `
      bg-white
      text-[#0A192F]
      border-[#0A192F]
      hover:bg-[#0A192F]
      hover:text-white
    `,
  };

  return (
    <button
      className={`
        bg-[#0A192F]
        text-white
        px-6
        py-3
        font-black
        uppercase
        border-4
        border-[#0A192F]
        hover:bg-white
        hover:text-[#0A192F]
        transition-all
        shadow-[6px_6px_0px_0px_rgba(139,0,0,1)]
        ${variants[variant]}
      `}
    >
      {children}
    </button>
  );
}
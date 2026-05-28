type ButtonProps = {
  children: React.ReactNode;
  onClick?: () => void;
  variant?: "primary" | "danger" | "outline" | "utility"  | "submit";
} & React.ButtonHTMLAttributes<HTMLButtonElement>;

export default function Button({
  children,
  onClick,
  variant = "primary",
  ...props
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
      bg-green-600
      text-[#0A192F]
      border-[#0A192F]
      hover:bg-white
      hover:text-green-600
    `,

    utility: `
      bg-green-600
      text-[#0A192F]
      border-[#0A192F]
      hover:bg-[#0A192F]
      hover:text-green-600
    `,

    submit: `
      bg-[#0A192F]
      text-white
      border-[#0A192F]
      hover:bg-white
      hover:text-[#0A192F]
    `,
  };

  return (
    <button
      {...props}
      onClick={onClick}
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
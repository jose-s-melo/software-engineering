type TableContainerProps = {
  children: React.ReactNode;
};

export default function TableContainer({
  children,
}: TableContainerProps) {

  return (
    <div
        className="
          bg-white
          border-4
          border-[#0A192F]
          shadow-[10px_10px_0px_0px_rgba(139,0,0,1)]
          overflow-hidden
        "
      >
      {children}
    </div>
  );
}
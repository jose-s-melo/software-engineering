type PageHeaderProps = {
  title: string;
  description: string;
  children?: React.ReactNode;
};

export default function PageHeader({
  title,
  description,
  children,
}: PageHeaderProps) {
  return (
    <div className="flex items-center justify-between mb-8">
      <div>
        <h1 className="
          text-5xl
          font-black
          uppercase
          italic
          tracking-tight
          text-[#0A192F]
        ">
          {title}
        </h1>

        <p className="text-gray-600 mt-2">
          {description}
        </p>
      </div>

      {children}
    </div>
  );
}
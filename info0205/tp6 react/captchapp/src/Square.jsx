import "./Square.css";

function Square({ value, active, onSelectListener }) {

  const className = active ? "square" : "square";

  return (
    <div className={className} onClick={() => onSelectListener(value)}>
      {value}
    </div>
  );
}

export default Square;
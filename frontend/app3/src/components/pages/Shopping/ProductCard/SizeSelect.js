import { useState } from "react";
import "./ProductCard.css"

function SizeSelect({ onSizePick }) {
  const [size, setSize] = useState(1);

  const increment = () => {
    const next = size + 1;
    setSize(next);
    onSizePick(next); 
  };

  const decrement = () => {
    const next = size > 1 ? size - 1 : 1;
    setSize(next);
    onSizePick(next); 
  };

  return (
    <div className="SizeSelect">
      <p className="par">Size</p>
      <div className="clicker">
        <div onClick={decrement} style={{ cursor: "pointer" }} className="minus">-</div>
        <div className="number">{size}</div>
        <div onClick={increment} style={{ cursor: "pointer" }} className="plus">+</div>
      </div>
    </div>
  );
}

export default SizeSelect;
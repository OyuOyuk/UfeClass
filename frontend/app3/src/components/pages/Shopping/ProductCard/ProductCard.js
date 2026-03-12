import "./ProductCard.css"
import ColorSelect from './ColorSelect.js'
import SizeSelect from './SizeSelect.js';
import { useState } from "react";

function ProductCard({ title, price, image, colors, onAddToCart }) {

  const [selectedColor, setSelectedColor] = useState(colors[0]);
  const [selectedSize, setSelectedSize] = useState(1); 

  return (
    <div className='background'>
      <div className='image'>
        <img src={image} alt={title} />
      </div>
      <div className='desc'>
        <div className='title'>
          <div id='Title'>{title}</div>
          <div id='Price'>${price}</div>
        </div>

        <ColorSelect colors={colors} onColorPick={setSelectedColor} />
        <SizeSelect onSizePick={setSelectedSize} />

        <button className="productCardButton" onClick={() => {
          
          onAddToCart(selectedColor, selectedSize); 
        }}>
          add to cart
        </button>
      </div>
    </div>
  );
}

export default ProductCard;
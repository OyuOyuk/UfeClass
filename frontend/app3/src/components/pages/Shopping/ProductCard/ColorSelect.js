import "./ProductCard.css"
import Circle from './Circle.js'
import { useState } from 'react'

function ColorSelect({colors, onColorPick}){
    const [chosen, setChosen] = useState(null)
    const Select = (color) =>{
        setChosen(color)
        onColorPick(color)
    }
    return <div className = "ColorSelect"> 
        <p className = "par">Color</p>
         <ul className= "options">
                {colors.map((color) => 
                <li key={color} onClick={() => {Select(color)}}>
                    <Circle color={color} size={20} chosen={chosen === color}></Circle>
                </li>)}
            </ul>
    </div>
}
export default ColorSelect
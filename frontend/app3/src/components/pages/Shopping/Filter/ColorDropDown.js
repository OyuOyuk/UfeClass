import "./FilterChildren.css"

function ColorDropDown({allcolors, value, onChange}){
    return <div className="ColorDropDown">
        <p className="par">Select Color</p>
        <select className="SelectOptionsInput" value={value} onChange={onChange}>
            <option value=""> -- select an option -- </option>
            {allcolors.map((color) => (
                <option key={color} value={color}>{color}</option>
            ))}

        </select>
    </div>
}
export default ColorDropDown
import './FilterChildren.css'

function PriceMinMax({min, max, setMin, setMax}){
    return <div>
        <p className="par">Price</p>
        <div className="inputMinMax">
            <input type="text" className='NumberField' placeholder='Min' value={min} onChange={setMin}></input>
            <input type="text" className='NumberField' placeholder='Max' value={max} onChange={setMax}></input>
        </div>
    </div>
}
export default PriceMinMax
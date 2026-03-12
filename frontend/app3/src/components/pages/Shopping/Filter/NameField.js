import './FilterChildren.css'

function NameField({value, onChange}){
    return <div className='NameField'>
        <p className="par">Name</p>
        <input type="text" className='NameFieldInput' value={value} onChange={onChange}></input>
    </div>
}
export default NameField
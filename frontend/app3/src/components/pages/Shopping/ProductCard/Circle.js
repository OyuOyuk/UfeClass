import "./ProductCard.css"
function Circle({size, color, chosen}){
    const circleStyle = {
        width: `${size}px`,
        height: `${size}px`,
        backgroundColor: color,
        borderStyle : 'solid',
        borderColor : 'rgba(0, 0, 0, 0)',
        padding:'1px',
        backgroundClip: 'content-box'
        
    };
    const circleStyleChosen = {
        width: `${size}px`,
        height: `${size}px`,
        backgroundColor: color,
        borderStyle : 'solid',
        borderColor : 'rgba(21, 146, 255, 0.78)',
        padding:'1px',
        backgroundClip: 'content-box'
    };
    return <div className="circle" style={chosen ? circleStyleChosen : circleStyle}></div>
}

export default Circle
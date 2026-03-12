import './Parts.css'
import { Link } from 'react-router'
import CircleCounter from './CircleCounter'
function Header({ logo, title, links, link, cartItems }) {
    return <div className="Header">
        <div className='HeaderContainer'>
            <img src={logo}/>
            <div className='HeaderTitle'>{title}</div>
        </div>  
        <div className='NavContainer'>
            {links.map((link) => (
                <Link key={link.to} to={link.to} className='NavLink'>{link.label}</Link>
            ))}
            <Link key={link.to} to={link.to} className='NavLink'>
                <div className='NavLinkIcon'>
                    <img src={link.label} className='NavIcon'/>
                    <CircleCounter number={cartItems.length}/>  
                </div>
            </Link>
        </div>
    </div>
}
export default Header
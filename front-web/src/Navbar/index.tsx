import { ReactComponent as Logo } from './logo.svg';
import './styles.css';

function Navbar(){
    return (
        <nav className="main-navbar">
            <Logo/>
            <a href="home"  className="logo-text">DS Delivery</a>
        </nav>
    )
}


export default Navbar;
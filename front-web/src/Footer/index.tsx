import './styles.css';
import { ReactComponent as YouTubeIcon} from './youtube.svg';
import { ReactComponent as LinkedinIcon} from './linkedin.svg';

function Footer(){
    return (
        <footer className="main-footer">
            App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
            <div className="footer-icons">
                <a href="https://www.linkedin.com/in/alan-lima-b93935180/" target="_new">
                    <LinkedinIcon/>
                </a>

                <a href="https://www.youtube.com/devsuperior" target="_new">
                    <YouTubeIcon/>
                </a>
            </div>
        </footer>
    )
}


export default Footer;
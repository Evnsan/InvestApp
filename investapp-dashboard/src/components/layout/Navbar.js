import { Link } from 'react-router-dom';
import SignedOutLinks from './SignedOutLinks';
import SignedInLinks from './SignedInLinks';

function Navbar() {
    return (
        <nav className="nav-wrapper grey darken-3">
            <div className="container">
                <Link to='/' className='brand-logo'>InvestApp</Link>
                <SignedInLinks />
                <SignedOutLinks />
            </div>
        </nav>

    )
}

export default Navbar;
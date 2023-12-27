
export default function Header( {onHomeClick , onLightingClick, onHeatingClick} ) {
    return (
        <header className="header">
            <button onClick={onHomeClick} className="btn-home">Home</button>
            <button onClick={onLightingClick}>Svítidla</button>
            <button onClick={onHeatingClick}>Topení</button>
        </header>
    )
}
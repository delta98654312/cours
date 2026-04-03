function Button({type="", css="", children}){
    return(
    <button className="bg-red-500" type={type}>{children}
    </button>
    )
}


export default Button;
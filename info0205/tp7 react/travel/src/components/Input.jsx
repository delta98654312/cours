function Input({label = "",name="",width="",value="",type="",readonly,autofocus, x}){
    return (<div width={width}>
        <label htmlFor="" className="col-sm-2 col-form-label" name={name}>
            {label}
        </label>
        <div className={`"col-sm-${width}"`}>
            <input className="form-control" defaultValue={value} type={type} readOnly={readonly} autoFocus={autofocus}/>
        </div>

    </div>
    );

}



export default Input;
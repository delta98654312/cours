import "./Slideshow.css"
import image0 from "./assets/image0.jpg";
import image1 from "./assets/image1.jpg";
import image2 from "./assets/image2.jpg";
import image3 from "./assets/image3.jpg";
import image4 from "./assets/image4.jpg";
import { useState } from 'react';

let tab = [image0, image1, image2, image3, image4]

function Slideshow() {
    const [ back, setBack ] = useState(0);

    function onClickButton(number){
        

        if (back+number < 0){
            setBack(4)
        }else{
            setBack((back+number)%5)
        }
    }

    return (
        <div className="slideshow"
            style={{
            backgroundImage: `url("${tab[back]}")`
            }}
            >
            <button className="btnLeft" onClick={() => onClickButton(-1)}>&lt;</button>
            <button className="btnRight" onClick={() => onClickButton(+1)}>&gt;</button>
        </div>
    );
}

export default Slideshow;
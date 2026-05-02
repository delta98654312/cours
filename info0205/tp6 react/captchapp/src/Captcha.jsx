import "./Captcha.css";
import { useEffect, useState } from "react";
import Square from "./Square";
import { URL, API_KEY } from "./assets/config.jsx";

function Captcha() {
  const [captcha, setCaptcha] = useState(null);

  useEffect(() => {
    fetch(URL, {
      method: "POST",
      referrerPolicy: "no-referrer",
      body: JSON.stringify({
        type: "get",
        key: API_KEY,
      }),
    })
      .then((response) => response.json())
      .then((data) => {
        console.log(data);
        setCaptcha(data);
      })
      .catch((error) => {
        console.error("Erreur :", error);
      });
  }, []);

  return (
    <div className="captcha-container">
      <div
        className="captcha"
        style={{
          backgroundImage:
            captcha && captcha.image
              ? `url(${URL}${captcha.image})`
              : "none",
        }}
      >
        {Array.from({ length: 5 }, (_, x) => (
          <div key={x}>
            {Array.from({ length: 5 }, (_, y) => (
              <Square key={y} />
            ))}
          </div>
        ))}
      </div>

      <div className="captcha-title">
        {captcha && captcha.instruction}
      </div>

      <button className="captcha-button">Valider</button>
    </div>
  );
}

export default Captcha;

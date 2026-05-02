import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import Captcha from "./Captcha.jsx"

createRoot(document.getElementById('root')).render(
    <div>
        <Captcha></Captcha>

    </div>
)

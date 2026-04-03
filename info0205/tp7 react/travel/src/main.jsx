import { createRoot } from 'react-dom/client'
import Travel from "./Travel.jsx"
import "bootstrap/dist/css/bootstrap.css";

createRoot(document.getElementById('root')).render(
    <div className='container'>
      <Travel />
    </div>
)

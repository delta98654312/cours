import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client';
import { Route, BrowserRouter, Routes } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.js';
import 'bootstrap-icons/font/bootstrap-icons.css';

import Vocation from '@/pages/Vocation'
import Home from '@/pages/Home'
import ErrorPage from '@/pages/Error'
import Booking from '@/pages/Booking'



createRoot(document.getElementById('root')).render(
    <BrowserRouter>
    <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/sejours" element={<Booking/>} />
        <Route path='reservation/:id' element={<Vocation/>} />
        <Route path="*" element={<Error/>} />
    </Routes>
    </BrowserRouter>
)

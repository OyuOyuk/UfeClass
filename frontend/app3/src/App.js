import logo from './logo.svg';
import cart from './assets/shopping-cart.png'
import './App.css';
import { BrowserRouter, Routes, Route } from 'react-router';
import Home from './components/pages/Home/Home'
import Header from './components/layout/parts/Header';
import Shopping from './components/pages/Shopping/Shopping';
import Login from './components/pages/Login/Login';
import Profile from './components/pages/Profile/Profile';
import { useState } from 'react';
import Cart from './components/pages/Cart/Cart';

function App() {
  let links = [
    { to: "/", label: "Home" },
    { to: "/shopping", label: "Shopping" },
    { to: "/login", label: "Login" },
    { to: "/profile", label: "Profile" },
  ]

  let images = { placeholder: logo }
  let userdata = [{ username: "admin", password: "admin123" }]

  const [userinfo, setUserInfo] = useState('')
  const [cartItems, setCartItems] = useState([])  

  const handleAddToCart = (product, selectedColor, selectedSize) => {
    setCartItems(prev => [...prev, { ...product, selectedColor, selectedSize }])
  }

  return (
    <BrowserRouter>
        <Header title={"Default"} logo={logo} links={links} link={{ to: "/cart", label: cart }} cartItems={cartItems}/>      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/shopping" element={
          <Shopping images={images} onAddToCart={handleAddToCart} />  
        } />
        <Route path="/login" element={<Login userdata={userdata} setUserInfo={setUserInfo} />} />
        <Route path="/profile" element={<Profile userinfo={userinfo} />} />
        <Route path="/cart" element={<Cart cartItems={cartItems} setCartItems={setCartItems}/>} /> 
      </Routes>
    </BrowserRouter>
  );
}

export default App;
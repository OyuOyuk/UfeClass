import './Cart.css'
import CartItem from './CartItem'
function Cart({ cartItems, setCartItems}) {
  const aggregatedItems = cartItems.reduce((acc, item) => {
    const existing = acc.find(i => 
      i.id === item.id && 
      i.selectedColor === item.selectedColor && 
      i.selectedSize === item.selectedSize
    )
    if (existing) {
      existing.amount += 1
    } else {
      acc.push({ ...item, amount: 1 })
    }
    return acc
  }, [])

  const total = aggregatedItems.reduce((sum, item) => sum + item.price * item.amount, 0)

  const handleAdd = (id, selectedColor, selectedSize) => {
    setCartItems(prev => [...prev, prev.find(item => 
      item.id === id && 
      item.selectedColor === selectedColor && 
      item.selectedSize === selectedSize
    )])
  }

  const handleRemove = (id, selectedColor, selectedSize) => {
    const index = cartItems.findLastIndex(item => 
      item.id === id && 
      item.selectedColor === selectedColor && 
      item.selectedSize === selectedSize
    )
    setCartItems(prev => prev.filter((_, i) => i !== index))
  }
  return (
    <div className='CartBody'>
      <div className='CartItems'>
          <h2>Cart Items</h2>
          {aggregatedItems.map((item, index) => (
            CartItem(index, item, handleAdd, handleRemove)
      ))}
      </div>
      <div className='CartCheckout'>
        <h3>Total: ${total.toFixed(2)}</h3>
        <button className='CheckoutButton'>Checkout</button>
      </div>
      
    </div>
  )
}

export default Cart

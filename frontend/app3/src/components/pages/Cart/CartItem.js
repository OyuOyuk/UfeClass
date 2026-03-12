import './Cart.css'

function CartItem(index, item, onAdd, onRemove){
    return <div key={index} className="CartItem">
            <div className="CartItemIndex">{index + 1}</div>
            <div> <img src={item.picture}></img></div>
            <div className='CartItemP1'>
                <div>{item.name} </div>
                <div>Color: {item.selectedColor}</div>
                 
            </div>
            <div className='CartItemP2'> 
                <div><br/></div>
                <div>Size: {item.selectedSize}</div>
                
            </div>
            <div className='CartItemP3'>
                <div>Total: ${(item.amount * item.price).toFixed(2)}</div>
                
            </div>
            <div className='CartItemP4'>
                <button onClick={() => onRemove(item.id, item.selectedColor, item.selectedSize)} className='CartButtonminus'>-</button>
                <div className='CartAmounr'> {item.amount}</div>

                <button onClick={() => onAdd(item.id, item.selectedColor, item.selectedSize)} className='CartButtonplus'>+</button>
            </div>
        </div>
}

export default CartItem
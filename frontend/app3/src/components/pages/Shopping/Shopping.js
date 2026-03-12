import Filter from "./Filter";
import { useState , useMemo } from "react";
import './Shopping.css'
import ProductCard from "./ProductCard/ProductCard";
function Shopping({ images, onAddToCart }) {
    const products = [ { id: 1, name : 'Product 1', price : 19.99, colors : ['red', 'blue', 'green'], picture : images.placeholder }, 
      { id: 1, name : 'Product 1', price : 19.99, colors : ['red', 'black', 'cyan'], picture : images.placeholder }, 
      { id: 2, name : 'Product 2', price : 19.99, colors : ['pink', 'blue', 'mint'], picture : images.placeholder }, 
      { id: 3, name : 'Product 3', price : 109.99, colors : ['pink', 'black', 'mint'], picture : images.placeholder }, 
      { id: 4, name : 'Service 4', price : 129.99, colors : ['pink', 'blue', 'red'], picture : images.placeholder }, 
      { id: 5, name : 'Service 5', price : 129.99, colors : ['pink', 'blue', 'mint'], picture :images.placeholder }, 
      { id: 6, name : 'Product 6', price : 29.99, colors : ['pink', 'blue', 'mint'], picture : images.placeholder} ]
    let allColors = [] 
    for (let product of products) { 
        for (let c of product.colors) { 
        if (!allColors.includes(c)) { 
            allColors.push(c); 
        } 
        } 
    }
    const [filters, setFilters] = useState({
        name: "",
        color: "",
        minPrice: "",
        maxPrice: ""
      });
    const filteredProducts = useMemo(() => {
        return products.filter(product => {
    
          if (
            filters.name &&
            !product.name
              .toLowerCase()
              .includes(filters.name.toLowerCase())
          ) return false;
    
          if (
            filters.color &&
            !product.colors.includes(filters.color)
          ) return false;
    
          if (
            filters.minPrice &&
            product.price < Number(filters.minPrice)
          ) return false;
    
          if (
            filters.maxPrice &&
            product.price > Number(filters.maxPrice)
          ) return false;
    
          return true;
        });
      }, [filters, products]);
      
    return (
    <div className='main'>
      <div className='filterMenu'>
        <Filter colors={allColors} filters={filters} setFilters={setFilters} />
      </div>
      <div className='productContainer'>
        <ul className='products' style={{ listStyle: "none" }}>
          {filteredProducts.map((product, index) => (
            <li key={index}>
              <ProductCard
                image={product.picture}
                title={product.name}
                price={product.price}
                colors={product.colors}
                onAddToCart={(color, size) => onAddToCart(product, color, size)} 
              />
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
}
export default Shopping
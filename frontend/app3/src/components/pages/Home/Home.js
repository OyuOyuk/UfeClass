import { useState, useEffect } from "react";


function Home() {
  const [products, setProducts] = useState([]);
  const [loading, setLoading] = useState(true);
  
  useEffect(() => {
    fetch("https://fakestoreapi.com/products")
      .then(res => res.json())
      .then(data => {
        setProducts(data);
        setLoading(false);
      });
  }, []); 

  if (loading) return <p>Loading...</p>;

  return (
    <div >
      <table>
        <thead>
          <tr>
            <th>Title</th>
            <th>Price</th>
            <th>Description</th>
          </tr>
        </thead>
        {products.map(product => (
          <tr>
            <td>{product.title}</td>
            <td>{product.price}</td>
            <td>{product.description}</td>
          </tr>
        ))}
      </table>
        
      </div>
  );
}
export default Home
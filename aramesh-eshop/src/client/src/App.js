import { useState, useEffect } from 'react';
import './App.css';

export default function App() {
    const [productObj, setProductObj] = useState([]);
    const getProductObj = () => {
        fetch("http://localhost:8080/api/products")
            .then((response) => response.json())
            .then((data) => setProductObj(data));
    };
    useEffect(() => getProductObj(), []);

    return (
        <>
            <h1>Aramesh products</h1>
            <ol>{getProductListItems(productObj)}</ol>
        </>
    );
}

function ListItem({name}) {
    return (
        <li>{name}</li>
    );
}

function getProductListItems(productObj) {
    let products = [];
    productObj.forEach(product => products.push(product.name));

    return products.map((product, index) => {
        return <ListItem name={product} key={index} />;
    });
}



import './App.css';
import { useState, useEffect } from 'react';
import Header from "./Header";
import ListItem from "./ListItem";

export default function App() {
    const [productObj, setProductObj] = useState([]);
    const [filterProduct, setFilterProduct] = useState("");
    const getProductObj = () => {
        fetch("http://localhost:8080/api/products" + filterProduct)
            .then((response) => response.json())
            .then((data) => setProductObj(data));
    };
    useEffect(() => getProductObj(), [filterProduct]);

    function handleButtonClick(category) {
        setFilterProduct("?category=" + category);
    }

    return (
        <>
            <Header
                onHomeClick={() => setFilterProduct("")}
                onLightingClick={() => handleButtonClick("svítidla")}
                onHeatingClick={() => handleButtonClick("topení")}
            />
            <main>
                <h1>{
                    filterProduct === "" ? "Aramesh products" : "Aramesh products – " + filterProduct.slice(10)
                }</h1>
                <ol>{getProductListItems(productObj)}</ol>
            </main>
        </>
    );
}

function getProductListItems(productObj) {
    let products = [];
    productObj.forEach(product => products.push(product.name));

    return products.map((product, index) => {
        return <ListItem name={product} key={index} />;
    });
}



import productJson from "./../data/product.json" assert {type :"json"}

const shop = document.getElementById("shop");
const cart = document.getElementById("cart");

let parseProduct = () => {
    return productJson;
}
let renderProduct = (product) => {
    shop.append();
}

let product = parseProduct();

renderProduct(product);


type Product = {
    price: number;
    isNew: boolean;
    isSale?: boolean;
    title: string;
}

type Vehicle = {
    wheels: number;
    year: number;
    brand: string;
}

type Car = Product & Vehicle & {
    type: string;
    model: string;
}

interface IProduct {
    price: number;
    isNew: boolean;
    isSale?: boolean;
    title: string;
}

interface IVehicle {
    wheels: number;
    year: number;
    brand: string;
}

interface ICar extends IProduct, IVehicle {
    type: string;
    model: string;
}
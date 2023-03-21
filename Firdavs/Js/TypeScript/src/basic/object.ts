export interface Car {
    wheels: number;
    brand: string;
    type: string;
    isNew?: boolean;
    name?: string;

    [key: string]: unknown;
}

const bmw: Car = {
    wheels: 4,
    brand: 'BMW',
    type: 'Sedan'
}

const audi: Car = {
    wheels: 4,
    brand: 'AUDI',
    type: ''
}

audi['go'] = true
audi.go = false

console.log(bmw)
const number = [1, 2, 3, 4];

const strArr: string[] = [];
const strArray: Array<string> = [];
strArr.push('1');

export interface Car {
    wheels: number;
    brand: string;
    type: string;
    isNew?: boolean;
    name?: string;

    [key: string]: unknown;
}


const cars: Car[] = [];
cars.push({
    wheels: 2,
    brand: 'Moto',
    type: '',
});

const arrayOfArray: string[][] = [];
arrayOfArray.push(['', '']);

function printArr(arr: unknown[]): void {
    arr.forEach((el, index, array) => {
        console.log(el, index);
    })
}


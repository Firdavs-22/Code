type WindowProp = keyof Window;

const myValue: WindowProp = 'alert'

interface PC {
    brand: string;
    year: number;
}

type TypeOne = keyof PC;

const valueOne: TypeOne = 'brand';

type TupleOne = keyof [string, number]

const valueTwo: TupleOne = '0';
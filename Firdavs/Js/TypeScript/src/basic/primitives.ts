//  number
let x = 10.5;
let x_ts: number = 10.5;
// let y = 1234n;
let z = NaN;


//  string
let str1 = "Hello";
let str2: string = "World";
let str3: string;
str3 = "!";

let sym: Symbol = Symbol('as');


//  boolean
let o: boolean = true;
o = false;


//  nothing
let h: undefined = undefined;
let g: null = null;


//  literal
const num = 108;
const str = "str";


//  universal
let mm: any = 1;
mm = "str";
mm = [];

let xx: unknown = 2;
if (typeof xx === "string") xx.toUpperCase()

export {}
let a = 'hello';
if (Number.isNaN(a)){/*true if the given value is NaN and its type is Number; otherwise, false.*/
    console.log(`The number you entered is square root of ${a * a}.`)
}

let num = 3;
let base = 2;
let power = 0;
while(power < num){
    console.log(base);
    base *= 2;
    power++;
}
console.log(power);


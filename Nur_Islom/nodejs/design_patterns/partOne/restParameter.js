function arrTotalCalc(...a) {
    let total = 0;
    for (let aKey in a) {
        total += Number(aKey);
    };
    return total;
}

console.log(arrTotalCalc(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

function typeOf(...a) {
    return typeof a;
}
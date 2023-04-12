export function tuplePairCreator<T>(first: T) {
    return function <U>(second: U): [T, U] {
        return [first, second];
    }
}

const toTupleWithOne = tuplePairCreator(1);
const valOne = toTupleWithOne(2);
const valTwo = toTupleWithOne('2');
const toTupleWithThreeStr = tuplePairCreator('3');
const valFive = toTupleWithThreeStr(5);
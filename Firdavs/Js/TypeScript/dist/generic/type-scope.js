"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.tuplePairCreator = void 0;
function tuplePairCreator(first) {
    return function (second) {
        return [first, second];
    };
}
exports.tuplePairCreator = tuplePairCreator;
const toTupleWithOne = tuplePairCreator(1);
const valOne = toTupleWithOne(2);
const valTwo = toTupleWithOne('2');
const toTupleWithThreeStr = tuplePairCreator('3');
const valFive = toTupleWithThreeStr(5);
//# sourceMappingURL=type-scope.js.map
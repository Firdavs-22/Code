"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.average = void 0;
function sum(a, b) {
    return a + b;
}
sum(2, 5);
const Sum = (a, b) => a + b;
function log(name, userId) {
    console.log('Hello', name, 'with Id', userId || 'anonymity');
}
log('John', '1');
function crash() {
    throw new Error('crash');
}
function average(...nums) {
    const sum = nums.reduce((current, total) => current + total, 0);
    return sum / nums.length;
}
exports.average = average;
//# sourceMappingURL=functions.js.map
"use strict";
// Array<string>
// string[]
// Promise<number>
Object.defineProperty(exports, "__esModule", { value: true });
function toArray(...args) {
    return args;
}
toArray(1, 2, 3);
toArray('a', 'b', 'c');
function head(value) {
    return value[0];
}
const firstElementInArray = (value) => value[0];
const obj = {
    title: 'test',
    value: 12
};
const objData = {
    title: 'data',
    value: [123],
};
//# sourceMappingURL=generic-syntax.js.map
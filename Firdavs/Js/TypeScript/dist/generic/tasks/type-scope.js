"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.createMap = void 0;
function createMap(list) {
    return function (cb) {
        const result = [];
        for (let el of list) {
            result.push(cb(el));
        }
        return result;
    };
}
exports.createMap = createMap;
const mapNums = createMap([1, 2, 3]);
const result = mapNums((num) => num + 2);
//# sourceMappingURL=type-scope.js.map
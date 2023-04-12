"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.prop = void 0;
function prop(key, obj) {
    return obj[key];
}
exports.prop = prop;
const objOne = {
    a: 1,
    b: 2,
    c: 3,
};
prop('a', objOne);
//# sourceMappingURL=constraint-keyof.js.map
var ShapeKind;
(function (ShapeKind) {
    ShapeKind[ShapeKind["Circle"] = 12] = "Circle";
    ShapeKind[ShapeKind["Square"] = 13] = "Square";
})(ShapeKind || (ShapeKind = {}));
const myShape = ShapeKind.Circle;
const circle1 = {
    radius: 1,
    kind: ShapeKind.Circle,
};
var StatusCode;
(function (StatusCode) {
    StatusCode[StatusCode["ERROR"] = 500] = "ERROR";
    StatusCode[StatusCode["NOT_FOUND"] = 404] = "NOT_FOUND";
    StatusCode[StatusCode["NOT_AUTH"] = 403] = "NOT_AUTH";
})(StatusCode || (StatusCode = {}));
var Grades;
(function (Grades) {
    Grades["Junior"] = "junior";
    Grades["Middle"] = "middle";
    Grades["Senior"] = "senior";
})(Grades || (Grades = {}));
const dev2 = {
    level: Grades.Junior,
    skills: [],
    login: '123'
};
function upGrade(user) {
    if (user.level == Grades.Junior) {
        user.level = Grades.Middle;
    }
    else if (user.level = Grades.Middle) {
        user.level = Grades.Senior;
    }
}
upGrade(dev2);
console.log(dev2);
//# sourceMappingURL=enum.js.map
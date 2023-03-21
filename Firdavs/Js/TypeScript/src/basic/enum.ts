enum ShapeKind {
    Circle = 12,
    Square,
}

const myShape = ShapeKind.Circle;

interface Circle {
    kind: ShapeKind.Circle;
    radius: number;
}

interface Square {
    kind: ShapeKind.Square;
    sideLength: number;
}

const circle1: Circle = {
    radius: 1,
    kind: ShapeKind.Circle,
}


enum StatusCode {
    ERROR = 500,
    NOT_FOUND = 404,
    NOT_AUTH = 403,
}

enum Grades {
    Junior = 'junior',
    Middle = 'middle',
    Senior = 'senior'
}

interface Dev {
    login: string;
    skills: string[];
    level: Grades;
}

const dev2: Dev = {
    level: Grades.Junior,
    skills: [],
    login: '123'
}

function upGrade(user: { level: Grades }) {
    if (user.level == Grades.Junior) {
        user.level = Grades.Middle;
    } else if (user.level = Grades.Middle) {
        user.level = Grades.Senior;
    }
}

upGrade(dev2);
console.log(dev2)
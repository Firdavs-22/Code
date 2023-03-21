"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.login = void 0;
const user = {
    login: 'John',
    email: 'john@gmail.com',
    password: '1234',
    isOnline: false,
    lastVisited: new Date(),
};
const admin = {
    login: 'Test',
    email: 'test@gmail.com',
    password: '4321',
    isOnline: false,
    lastVisited: new Date(),
    role: 'SuperAdmin'
};
function login(user) {
    if (user.login.length > 0 && user.password.length > 0) {
        console.log('Hello', user.login);
    }
}
exports.login = login;
login(user);
login(admin);
//# sourceMappingURL=func-obj-task.js.map
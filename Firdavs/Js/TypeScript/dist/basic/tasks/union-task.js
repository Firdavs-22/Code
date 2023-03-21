"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const developer = {
    login: 'John',
    skills: ['frontend', 'backend'],
    level: 'junior',
};
function gradeDeveloper(user, newLevel) {
    user.level = newLevel;
}
gradeDeveloper(developer, 'middle');
console.log(developer);
//# sourceMappingURL=union-task.js.map
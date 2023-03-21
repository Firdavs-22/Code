type Level = 'junior' | 'middle' | 'senior';

export interface Developer {
    login: string;
    skills: string[];
    level: Level;
}

const developer: Developer = {
    login: 'John',
    skills: ['frontend','backend'],
    level: 'junior',
}

function gradeDeveloper(user: {level: Level}, newLevel: Level) {
    user.level = newLevel;
}

gradeDeveloper(developer, 'middle');
console.log(developer);


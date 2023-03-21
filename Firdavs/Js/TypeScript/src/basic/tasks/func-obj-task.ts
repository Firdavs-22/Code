interface User {
    login: string;
    email: string;
    password: string;
    isOnline: boolean;
    lastVisited: Date;
}

const user: User = {
    login: 'John',
    email: 'john@gmail.com',
    password: '1234',
    isOnline: false,
    lastVisited: new Date(),
}

interface Admin {
    login: string;
    email: string;
    password: string;
    isOnline: boolean;
    lastVisited: Date;
    role: string;
}

const admin: Admin = {
    login: 'Test',
    email: 'test@gmail.com',
    password: '4321',
    isOnline: false,
    lastVisited: new Date(),
    role: 'SuperAdmin'
}


export function login(user: {
    login: string,
    password: string,
}): void {
    if (user.login.length > 0 && user.password.length > 0) {
        console.log('Hello', user.login)
    }
}

login(user);
login(admin);
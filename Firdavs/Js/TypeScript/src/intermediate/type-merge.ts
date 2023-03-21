type Union1 = 'a' | 'b' | 'c' | 'd';
type Union2 = 'a' | 'e' | 'c' | 'i';

type Union3 = Union1 | Union2; // all variants
type Union4 = Union1 & Union2; // a | c
type Union5 = { a: string, b: string, c: number } & { a: string; t: boolean, z: null }

type User = {
    readonly email: string;
    readonly login: string;
    password: string;
}

type Person = {
    readonly firstName: string;
    lastName: string;
    phone?: string;
    yearOfBrith: number;
}

type Employee = {
    contractStart: Date;
} & User & Person



type Developer = {
    skills: string[];
    phone: string;
    level?: 'junior' | 'middle' | 'senior';
    say(): void;
    code?: (args: string) => void;
} & Employee

export {};
export function prop<T, U extends keyof T>(key: U, obj: T): T[U] {
    return obj[key];
}

const objOne = {
    a: 1,
    b: 2,
    c: 3,
}

prop('a',objOne);


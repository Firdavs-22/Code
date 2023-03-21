export function keys<T extends object>(obj: T): Array<keyof T> {
    const currentKeys: Array<keyof T> = [];

    for (let key in obj) {
        if (obj.hasOwnProperty(key)) currentKeys.push(key);
    }

    return currentKeys;
}

export function values<T extends object>(obj: T): Array<T[keyof T]> {
    const currentValues: Array<T[keyof T]> = [];

    for (let key in obj) {
        currentValues.push(obj[key])
    }

    return currentValues;
}
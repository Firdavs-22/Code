function sum(a: number, b: number): number {
    return a + b;
}

sum(2, 5);

const Sum = (a: number, b: number): number => a + b;


function log(name: string, userId?: string): void {
    console.log('Hello', name, 'with Id', userId || 'anonymity');
}

log('John', '1');

function crash(): never {
    throw new Error('crash');
}


function average(...nums: number[]) {
    const sum = nums.reduce((current, total) => current + total, 0)

    return sum / nums.length;
}


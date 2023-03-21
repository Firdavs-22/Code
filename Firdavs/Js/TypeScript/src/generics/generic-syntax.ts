// Array<string>
// string[]
// Promise<number>

type TypeFactory<T> = T;
type XTypeStr = TypeFactory<string>;
type XTypeNum = TypeFactory<number>;
type XTypeBool = TypeFactory<boolean>;

function toArray<T>(...args: T[]): T[] {
    return args;
}

toArray<number>(1, 2, 3);
toArray('a', 'b', 'c');

function head(value: string): string;
function head(value: readonly []): undefined;
function head<T>(value: readonly T[]): T;
function head(value: any): any {
    return value[0];
}

interface ModelData<T> {
    title: string;
    value: T;
}

const firstElementInArray = <T>(value: T[]): T => value[0];

const obj: ModelData<number> = {
    title: 'test',
    value: 12
}

const objData: ModelData<Array<number>> = {
    title: 'data',
    value: [123],
}


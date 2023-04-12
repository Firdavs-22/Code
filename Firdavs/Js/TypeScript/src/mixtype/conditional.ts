const x = 15;
const isXNegative = x >= 0 ? 'no' : 'yes';

interface StringRecord {
    [key: string]: string;
}

interface DateRecord {
    [key: string]: Date;
}

type MyRecord<T> = T extends string ? StringRecord : DateRecord;

type ObjOne = MyRecord<string>
type ObjTwo = MyRecord<number>
const ObjectOne: ObjOne = {
    r: '123',
}

export {}
import {average} from '../basic/functions'

let str = 'Hello World'
type X = typeof str;

type Fn = typeof average;

const max: Fn = (...numbers) => Math.max(...numbers);
console.log(max(1, 3));

type ReturnFn = ReturnType<typeof average>;
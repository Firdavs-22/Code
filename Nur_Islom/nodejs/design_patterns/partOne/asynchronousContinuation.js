/*The global setTimeout() method sets a timer which executes a function or specified piece of code once the timer expires.*/
function additionAsync(a, b, callback) {
    setTimeout(() => callback(a + b), 100);
}

console.log('before');
additionAsync(1, 2, result => console.log('Result: '.concat(result)));
console.log('after');
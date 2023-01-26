/*simple synchronous program*/

function add(a, b) {
    return a + b;
}

/*equivalent to above*/
function newAdd(a, b, callback) {
    callback(a + b);
}

console.log('before');
newAdd(1, 3, result => console.log('Result: '.concat(result)));
console.log('after');

/*The add() function is a synchronous CPS function, which means that
it will return a value only when the callback completes its execution. */
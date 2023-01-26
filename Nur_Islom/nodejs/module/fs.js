const fs = require('fs');

const files = fs.readdirSync('./'); // synchronous method

const file = fs.readdir('./', function (err, file) {
    if (err) console.log('Error: '.concat(err));
    else console.log(file);
});      // asynchronous method

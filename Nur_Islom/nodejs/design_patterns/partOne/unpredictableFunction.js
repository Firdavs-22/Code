const fs = require('fs');
const cache = {};
function inconsistentRead(filename, callback) {
    if (cache[filename]){
        // invoked synchronously
        callback(cache[filename]);
    } else {
        // asynchronous function
        fs.readFile(filename, 'utf-8', (err, data) => {
            cache[filename] = data;
            callback(data);
        })
    }
}
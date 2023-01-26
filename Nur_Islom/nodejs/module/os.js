const os = require('os');

var totalMemory = os.totalmem();
var freeMemory = os.freemem();

// console.log('Total Memory: ' + totalMemory + 'Free Memory: ' + freeMemory);
console.log('Total Memory: ', totalMemory, '\n', 'Free Memory: ', freeMemory);
// console.log(`Total Memory: ${totalMemory}`, '\n', `Free Memory: ${freeMemory}`);
// console.log('Total Memory: '.concat(totalMemory), '\n', 'Free Memory: '.concat(freeMemory));
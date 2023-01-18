var url = 'http://mylogger.io/log';

function logger(msg){
    // Send http request
    console.log(msg);
}
module.exports = logger;
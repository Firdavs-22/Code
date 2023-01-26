const x = 22;
const y = 17;
/*obj will be an object containing the keys x and y with the values 22 and 17, respectively.*/
const obj = { x, y };

module.exports = {
    square (x) {
        return x * x;
    },
    cube (x) {
        return x * x * x;
    }
};
/*In this case, we are writing a module that exports the functions square and cube mapped
to properties with the same name. Notice that we don't need to specify the keyword function.*/


const namespace = '-webkit-';
const style = {
    [namespace + 'box-sizing'] : 'border-box',
    [namespace + 'box-shadow'] : '10px10px5px #888888'
};
/*In this case, the resulting object will contain the properties -webkit-box-sizing and -webkit-box-shadow.*/


const person = {
    name : 'George',
    surname : 'Boole',
    get fullname(){return this.name + ' ' + this.surname},

    set fullname(fullname){
        let parts = fullname.split(' ');
        this.name = parts[0];
        this.surname = parts[1];
    }
};

console.log(person.fullname); // "George Boole"
console.log(person.fullname = 'Alan Turing'); // "Alan Turing"
console.log(person.name); // "Alan"
/*It's worth noticing that the second call to console.log prints Alan Turing. This happens because by default every
set function returns the value that is returned by the get function for the same property, in this case get fullname.*/


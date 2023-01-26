/*The JavaScript spread operator (...) allows us to quickly copy
all or part of an existing array or object into another array or object.*/

const numbersOne = [1, 2, 3];
const numbersTwo = [4, 5, 6];

const numbersCombined = [...numbersOne, ...numbersTwo];
numbersCombined.forEach(element => console.log(element));

const [one, two, three, ...rest] = numbersCombined; // destructuring

console.log(rest[0]);


const myVehicle = {
    brand : 'Ford',
    model : 'Mustang',
    color : 'red'
}

const updateMyVehicle = {
    type : 'car',
    year : 2021,
    color : 'yellow'
}

const myUpdatedVehicle = {...myVehicle, ...updateMyVehicle};

console.log(myUpdatedVehicle);
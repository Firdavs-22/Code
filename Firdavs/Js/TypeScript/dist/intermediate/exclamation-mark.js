let word = null;
const num = 10;
if (num > 5) {
    word = 'abc';
}
console.log(word.toLowerCase());
function printName(name) {
    const fullName = name;
}
function printPerson(person) {
    console.log(person.name);
}
const people = [
    {
        name: '1',
        age: 1,
        sex: 'male',
    }, {
        name: '12',
        age: 2,
        sex: 'female',
    }, {
        name: '4',
        age: 12,
        sex: 'male',
    }, {
        name: '51',
        age: 51,
        sex: 'male',
    },
];
const femalePeople = people.find(person => person.sex === 'female');
//# sourceMappingURL=exclamation-mark.js.map
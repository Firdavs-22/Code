let user = {
    id: 1,
    name: 'Odil',
    age: 78,
    children: [
        {
            id: 1,
            name: 'Umar',
            age: 54,
            children: [
                {id: 1, name: 'Asmo', age: 34},
                {id: 2, name: 'Osim', age: 30},
                {id: 3, name: 'Xattob', age: 25},
            ]
        },
        {id: 2, name: 'Laylo', age: 54},
        {id: 3, name: 'Soliha', age: 12},
    ]
}

function aboveEighteen(object,) {
    function sumOfObj(object, array = []) {
        let ages = array;
        ages.push(object.age);
        if (object.children !== undefined && object.children.length > 0) {
            for (let person of object.children) {
                ages = sumOfObj(person,ages);
            }
        }
        return ages;
    }

    return sumOfObj(object);
}

console.dir(aboveEighteen(user));
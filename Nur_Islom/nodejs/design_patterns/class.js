/*function method*/
/*
function Person(name, surname, age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
}

Person.prototype.getFullName = function (){
    return this.name + ' ' + this.surname;
}

// static method
Person.older = function (person1, person2){
    return (person1.age >= person2.age) ? person1 : person2;
}*/


/*class method*/
class Person {
    constructor(name, surname, age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    getFullName(){
        return this.name + ' ' + this.surname;
    }
    static older(person1, person2){
        return (person1.age >= person2.age) ? person1 : person2;
    }
}

/*The two implementations are completely interchangeable, but the real killer feature of the
class syntax is the possibility of extending the Person prototype using the extend and
super keywords. Let's assume we want to create a PersonWithMiddlename class:*/

class PersonWithMiddlename extends Person{
    constructor(name, middlename, surname, age) {
        super(name, surname, age);
        this.middlename = middlename;
    }
    getFullName() {
        return super.getFullName() + ' ' + this.middlename;
    }
}
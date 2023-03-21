function isFish(pet) {
    return pet.swim !== undefined;
}
function move(animal) {
    if (isFish(animal)) {
        return animal.swim();
    }
    return animal.fly();
}
//# sourceMappingURL=type-guard.js.map
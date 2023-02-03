let passwordIsValid = password => {
    let pattern = /^[a-z]{2}\d{6}$/gmi;
    return pattern.test(password)
}

let carNumberValid = number => {
    let pattern = /^\d0\s([A-Z]\d{3}[A-Z]{2}|\d{3}[A-Z]{3})$/gm;
    return pattern.test(number)
}

console.log(
    passwordIsValid("aa123456"),
    carNumberValid("10 123NNN")
)

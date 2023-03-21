function assertDisplayName(user) {
    if (!user.displayName)
        throw new Error('User has not Display Name field');
}
function logUserByDisplayName(user) {
    assertDisplayName(user);
    console.log(user.displayName.toUpperCase());
}
//# sourceMappingURL=asserts.js.map
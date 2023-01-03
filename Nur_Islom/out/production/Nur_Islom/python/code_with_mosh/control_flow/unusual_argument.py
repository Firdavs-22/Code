# in this file we are going to learn about unusual argument taking functions

def magic_function(*item):
    print(item)

magic_function(1, 2, 3, 4, 5, 6, 7, 8, 9)

magic_function([1, 2, 3, 4, 5, 6, 7, 8, 9])

magic_function('hello', 'world')

def multiply_all_numbers(*arg):
    total = 1
    for value in arg:
        total *= value
    return total

print(multiply_all_numbers(5, 3, 4))


# from here things get even more crazy

def save_user(**arg):
    print(arg)

save_user(name = "John", age = 32, address = 'Broadway Street', id = 3)

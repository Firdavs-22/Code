# review python operators

# and
print(True and False)   # => False


# del   => The Python del keyword is used to delete objects.
arr = [2, 3, 5]
for i in arr:
    print(i)
del arr
# print(arr)    => this will return an NameError: name 'arr' is not defined


# from  => The 'from' keyword is used to import only a specified section from a module.
from datetime import time
x = time(hour=15)
print(x)    # => 15:00


# not
print(not True) # => False


# while
i = 0
while i < 3:
    i += 1
    print(i)


# as
from datetime import time as t
x = t(hour=15)
print(x)    # => 15:00


# elif
if i == 1:
    print('i is equal to 1')
elif i == 2:
    print('i is equal to 2')
elif i == 3:
    print('i is equal to 3')
else:
    print('I don\'t know what number i is')


# global    => a global variable value is accessible throughout the program unless shadowed. A global variable in Python is often declared as the top of the program.
global j
j = 3


# or
print(True or False)    # => True


# with  => with statement is used in exception handling to make the code cleaner and much more readable. It simplifies the management of common resources like file streams.
# with open('file_path', 'w') as file:
#     file.write('hello world !')


# assert
x = "hello"
#if condition returns True, then nothing happens:
assert x == "hello"
#if condition returns False, AssertionError is raised:
# assert x == "goodbye"     => this will raise AssertionError


# else
if j == 1:
    print(2)
else:
    print(3)


# pass  => When the pass statement is executed, nothing happens, but you avoid getting an error when empty code is not allowed. Empty code is not allowed in loops, function definitions, class definitions, or in if statements.
string = 'hello world!'
for i in string:
    if i == 'l':
        pass
    else:
        print(i)


# yield
def filter_odd(numbers):
    for number in range(numbers):
        if(number %2 !=0):
            yield number

odd_numbers = filter_odd(20)
for num in odd_numbers:
    print(num)


# break
while j < 5:
    print(j + 1)
    break


# The try block lets you test a block of code for errors.

# The except block lets you handle the error.
# The try block will generate an error, because x is not defined:
try:
  print(x)
except:
  print("An exception occurred")

print(j)


# You can use the else keyword to define a block of code to be executed if no errors were raised:
try:
  print("Hello")
except:
  print("Something went wrong")
else:
  print("Nothing went wrong")


# The 'finally' block, if specified, will be executed regardless if the try block raises an error or not.
try:
  print(x)
except:
  print("Something went wrong")
finally:
  print("The 'try except' is finished")


# use the import keyword to make code in one module available in another.


# exec()
prog = 'print("The sum of 5 and 10 is", (5+10))'
exec(prog)


# The in keyword is used to check if a value is present in a sequence (list, range, string etc.).
fruits = ["apple", "banana", "cherry"]
if "banana" in fruits:
  print("yes")


# The raise keyword is used to raise an exception.
# You can define what kind of error to raise, and the text to print to the user.
# a = -1
# if a < 0:
#   raise Exception("Sorry, no numbers below zero")


# is    => The is keyword is used to test if two variables refer to the same object.
# The test returns True if the two objects are the same object.
# The test returns False if they are not the same object, even if the two objects are 100% equal.
# Use the == operator to test if two variables are equal.
x = ["apple", "banana", "cherry"]
y = x
print(x is y)


# A lambda function is a small anonymous function.
# A lambda function can take any number of arguments, but can only have one expression.
    # Syntax
    # lambda arguments : expression

def myfunc(n):
    return lambda a : a * n

mydoubler = myfunc(2)

print(mydoubler(11))
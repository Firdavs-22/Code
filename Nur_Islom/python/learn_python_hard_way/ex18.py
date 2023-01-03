# in this file we are going to learn basic functions

# this one is like our scripts with argv
def print_two(*args):
    arg1, arg2 = args
    print('arg1: %r, arg2: %r' % (arg1, arg2))

# ok, that *args is actually pointless, we can just do this
def print_two_again(arg1, arg2):
    print('arg1: %r, arg2: %r' % (arg1, arg2))

# this just takes one argument
def print_one(arg):
    print('arg1: %r' % arg)

# this one takes no arguments
def print_none():
    print("I got nothin'.")

print_two("Zed", "Shaw")
print_two_again("Zed", "Shaw")
print_one("First!")
print_none()

# Study Drills

# def is abbrevation of define
# what does * (asterisk) in *args do?
# answer: That tells Python to take all the arguments to the function and then put them in args as a list.
# : It is like argv that you've been using, but for functions. It's not normally used too often unless specifically
# : needed.

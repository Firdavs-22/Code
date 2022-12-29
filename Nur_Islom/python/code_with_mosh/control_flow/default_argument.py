# in this file we are going to learn about default arguments

def fname(arg, inc = 1): # this inc = 1 is the default argument, which is inc by default equal to one
    return arg + inc

print(fname(3, 3))
print(fname(4))
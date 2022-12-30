# in this file we are going to learn about iterables

print(type(5))
print(type(range(2)))

# iterable

# Range is literally iterable. This means we can use it in for-loops.

for i in range(0):
    print(i)

# And string's are iterable in python too. For example:

for i in 'Gnu/Linux':
    print(i)


# Arrays are iterable too

for value in [2, 3, 5, 3, 1, 8]:
    print(value)
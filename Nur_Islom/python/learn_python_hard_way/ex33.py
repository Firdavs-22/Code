# in this file we are going to learn about while-loops

i = 0
number = []

while i < 6:
    number.append(i)
    i += 1
    print("Numbers now", number)
    print("At the bottom i is %d" % i)

print("The numbers: ")

for num in number:
    print(num)
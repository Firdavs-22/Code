s = 'abc'
print(len(s))       # len() function

print(s[1])         # returns : b
print(s[-2])        # returns : b

s = s + 'd'
print(s[-1])        # returns : last element of a string

print(s[1:3])       # returns : bs of "abcd" string, which is 1 and 2 index characters
# full syntax => string[start:stop:stepo]

print(s[::-1])      # returns : reversed version of a string

for i in range(1, 5, 3):
    print(i)        # returns : 1 4
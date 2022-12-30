# in this file we are going to learn how to read files

from sys import argv
script, filename = argv

# the open() method will open a file
txt = open(filename)

print("Here's your file %r" % filename)

# the read() method will read all the contents of opened file
print(txt.read())
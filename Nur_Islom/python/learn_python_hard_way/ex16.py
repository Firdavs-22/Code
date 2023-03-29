# in this file we are going to learn reading and writing files

# Here's the list of commands which you need to remember:
# close()       => Closes the file. Like FileClass->Save..in your editor.
# read()        => Reads the contents of the file. You can assign the result to a variable.
# readline()    => Reads just one line of a text file.
# truncate()    => Empties the file. Watch out if you care about the file.
# write(stuff)  => Writes stuff to the file.

from sys import argv

script, filename = argv

print("We're going to erase %r." % filename)
print("If you don't want that, hit CTRL-C (^C).")
print("If you don't want that, hit RETURN.")

input("?")

print("Opening the file...")
target = open(filename, 'w')
# Character Meaning
# 'r'   =>  open for reading (default)
# 'w'   =>  open for writing, truncating the file first
# 'x'   =>  create a new file and open it for writing
# 'a'   =>  open for writing, appending to the end of the file if it exists
# 'b'   =>  binary mode
# 't'   =>  text mode (default)
# '+'   =>  open a disk file for updating (reading and writing)
# 'U'   =>  universal newline mode (deprecated)

print("Truncating the file. Goodbye!")
target.truncate()

print("Now I'm going to ask you foor three lines.")

line1 = input('line1: ')
line2 = input('line2: ')
line3 = input('line3: ')

print("I'm going to write there to the file.")

target.write(line1)
target.write('\n')
target.write(line2)
target.write('\n')
target.write(line3)
target.write('\n')

print("And finally, we close it.")
target.close()

# Study Drills


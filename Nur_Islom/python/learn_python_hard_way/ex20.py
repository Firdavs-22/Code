# in this file we are going to learn more about functions

from sys import argv

script, input_file = argv

def print_all(file):
    print(file.read())

def rewind(file):
    file.seek(0)

def print_a_line(line_count, file):
    print(line_count, file.readline())

current_file = open(input_file)

print("First let's print the whole file:\n")

print_all(current_file)

print("Now let's rewind, kind of like a tape.")

rewind(current_file)

print("Let't print three lines:")

current_line = 1
print_a_line(current_line, current_file)

current_line += 1
print_a_line(current_line, current_file)

current_line += 1
print_a_line(current_line, current_file)

# Study Drills

# In Python, seek() function is used to change the position of the File Handle to a given specific position. File handle is like a cursor, which defines from where the data has to be read or written in the file.
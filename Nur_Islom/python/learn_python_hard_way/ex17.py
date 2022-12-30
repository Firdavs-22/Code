# in this file we are going to learn to copy one file to another

from sys import argv
from os.path import exists

script, from_file, to_file = argv

print("Copying from %s to %s" % (from_file, to_file))

# we could do these two on one line too, how?
in_file = open(from_file).read()
# indata = in_file.read()

print("The input file is %d bytes long" % len(in_file))

print("Does the output file exist? %r" % exists(to_file))
print("Ready, hit RETURN to continue, CTRL-C to abort.")
input()

out_file = open(to_file, 'a')
out_file.write(in_file)

print("Alright, all done.")

out_file.close()
in_file.close()

# Study Drills

# len()     => It gets the length of the string that you pass to it and then returns that as a number.
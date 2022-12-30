# in this file we are gonna import other python file and use it

import ex25

sentence = "All good things come to those who wait."
words = ex25.break_words(sentence)
print(words)

sorted_words = ex25.sort_words(words)
print(sorted_words)

print(ex25.print_first_word(words))

print(ex25.print_last_word(words))

print(words)

print(sorted_words)

ex25.print_first_and_last_sorted(sentence)

# Study Drills

# Typing ex25. every time you want to use it's functions is annoying.
# :A shortcut is to do your import like this: from ex25 import *
# :which is like saying, "Import everything from ex25.". Programmers like
# :saying things backward. Start a new session and see how all your 
# :functions are right there.

# Some common student questions

# I get a None printed out for some of the functions.
# Answer => You probably have a function that is missing the return at the end.

# I get ImportError: No module named ex25.py when I type import import ex25.py
# Answer => Don't add the .py at the end. Python knows the file ends in .py,
# :so you just type import ex25.
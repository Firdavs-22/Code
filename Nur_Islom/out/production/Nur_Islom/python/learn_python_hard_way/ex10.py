# in this file we learn escape sequences

tabby_cat = "\tI'm tabbed in." # this is horizontal tab (TAB)
persian_cat = "I'm split\non a line"
backslash_cat = "I'm \\ a \\ cat."

fat_cat = '''
I'll do a list:
\t* Cat food
\t* Fishies
\t* Catnip\n\t* Grass
'''

print(tabby_cat)
print(persian_cat)
print(backslash_cat)
print(fat_cat)

# Study Drills

# Escape char   =>  What it does.
# \a            =>  ASCII bell (BEL)
# \b            =>  ASCII backspace (BS)
# \f            =>  ASCII formfeed (FF)
# \n            =>  ASCII linefeed (LF)
# \N{name}      =>  Character named name in the Unicode database (Unicode only)
# \r            =>  ASCII carriage return (CR)
# \t            =>  ASCII horizontal tab (TAB)
# \uxxxx        =>  Character with 16-bit hex value xxxx (Unicode only)
# \Uxxxxxxxx    =>  Character with 32-bit hex value xxxxxxxx (Unicode only)
# \v            =>  ASCII vertical tab (VT)
# \ooo          =>  Character with octal value oo
# \xhh          =>  Character with hex value hh

# Here's tiny piece of fun code to try out:
# But that's nasty and infinite loop, don't run this
# while True:
#     for i in ["/", "-", "|", "\\", "|"]:
#         print("%s\r" % i)
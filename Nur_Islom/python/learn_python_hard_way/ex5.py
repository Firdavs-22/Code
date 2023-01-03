# in this file we learn how to format prints
import numbers

my_name = 'Zed Shaw'
my_age = 35 # not a lie
my_height = 74 # inches
my_weight = 180 # lbs
my_eyes = 'Blue'
my_teeth = 'White'
my_hair = 'Brown'

print("Let's talk about %s." % my_name)
print("He's %d inches tall." % my_height)
print("He's %d pounds heavy." % my_weight)
print("Actually that's not too heavy.")
print("He's goot %s eyes and %s hair." % (my_eyes, my_hair))
print("His teeth are usually %s  depending on the coffee" % my_teeth)

# %r is very useful one. It's like saying "print this no matter what." (raw)
print('this is a number %r' % my_height)
print('this is a text %r' % my_eyes)

# this line is tricky, try to get it exactly right

print("If I add %d, %d, and %d I get %d." % (my_age, my_height, my_weight, my_age + my_height + my_weight))

# Study Drills

# 'd' for integers. (double)
# 'f' for floating-point numbers. (float)
# 'b' for binary numbers. (binary)
# 'o' for octal numbers => (A number system which has its base as 'eight' is called an Octal number system).
# 'x' for octal hexadeximal numbers.
# 's' for string
# 'e' for floating-point in an exponent format
# 'r' for debugging purposes. (raw)

print('to convert lbs to kg, multiply the given lbs value by %f' % 0.45359237)
print('Zed Shaw has %f weight in kilogramm' % (my_weight * 0.45359237))
print(round(0.45359237))
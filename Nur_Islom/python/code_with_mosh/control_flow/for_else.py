# in this file we are going to learn about how loops works and how to use it with else statement

success = False

for value in range(0, 3):
    if success:
        print('successful')
        break
    else:
        print('attempt %d' % value)
else:
    print('Attemped 3 times and failed')
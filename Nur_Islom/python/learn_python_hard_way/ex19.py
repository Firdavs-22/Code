# in this file we are gonna learn more about functions and function parameters


def cheese_and_crackers(cheese_count, boxes_of_crackers):
    print("You have %d cheeses!" % cheese_count)
    print("You have %d boxes of crackers" % boxes_of_crackers)
    print("Man that's enough for a party!")
    print("Get a blanket.\n")

print("We can just give the function numbers directly:")
cheese_and_crackers(20, 30)

print("Or, we can use variables from our script:")
amount_of_cheese = 10
amount_of_crackers = 50

cheese_and_crackers(amount_of_cheese, amount_of_crackers)

print("We can even do math inside too:")
cheese_and_crackers(10 + 20, 5 + 24)

print("And we can combine the two, variables and math:")
cheese_and_crackers(amount_of_cheese + 5, amount_of_crackers - 49)

# Study Drills

# one more my function

def call_it():
    answer = input("Call it!\n> ")
    if answer == "heads":
        return print("Okay take it.")
    else:
        print("I will come back after you!")

call_it();
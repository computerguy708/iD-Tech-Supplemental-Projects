import random

comp_weight = random.randrange(0, 100)

guessed = False

while not guessed:
    answer = input("Guess the weight!")
    answer = int(answer)

    if answer == comp_weight:
        print("You got it right!")
        guessed = True
    elif answer > comp_weight:
        print("Your guess is too high!")
    else:
        print("Your guess is too low!")

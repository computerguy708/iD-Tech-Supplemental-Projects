guessed = False;

while not guessed:
    guess = input("Guess a number")
    if int(guess) == 50:
        guessed = True

print("You win!!")

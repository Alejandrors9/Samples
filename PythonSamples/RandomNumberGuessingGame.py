#Alejandro Ruiz-Serrano
#4/13/23
#random number guessing game
import random
again="yes"
while again == "yes":
    y = random.randint(0,100)
    count=0
    guess = int(input("\nGuess a number: "))
    while guess != y:
        if guess < y:
            print("Too low")
            count+=1
        elif guess > y:
            print("Too high")
            count+=1
        guess = int(input("Guess again: "))
    print("You guessed correctly, it took you", count, "tries")
    if count < 4:
        print("\|O__O|/ amazing")
    elif count < 20:
        print("You did all right")
    else:
        print("Hmmmmmmmmm guesses could be better")
    again = input("Enter 'yes' if you want to play again: ")

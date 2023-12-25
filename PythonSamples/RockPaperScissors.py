#Alejandro Ruiz-Serrano
#3/21
#Rock Paper Scissors
import random
user = input("Enter 'rock' 'paper' or 'scissors': ")
comp = random.randint(0,2)
if user == "paper":
    user = 0
    if user == comp:
        print("Draw")
    elif comp == 1:
        print("You win")
    else:
        print("You lose")
elif user == "rock":
    user = 1
    if user == comp:
        print("Draw")
    elif comp == 2:
        print("You win")
    else:
        print("You lose")
elif user == "scissors":
    user = 2
    if user == comp:
        print("Draw")
    elif comp == 0:
        print("You win")
    else:
        print("You lose")
else:
    print("Error, only rock paper or scissors is allowed")



                         

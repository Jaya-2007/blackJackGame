Blackjack Game – Java Console Version
Project Description

This is a console-based Blackjack game in Java where a user plays against the computer (dealer).
The user can choose to Hit (draw another card) or Stand (keep their total).
The dealer automatically draws cards until their total reaches at least 17.
The program then determines the winner based on standard Blackjack rules.

How to Play

User is dealt two random cards (1–11).

Dealer shows one card.

User chooses:

hit → draw another card

stand → keep current total

Dealer draws cards automatically until total ≥ 17.

The winner is declared:

Highest total ≤ 21 wins

Tie if totals are equal

Bust if total exceeds 21

Features

Fully interactive with user input

Dealer draws automatically

Displays both user and dealer totals

Determines winner automatically

Beginner-friendly and console-based

How to Run

Save the Java file as:

BlackjackGame.java


Open terminal/command prompt in the project folder.

Compile the code:

javac BlackjackGame.java


Run the program:

java BlackjackGame

Sample Output
Blackjack Game

Your cards: 7 and 9
Your total: 16
Dealer shows: 10
Do you want to Hit or Stand? (hit/stand): hit
You drew: 5
Your total: 21
Do you want to Hit or Stand? (hit/stand): stand

Dealer's turn:
Dealer drew: 6
Dealer total: 16
Dealer drew: 4
Dealer total: 20

Final Scores
Your total: 21
Dealer total: 20
You Win!

Concepts Used

Java Scanner for user input

Java Random class for card values

while loop for user and dealer turns

Conditional statements (if-else)

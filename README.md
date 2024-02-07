# Snap Card Game

## Overview

This project implements the classic card game Snap in Java. Snap is a fast-paced game where players race to match cards.

## How to Play

### Setup

1. **Deck**: Use a standard deck of 52 playing cards. The deck is shuffled, and each player is dealt an equal number of cards.

2. **Players**: At least two players are required to play Snap

### Gameplay

1. **Taking Turns**: Players take turns drawing a card from the deck

2. **Matching Cards**: If two consecutive cards played by different players match (e.g., both cards are of the same rank), the first player to call "Snap!" wins.

3. **Winning**: There is a two second timer and a player only wins if they call snap within the two seconds.

   
## Implementation Details
- The game is implemented in Java.
- The `Game` class manages the deck of cards, deals cards to players, and provides methods for shuffling and sorting the deck.
- The `Snap` class extends the `Game` class and implements the Snap game logic.

## How to Run

1. Clone the repository to your local machine.
2. Run the `Main` class to start the game.


# Java Console Game Project

## Overview
This project is part of my first Java module in the course I am currently following. The goal was to create a console-based single-player game with interactions between the player and the game board.

## Project Constraints
Several constraints were set for the project:
- The game must allow interactions like:
  - Choosing the character type
  - Naming the character
  - Starting or quitting the game
  - Modifying the character
  - Viewing character information
- The game structure was predefined with:
  - Abstract classes managing the characters
  - An interface `Case` handling player interactions on each square

## Game Mechanics
- **Board**: The game takes place on a 64-square board.
- **Squares**: Each square can contain:
  - An enemy
  - Equipment
  - A potion
  - Nothing (empty square)
- **Turns**: The player progresses by rolling a die, advancing on the board and interacting with whatever is on the current square.

## Conclusion
This project served as a foundational exercise in structuring and managing a Java application, focusing on object-oriented principles. Additionally, it taught me how to effectively use the debugger in IntelliJ to troubleshoot and refine my code.

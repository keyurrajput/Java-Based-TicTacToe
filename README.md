# Tic-Tac-Toe Game

## Overview
This is a classic Tic-Tac-Toe game implemented in Java, offering a text-based console interface for two players. The program features a clean, intuitive design that allows players to take turns placing their marks ('X' and 'O') on a 3x3 grid, with the goal of achieving three in a row horizontally, vertically, or diagonally.

## Features
- **Two-player Gameplay**: Alternating turns between Player X and Player O
- **Score Tracking**: Keeps track of wins for both players throughout multiple games
- **Input Validation**: Prevents players from selecting already occupied cells
- **Dynamic Board Display**: Updates and displays the current state of the board after each move
- **Game State Detection**: Automatically identifies wins, ties, and ongoing game states
- **Replay Option**: Allows players to start a new game after completion without restarting the program

## Game Rules
1. The game is played on a 3x3 grid
2. Players take turns placing their mark ('X' or 'O') in an empty cell
3. The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins
4. If all cells are filled and no player has achieved three in a row, the game ends in a tie
5. The score is tracked across multiple games in a single session

## Technical Implementation
The game is built using Java and utilizes the following components:

### Constants
- `BOARD_SIZE`: Defines the dimensions of the game board (3x3)
- `PLAYER_X` and `PLAYER_O`: Character representations for the two players

### Key Methods
- `initializeBoard()`: Sets up an empty game board
- `displayBoard()`: Renders the current state of the game board in the console
- `getPlayerMove()`: Prompts the current player to enter their move
- `isWinningMove()`: Checks if the last move resulted in a win
- `isBoardFull()`: Determines if all cells are occupied (tie condition)

### Data Structures
- 2D character array: Represents the game board state
- Integer variables: Track the score for each player

## How to Run
1. Ensure you have Java Development Kit (JDK) installed on your system
2. Compile the Java source file:
   ```
   javac TicTacToe.java
   ```
3. Run the compiled program:
   ```
   java TicTacToe
   ```

## Gameplay Instructions
1. The game starts with Player X
2. When prompted, enter your move by specifying the row and column numbers (1-3) separated by a space
3. The board coordinates are as follows:
   ```
      1 2 3
   1    |   |   
     ----------
   2    |   |   
     ----------
   3    |   |   
   ```
4. After a game ends (win or tie), you can choose to play again or exit
5. The score is displayed at the beginning of each game

## Code Structure
- The main game loop handles the core gameplay, including turn management and win/tie detection
- Player input is collected through the console using the Scanner class
- The board state is represented using a 2D array, with empty cells containing the null character ('\u0000')
- Win conditions are checked after each move by examining rows, columns, and diagonals

## Future Enhancements
- Implement a single-player mode with AI opponent
- Add difficulty levels for the AI
- Create a graphical user interface
- Implement game state saving and loading
- Add customizable board sizes
- Include player names instead of just X and O
- Implement network play for remote opponents

## System Requirements
- Java Runtime Environment (JRE) 8 or higher
- Console/Terminal with text display capabilities

## Developer Information
This Tic-Tac-Toe implementation demonstrates fundamental programming concepts including:
- 2D array manipulation
- User input handling
- Game state management
- Control flow and conditional logic
- Console-based user interface design

---

Enjoy the game and may the best strategist win!

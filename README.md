# Tic-Tac-Toe

Tic-tac-toe or Xs and Os is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3×3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row is the winner.

![Image of TicTacToe](https://static-s.aa-cdn.net/img/ios/391030527/aeee21c8d4eb63a6a927173fdf5333c2?v=1)


## Purpose

Finding out the result of the classic game Tic-tac-toe using JAVA when a given set of inputs are given for 2 players playing the game.

## Approach

Using JAVA as the base and  Maven to handle the dependencies, following the approach of TDD to achieve the solution, by creating test cases and developing accordingly to pass the test.

## Rules of Tic-Tac-Toe

    - X always goes first.
	- Players cannot play on a played position.
	- Players alternate placing X’s and O’s on the board until either:
      	○ One player has three in a row, horizontally, vertically or diagonally.
      	○ All nine squares are filled.
	- If a player is able to draw three X’s or three O’s in a row, that player wins.
	- If all nine squares are filled and neither player has three in a row, the game is a draw.

## Test Cases Covered

    - Player X is assigned when first turn is played.
	- Player O is assigned when second turn is played.
	- Player X is assigned when third turn is played.
	- Handling Position already filled Exception when turn played at a used position. 
	- Declaring Player X is winner when first row is filled with 3 'X' tokens.
	- Declaring Player X is winner when second row is filled with 3 'X' tokens.
	- Declaring Player X is winner when third row is filled with 3 'X' tokens.
	- Declaring Player O is winner when first row is filled with 3 'O' tokens.
	- Declaring Player O is winner when second row is filled with 3 'O' tokens.
	- Declaring Player O is winner when third row is filled with 3 'O' tokens.
	- Declaring Player X is winner when first column is filled with 3 'X' tokens.
    - Declaring Player X is winner when second column is filled with 3 'X' tokens.
    - Declaring Player X is winner when third column is filled with 3 'X' tokens.
    - Declaring Player O is winner when first column is filled with 3 'O' tokens.
    - Declaring Player O is winner when second column is filled with 3 'O' tokens.
    - Declaring Player O is winner when third column is filled with 3 'O' tokens.
    - Declaring Player X is winner when Left to Right Diagonal is filled with 3 'X' tokens.
    - Declaring Player O is winner when Left to Right Diagonal is filled with 3 'O' tokens.
    - Declaring Player X is winner when Right to Left Diagonal is filled with 3 'X' tokens.
    - Declaring Player O is winner when Right to Left Diagonal is filled with 3 'O' tokens.
    - Declaring Game is a Draw when 9 chances are played and there are no tokens filled 3 in a row.
    
## Prerequisites

To run this program below software needs to be installed

    1. Java - Version 1.6 or above
    2. Maven - For Dependency management
    3. JUnit - Version 4.13 (added dependency in pom.xml)
    4. Intellij - Any IDE which supports Java

## How to run the unit test cases using Intellij

    Download project as zip file and unzip the same to a folder. 
    In Intellij Go to 
    File -> New -> select Project from Existing sources -> Next -> Browse extracted folder -> select the pom.xml and will search for maven projects.
    Once Project is checked out -> Right click project in Project Explorer window and select Run All Tests
    Once above steps done All the test cases will be executed and the results will be displayed in the RUN console.
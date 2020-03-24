package com.kata.tictactoe;

public class PositionOutOfGridException extends Exception {
    @Override
    public String toString() {
        return "Position Entered is Out of the 3x3 Game Board.";
    }
}
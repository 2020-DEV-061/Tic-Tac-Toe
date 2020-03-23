package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameBoardLayout = new char[3][3];

    public void playTurnAt(final int positionX, final int positionY) {
        gameBoardLayout[positionX][positionY] = 'X';
    }

    public char getPlayerAt(final int positionX, final int positionY) {
        return gameBoardLayout[positionX][positionY];
    }
}
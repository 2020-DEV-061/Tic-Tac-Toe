package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameBoardLayout = new char[3][3];
    private char currentPlayer;

    public void playTurnAt(final int positionX, final int positionY) {
        currentPlayer = getCurrentPlayerToBePlayed();
        gameBoardLayout[positionX][positionY] = currentPlayer;
    }

    private char getCurrentPlayerToBePlayed() {
        return currentPlayer == 'X' ? 'O' : 'X';
    }

    public char getPlayerAt(final int positionX, final int positionY) {
        return gameBoardLayout[positionX][positionY];
    }
}
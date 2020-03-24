package com.kata.tictactoe;

public class TicTacToeGame {
    private char[][] gameBoardLayout = new char[3][3];
    private char currentPlayer;
    private int totalTurnsPlayed;

    public String playTurnAt(final int positionX, final int positionY) throws PositionAlreadyInUseException, PositionOutOfGridException {
        if (positionX < 0 || positionY < 0 || positionX > 2 || positionY > 2) {
            throw new PositionOutOfGridException();
        }
        checkIsPositionAlreadyFilled(positionX, positionY);
        currentPlayer = getCurrentPlayerToBePlayed();
        gameBoardLayout[positionX][positionY] = currentPlayer;
        totalTurnsPlayed++;
        if (isCurrentPlayerWinner()) {
            return ("Player " + currentPlayer + " is the Winner");
        }
        if (isGameDraw()) {
            return "It is a Draw";
        }
        return null;
    }

    private boolean isGameDraw() {
        return (totalTurnsPlayed == 9);
    }

    private boolean isCurrentPlayerWinner() {
        return (isCurrentPlayerWinnerByRow() ||
                isCurrentPlayerWinnerByColumn() ||
                isCurrentPlayerWinnerByLeftToRightDiagonal() ||
                isCurrentPlayerWinnerByRightToLeftDiagonal());
    }

    private boolean isCurrentPlayerWinnerByRightToLeftDiagonal() {
        return (getPlayerAt(0, 2) == currentPlayer) &&
                (getPlayerAt(0, 2) == getPlayerAt(1, 1)) &&
                (getPlayerAt(0, 2) == (getPlayerAt(2, 0)));
    }

    private boolean isCurrentPlayerWinnerByLeftToRightDiagonal() {
        return (getPlayerAt(0, 0) == currentPlayer) &&
                (getPlayerAt(0, 0) == getPlayerAt(1, 1)) &&
                (getPlayerAt(0, 0) == (getPlayerAt(2, 2)));
    }

    private boolean isCurrentPlayerWinnerByColumn() {
        for (int column = 0; column < 3; column++) {
            if ((getPlayerAt(0, column) == currentPlayer) &&
                    (getPlayerAt(0, column) == getPlayerAt(1, column)) &&
                    (getPlayerAt(0, column) == getPlayerAt(2, column))) {
                return true;
            }
        }
        return false;
    }

    private boolean isCurrentPlayerWinnerByRow() {
        for (int row = 0; row < 3; row++) {
            if ((getPlayerAt(row, 0) == currentPlayer) &&
                    (getPlayerAt(row, 0) == getPlayerAt(row, 1)) &&
                    (getPlayerAt(row, 0) == getPlayerAt(row, 2))) {
                return true;
            }
        }
        return false;
    }

    private void checkIsPositionAlreadyFilled(final int positionX, final int positionY) throws PositionAlreadyInUseException {
        if (gameBoardLayout[positionX][positionY] != '\0') {
            throw new PositionAlreadyInUseException(positionX, positionY);
        }
    }

    private char getCurrentPlayerToBePlayed() {
        return currentPlayer == 'X' ? 'O' : 'X';
    }

    public char getPlayerAt(final int positionX, final int positionY) {
        return gameBoardLayout[positionX][positionY];
    }
}
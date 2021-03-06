package com.kata.tictactoe;

class TicTacToeGame {
    private static final int MAX_GRID_SIZE = 3;
    private static final int FIRST_POSITION = 0;
    private static final int SECOND_POSITION = 1;
    private static final int THIRD_POSITION = 2;
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private char[][] gameBoard = new char[MAX_GRID_SIZE][MAX_GRID_SIZE];
    private char currentPlayer;
    private int totalTurnsPlayed;

    char[][] getGameBoard() {
        return gameBoard;
    }

    String playTurnAt(final int positionX, final int positionY) throws PositionAlreadyInUseException, PositionOutOfGridException {
        validatePosition(positionX, positionY);
        currentPlayer = getCurrentPlayerToBePlayed();
        gameBoard[positionX][positionY] = currentPlayer;
        totalTurnsPlayed++;
        if (isCurrentPlayerWinner()) {
            return ("Player " + currentPlayer + " is the Winner");
        }
        if (isGameDraw()) {
            return "It is a Draw";
        }
        return null;
    }

    private void validatePosition(int positionX, int positionY) throws PositionOutOfGridException, PositionAlreadyInUseException {
        checkIsPositionOutOfGameBoardGrid(positionX, positionY);
        checkIsPositionAlreadyFilled(positionX, positionY);
    }

    private void checkIsPositionOutOfGameBoardGrid(int positionX, int positionY) throws PositionOutOfGridException {
        if (isPositionOutOfGameBoardGrid(positionX, positionY)) {
            throw new PositionOutOfGridException();
        }
    }

    private boolean isPositionOutOfGameBoardGrid(int positionX, int positionY) {
        return ((positionX < FIRST_POSITION) || (positionY < FIRST_POSITION) || (positionX > THIRD_POSITION) || (positionY > THIRD_POSITION));
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
        return (getPlayerAt(FIRST_POSITION, THIRD_POSITION) == currentPlayer) &&
                (getPlayerAt(SECOND_POSITION, SECOND_POSITION) == currentPlayer) &&
                ((getPlayerAt(THIRD_POSITION, FIRST_POSITION) == currentPlayer));
    }

    private boolean isCurrentPlayerWinnerByLeftToRightDiagonal() {
        return ((getPlayerAt(FIRST_POSITION, FIRST_POSITION) == currentPlayer) &&
                (getPlayerAt(SECOND_POSITION, SECOND_POSITION) == currentPlayer) &&
                (getPlayerAt(THIRD_POSITION, THIRD_POSITION) == currentPlayer));
    }

    private boolean isCurrentPlayerWinnerByColumn() {
        for (int column = FIRST_POSITION; column < 3; column++) {
            if ((getPlayerAt(FIRST_POSITION, column) == currentPlayer) &&
                    (getPlayerAt(SECOND_POSITION, column) == currentPlayer) &&
                    (getPlayerAt(THIRD_POSITION, column) == currentPlayer)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCurrentPlayerWinnerByRow() {
        for (int row = FIRST_POSITION; row < 3; row++) {
            if ((getPlayerAt(row, FIRST_POSITION) == currentPlayer) &&
                    (getPlayerAt(row, SECOND_POSITION) == currentPlayer) &&
                    (getPlayerAt(row, THIRD_POSITION) == currentPlayer)) {
                return true;
            }
        }
        return false;
    }

    private void checkIsPositionAlreadyFilled(final int positionX, final int positionY) throws PositionAlreadyInUseException {
        if (gameBoard[positionX][positionY] != '\0') {
            throw new PositionAlreadyInUseException(positionX, positionY);
        }
    }

    private char getCurrentPlayerToBePlayed() {
        return currentPlayer == PLAYER_X ? PLAYER_O : PLAYER_X;
    }

    char getPlayerAt(final int positionX, final int positionY) {
        return gameBoard[positionX][positionY];
    }
}
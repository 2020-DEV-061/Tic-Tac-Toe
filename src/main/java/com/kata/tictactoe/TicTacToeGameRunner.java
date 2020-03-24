package com.kata.tictactoe;

import java.util.Scanner;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class TicTacToeGameRunner {
    private static final Logger LOGGER = Logger.getLogger(TicTacToeGameRunner.class.getName());

    public static void main(String[] args) throws PositionAlreadyInUseException, PositionOutOfGridException {
        TicTacToeGameRunner gameRunner = new TicTacToeGameRunner();
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        String gameResult = playTicToeToe(ticTacToeGame);
        gameRunner.drawGameBoard(ticTacToeGame);
        LOGGER.log(INFO, gameResult);
    }

    private static String playTicToeToe(final TicTacToeGame ticTacToeGame) throws PositionAlreadyInUseException, PositionOutOfGridException {
        int positionX;
        int positionY;
        Scanner sc = new Scanner(System.in);
        String gameResult = null;
        while (null == gameResult) {
            LOGGER.log(INFO, "Enter the Coordinates X and Y for the chance to be played at: ");
            positionX = sc.nextInt();
            positionY = sc.nextInt();
            gameResult = ticTacToeGame.playTurnAt(positionX, positionY);
        }
        return gameResult;
    }

    private void drawGameBoard(final TicTacToeGame ticTacToeGame) {
        char[][] gameBoard = ticTacToeGame.getGameBoard();
        StringBuilder gameLayoutDisplay = new StringBuilder("\n");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                gameLayoutDisplay.append(gameBoard[row][column]);
                if (column != 2) {
                    gameLayoutDisplay.append(" | ");
                }
            }
            appendBreakForNextLine(gameLayoutDisplay, row);
        }
        LOGGER.log(INFO, gameLayoutDisplay.toString());
    }

    private void appendBreakForNextLine(final StringBuilder gameLayoutDisplay, final int row) {
        gameLayoutDisplay.append("\n");
        if (row != 2) {
            gameLayoutDisplay.append("--  --  --");
            gameLayoutDisplay.append("\n");
        }
    }
}
package com.kata.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeGameTest {

    private TicTacToeGame ticTacToeGame;

    @Before
    public void initializeTicTacToeGameObject() {
        ticTacToeGame = new TicTacToeGame();
    }

    @Test
    public void getPlayerAtShouldReturnXWhenFirstTurnIsPlayed() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.playTurnAt(0, 0);
        assertEquals('X', ticTacToeGame.getPlayerAt(0, 0));
    }

    @Test
    public void getPlayerAtShouldReturnOWhenSecondTurnIsPlayed() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.playTurnAt(0, 0);
        ticTacToeGame.playTurnAt(0, 1);
        assertEquals('O', ticTacToeGame.getPlayerAt(0, 1));
    }

    @Test
    public void getPlayerAtShouldReturnXWhenThirdTurnIsPlayed() {
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(0,2);
        assertEquals('X', ticTacToeGame.getPlayerAt(0,2));
    }
}
package com.kata.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeGameTest {

    @Test
    public void getPlayerAtShouldReturnXWhenFirstTurnIsPlayed() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.playTurnAt(0, 0);
        assertEquals('X', ticTacToeGame.getPlayerAt(0, 0));
    }
}
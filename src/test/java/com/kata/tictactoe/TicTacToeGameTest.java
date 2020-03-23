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
    public void getPlayerAtShouldReturnXWhenFirstTurnIsPlayed() throws PositionAlreadyInUseException {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.playTurnAt(0, 0);
        assertEquals('X', ticTacToeGame.getPlayerAt(0, 0));
    }

    @Test
    public void getPlayerAtShouldReturnOWhenSecondTurnIsPlayed() throws PositionAlreadyInUseException {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.playTurnAt(0, 0);
        ticTacToeGame.playTurnAt(0, 1);
        assertEquals('O', ticTacToeGame.getPlayerAt(0, 1));
    }

    @Test
    public void getPlayerAtShouldReturnXWhenThirdTurnIsPlayed() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0, 0);
        ticTacToeGame.playTurnAt(0, 1);
        ticTacToeGame.playTurnAt(0, 2);
        assertEquals('X', ticTacToeGame.getPlayerAt(0, 2));
    }

    @Test(expected = PositionAlreadyInUseException.class)
    public void playTurnAtShouldThrowPositionAlreadyFilledExceptionWhenPlayingAtAUsedPosition() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0, 0);
        ticTacToeGame.playTurnAt(0, 0);
    }

    @Test
    public void playTurnAtShouldReturnXIsWinnerWhenEntireFirstRowIsOccupiedByX() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(1,0);
        ticTacToeGame.playTurnAt(0,1);
        ticTacToeGame.playTurnAt(2,0);
        assertEquals("Player X is the Winner", ticTacToeGame.playTurnAt(0,2));
    }

    @Test
    public void playTurnAtShouldReturnXIsWinnerWhenEntireSecondRowIsOccupiedByX() throws PositionAlreadyInUseException {
        ticTacToeGame.playTurnAt(1,0);
        ticTacToeGame.playTurnAt(0,0);
        ticTacToeGame.playTurnAt(1,1);
        ticTacToeGame.playTurnAt(2,0);
        assertEquals("Player X is the Winner", ticTacToeGame.playTurnAt(1,2));
    }
}
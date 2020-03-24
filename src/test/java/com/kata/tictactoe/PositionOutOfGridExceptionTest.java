package com.kata.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionOutOfGridExceptionTest {
    @Test
    public void toStringShouldReturnPositionOutsideGameBoardGrid() {
        PositionOutOfGridException exception = new PositionOutOfGridException();
        assertEquals("Position Entered is Out of the 3x3 Game Board.", exception.toString());
    }
}
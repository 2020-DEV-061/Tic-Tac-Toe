package com.kata.tictactoe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionAlreadyInUseExceptionTest {
    @Test
    public void toStringShouldReturnGivenPositionAlreadyInUse(){
        PositionAlreadyInUseException exception = new PositionAlreadyInUseException(1,1);
        assertEquals("Position (1, 1) is already filled.", exception.toString());
    }
}

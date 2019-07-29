package ca.jrvs.challenge.frequency_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveAveTest {

    @Test
    public void next() {
        MoveAve moveAve = new MoveAve(3);
        assertTrue(moveAve.next(1)==1);
    }
}
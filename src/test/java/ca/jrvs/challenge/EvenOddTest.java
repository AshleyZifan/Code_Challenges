package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    @Test
    public void isEven() {
        EvenOdd evenOdd = new EvenOdd();
        assertTrue(evenOdd.isEven(2));
    }
}
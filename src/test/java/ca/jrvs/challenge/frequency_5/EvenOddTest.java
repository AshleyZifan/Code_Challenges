package ca.jrvs.challenge.frequency_5;

import ca.jrvs.challenge.frequency_5.EvenOdd;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    @Test
    public void isEven() {
        EvenOdd evenOdd = new EvenOdd();
        assertTrue(evenOdd.isEven(2));
    }
}
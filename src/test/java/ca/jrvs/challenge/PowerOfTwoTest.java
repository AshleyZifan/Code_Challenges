package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void isPowerOfTwo() {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        assertTrue(powerOfTwo.isPowerOfTwo(4));
        assertFalse(powerOfTwo.isPowerOfTwo(3));
    }
}
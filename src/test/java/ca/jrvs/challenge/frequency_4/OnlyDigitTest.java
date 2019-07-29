package ca.jrvs.challenge.frequency_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class OnlyDigitTest {

    @Test
    public void isOnlyDigit() {
        OnlyDigit onlyDigit = new OnlyDigit();
        assertTrue(onlyDigit.isOnlyDigit("7654392"));
        assertFalse(onlyDigit.isOnlyDigit("a22a"));
    }
}
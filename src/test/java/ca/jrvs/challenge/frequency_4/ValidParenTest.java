package ca.jrvs.challenge.frequency_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenTest {

    @Test
    public void isValid() {
        ValidParen validParen = new ValidParen();
        assertTrue(validParen.isValid("(())"));
        assertFalse(validParen.isValid("(()))"));
    }
}
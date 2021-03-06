package ca.jrvs.challenge.frequency_5;

import ca.jrvs.challenge.frequency_5.ValidPalin;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalinTest {

    @Test
    public void isPalindrome() {
        ValidPalin validPalin = new ValidPalin();
        String str_true = "cata,c";
        String str_false = "cattaa";
        assertTrue(validPalin.isPalindrome(str_true));
        assertFalse(validPalin.isPalindrome(str_false));
    }
}
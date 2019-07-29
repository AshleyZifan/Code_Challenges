package ca.jrvs.challenge.frequency_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void reverseWords() {
        Reverse reverse = new Reverse();
        assertEquals("blue is sky the", reverse.reverseWords("the sky is blue"));
    }
}
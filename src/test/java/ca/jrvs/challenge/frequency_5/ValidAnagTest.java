package ca.jrvs.challenge.frequency_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagTest {

    @Test
    public void isAnagram(){
        ValidAnag validAnag = new ValidAnag();
        String str_1 = "edcba";
        String str_2 = "abced";
        assertTrue(validAnag.isAnagram(str_1, str_2));
    }
}
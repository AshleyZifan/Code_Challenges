package ca.jrvs.challenge.frequency_5;

import ca.jrvs.challenge.frequency_5.DupChar;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DupCharTest {

    @Test
    public void findDup() {
        String str = "a ab bcdee  ,fgh";
        DupChar dup = new DupChar();
        List<Character> result = dup.findDup(str);

        List<Character> expect = new ArrayList<Character>();
        expect.add('a');
        expect.add('b');
        expect.add('e');

        assertNotNull(result);
        assertEquals(expect, result);

    }
}
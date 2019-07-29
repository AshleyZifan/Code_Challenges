package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class DupNumTest {

    @Test
    public void findDuplicate() {
        DupNum dup = new DupNum();
        int[] test = new int[5];
        test[0] = 1;
        test[1] = 1;
        test[2] = 2;
        test[3] = 3;
        test[4] = 4;
        int result = dup.findDuplicate(test);
        assertEquals(1,result);
    }
}
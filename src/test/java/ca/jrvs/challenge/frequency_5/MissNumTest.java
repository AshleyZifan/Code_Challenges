package ca.jrvs.challenge.frequency_5;

import ca.jrvs.challenge.frequency_5.MissNum;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissNumTest {

    @Test
    public void missingNumber() {
        MissNum missNum = new MissNum();
        int[] target = new int[4];
        target[0] = 0;
        target[1] = 3;
        target[2] = 2;
        target[3] = 4;
        assertEquals(1,missNum.missingNumber(target));
    }
}
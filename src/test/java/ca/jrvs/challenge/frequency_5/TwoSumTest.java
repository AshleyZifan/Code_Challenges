package ca.jrvs.challenge.frequency_5;

import ca.jrvs.challenge.frequency_5.TwoSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] int_list = new int[4];
        int_list[0] = 3;
        int_list[1] = 0;
        int_list[2] = 4;
        int_list[3] = 5;

        int[] expect = new int[] { 0, 2 };
        int[] result = twoSum.twoSum(int_list, 7);

        assertEquals(expect[0],result[0]);
        assertEquals(expect[1],result[1]);
    }
}
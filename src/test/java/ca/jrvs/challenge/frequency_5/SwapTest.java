package ca.jrvs.challenge.frequency_5;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapTest {

    @Test
    public void swap(){
        Swap swap = new Swap();
        int[] result = swap.swap(new int[]{1,2});
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
    }


}

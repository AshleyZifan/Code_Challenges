package ca.jrvs.challenge.frequency_4;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindIntTest {

    @Test
    public void findMax(){
        FindInt findInt = new FindInt();
        assertEquals(9,findInt.findMax(new int[]{1,3,4,2,5,2,9}) );
    }

    @Test
    public void findMin(){
        FindInt findInt = new FindInt();
        assertEquals(1,findInt.findMin(new int[]{1,3,4,2,5,2,9}) );

    }
}

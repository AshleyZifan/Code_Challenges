package ca.jrvs.challenge.frequency_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDupTest {

    @Test
    public void removeDuplicates(){
        RemoveDup removeDup = new RemoveDup();
        assertEquals(6,removeDup.removeDuplicates(new int[]{0,1,1,1,2,3,4,4,5}));

    }
}

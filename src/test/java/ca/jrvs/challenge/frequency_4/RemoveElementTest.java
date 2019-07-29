package ca.jrvs.challenge.frequency_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElement(){
        RemoveElement removeElement = new RemoveElement();
        int result = removeElement.removeElement(new int[]{0,1,2,2,3,1,4}, 2);
        assertEquals(5, result);
    }
}

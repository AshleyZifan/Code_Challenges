package ca.jrvs.challenge.frequency_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainDupTest {

    @Test
    public void containsDuplicate() {
        ContainDup containDup = new ContainDup();
        assertTrue(containDup.containsDuplicate(new int[]{1,2,3,4,4,5}));
    }
}
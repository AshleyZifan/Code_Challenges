package ca.jrvs.challenge.frequency_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountPrimeTest {

    @Test
    public void countPrimes() {
        CountPrime countPrime = new CountPrime();
        assertEquals(4,countPrime.countPrimes(10));
    }
}
package ca.jrvs.challenge.frequency_5;

import org.junit.Test;
import static org.junit.Assert.*;

public class FiboTest {

    @Test
    public void fiboTest(){
        Fibo fibo = new Fibo();
        assertEquals(34, fibo.fibo(9));
    }
}

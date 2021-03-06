package ca.jrvs.challenge.frequency_5;

public class PowerOfTwo {

    //Frequency:5
    //Given an integer, write a function to determine if it is a power of two.
    public boolean isPowerOfTwo(int n) {
        if(n == 1 || n == 2)
            return true;
        else if(n == 0 || n % 2 == 1)
            return false;
        else
        {
            return isPowerOfTwo(n/2);
        }

    }
}

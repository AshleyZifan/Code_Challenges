package ca.jrvs.challenge.frequency_5;

public class Swap {

    public int[] swap(int[] target)
    {
        int temp = target[0];
        target[0] = target[1];
        target[1] = temp;
        return target;
    }
}

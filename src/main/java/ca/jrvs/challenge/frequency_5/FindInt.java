package ca.jrvs.challenge.frequency_5;

public class FindInt {

    //Largest and smallest integer in an unsorted integer array
    public int findMax(int[] intArray){
        int max = intArray[0];

        for ( int i = 1; i < intArray.length; i++ )
        {
            if ( intArray[i] > max )
                max = intArray[i];
        }

        return max;
    }

    public int findMin(int[] intArray){
        int min = intArray[0];

        for ( int i = 1; i < intArray.length; i++ )
        {
            if ( intArray[i] < min )
                min = intArray[i];
        }

        return min;
    }

}

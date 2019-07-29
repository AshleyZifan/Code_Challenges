package ca.jrvs.challenge.frequency_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void merge() {
        MergeSort mergeSort = new MergeSort();
        int[] list_1 = new int[100];
        list_1[0] = 1;
        list_1[1] = 2;
        int[] list_2 = new int[]{3,4,5,6};
        int[] result = mergeSort.merge(list_1,2,list_2,2);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }
}
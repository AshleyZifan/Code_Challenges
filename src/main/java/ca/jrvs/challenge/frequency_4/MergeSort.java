package ca.jrvs.challenge.frequency_4;

public class MergeSort {

    //Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int sizeOfNums1 = m+n-1;
        m-=1;
        n-=1;
        while(sizeOfNums1>=0){
            if(m==-1){
                while(n>=0){
                    nums1[sizeOfNums1--]=nums2[n--];
                }
            }
            if(n==-1){
                break;
            }
            if(nums1[m]<nums2[n]){
                nums1[sizeOfNums1--]=nums2[n--];
            }
            else{
                nums1[sizeOfNums1--]=nums1[m--];
            }
        }
        return nums1;
    }
}

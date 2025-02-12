package com.LeetCode;

public class FindThePeak_MountainArray_162 {

    public static int findPeakElement(int[] arr) {
        int start=0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(arr[mid] > arr[mid+1]){ //Descending order,also this may be the answer, but we should also look in left part of the array
                end = mid;
            }else{                  //Ascending (mid < mid+1)
                start = mid+1;
            }
        }
//in the end start == end & pointing to the largest number because of the above 2 conditions
//start & end to find max element so when they both pointing at 1 element meaning it is the largest element
        return start;  //or end (as both are pointing to same element at end)
    }

    public static void main(String[] args) {
        int[] arr = {0,2,4,5,7,9,1,0};

        System.out.println(findPeakElement(arr));
    }
}
//Same as Peak Index in a Mountain Array Problem : LeetCode = 852
package com.LeetCode;

public class PeakIndexInaMountainArray_852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

             if(arr[mid] > arr[mid+1]){ //Descending order,also may be the answer but we should also look in left part of the array
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
        int[] arr1 = {0,1,0};
        int[] arr2 = {0,2,4,5,7,9,1,0};

        System.out.println(peakIndexInMountainArray(arr1));    //1   (index)
        System.out.println(peakIndexInMountainArray(arr2));    //5   (index)
    }
}
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//Same problem as Find the Peak problem : LeetCode = 162.

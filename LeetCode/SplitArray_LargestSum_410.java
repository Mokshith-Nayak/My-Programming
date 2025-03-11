package com.LeetCode;

public class SplitArray_LargestSum_410 {

    public static int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {     //Linear Search
            start = Math.max(start, nums[i]);  //At the end of loop contain the max from the array
            end += nums[i];
        }

        //Binary Search on potential answer
        while(start < end){
            //try for the middle as potential answer
            int mid = start + (end - start)/2;

            //calculate how many pieces you can divide this with max sum
            int sum=0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){    //we cannot add this sub-array when exceeds mid, so make new one
                    //so, add num in new sub-array, then sum = num
                    sum = num;
                    pieces++;
                }else{                  //else keep adding to get answer
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end; // here start == end
    }

    public static void main(String[] args) {

//        int[] nums1 = {7,2,5,10,8};
//        int k1 = 2;         //Pieces
//        System.out.println(splitArray(nums1, k1));  //18
//
//        int[] nums2 = {1,2,3,4,5};
//        int k2 = 2;         //Pieces
//        System.out.println(splitArray(nums2, k2));  //9

        int[] nums3 = {1,3,4,2,5,9,7,8};
        int k3 = 2;         //Pieces
        System.out.println(splitArray(nums3, k3));  //24

    }
}

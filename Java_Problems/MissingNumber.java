package com.Java_Problems;

//LeetCode-268
class MissingNumber {

     public int sum(int[] nums){
         int sum = 0;
         for(int i=0; i<nums.length; i++){
             sum += nums[i];
         }
         return sum;
     }
     public int missingNumber(int[] nums) {
         int n = nums.length;
         int sum1 = n*(n+1)/2 ;
         int sum2 = sum(nums);
         return sum1 - sum2;
     }

}
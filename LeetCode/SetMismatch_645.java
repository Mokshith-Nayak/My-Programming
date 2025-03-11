package com.LeetCode;

import java.util.Arrays;

public class SetMismatch_645 {

    public static int[] findErrorNums(int[] nums) {

        int i=0;
        while(i< nums.length){
            int correctIndex = nums[i]-1;

            if(nums[i] != nums[correctIndex]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        //For Missing & Duplicate number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main() {

        int[] arr1 = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr1)));   //[2, 3]
    }
}



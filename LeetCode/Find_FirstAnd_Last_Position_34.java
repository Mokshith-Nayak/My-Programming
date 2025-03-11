package com.LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Find_FirstAnd_Last_Position_34 {
    public static int[] findFirst_Last_Element(int[] nums,int target){

        int[] ans = {-1,-1};
        // Get first and last occurrence of target using binary search
        int start = searchRange(nums, target, true);
        int end = searchRange(nums, target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    public static int searchRange(int[] nums,int target, boolean findStartIndex){
        int ans = -1;
        //Check for 1st occurrence if target is first
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid+1;                             //Move right
            } else if (target < nums[mid]) {
                end = mid-1;                               //Move left
            } else {
                ans=mid;                //Potential answer found
                if(findStartIndex){
                    end = mid-1;        //Continue searching left
                }else{
                    start=mid+1;        //Continue searching right
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(findFirst_Last_Element(nums, target)));  //[3, 4]
    }
}


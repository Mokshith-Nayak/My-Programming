package com.ArrayBinarySearch;
import java.util.Arrays;
import java.util.Scanner;
public class Find1_lastPosition_LCode {
        public static int[] searchRange(int[] nums, int target) {
            int start =0;
            int end = nums.length-1;

            while(start<=end){
                int mid = start+(end-start)/2;
                if(target == nums[mid]){
                    return new int[]{start,mid};
                }else if(target > nums[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            return new int[]{-1,-1};
        }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] nums = {5,7,7,8,8,10};
        int target = scr.nextInt();
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}

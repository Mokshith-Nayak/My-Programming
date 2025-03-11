package com.LeetCode;

import java.util.Arrays;
//Optimized way
public class Find_1st_and_lastPosition_Optimized_34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = binarySearch(nums, target, true);   // Find first occurrence
        res[1] = binarySearch(nums, target, false);  // Find last occurrence
        return res;
    }

    public static int binarySearch(int[] nums, int target, boolean findFirst) {
        int start = 0, end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;  // Update index when target is found

                if (findFirst) {
                    end = mid - 1;  // Keep searching in the left half
                } else {
                    start = mid + 1;  // Keep searching in the right half
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target))); //[3,4]

    }
}

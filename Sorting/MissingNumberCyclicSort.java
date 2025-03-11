package com.Sorting;

public class MissingNumberCyclicSort {
    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i]; // Correct index for nums[i]
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                // Swap nums[i] with nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        // Find the missing number
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i; // Missing number found
            }
        }
        return nums.length; // If no missing number is found, return n
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1}; // Example input
        System.out.println(missingNumber(nums)); // Output: 2
    }
}

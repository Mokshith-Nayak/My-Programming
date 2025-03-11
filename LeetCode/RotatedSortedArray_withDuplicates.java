package com.LeetCode;

public class RotatedSortedArray_withDuplicates {

    public static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return mid;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //Checks for both normal Rotated sorted array & with duplicates
    public static int findPivotWithDuplicates(int[] arr){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // Check if mid-element is the pivot
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            // Skip duplicates
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                // Check if we are at the pivot by comparing start with start+1
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++; // Skip duplicate element at start

                // Check if end is the pivot by comparing end with end-1
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--; // Skip duplicate element at end
            }
            // Normal case, search in sorted part
            else if(arr[start] <= arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // No pivot found, array is not rotated
    }

    public static int search(int[] nums, int target){
        int pivot = findPivotWithDuplicates(nums);
        // If pivot not found, the array is not rotated, just do binary search
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // If pivot found, check both sub-arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 6, 7, 0, 1, 1, 2};
        int target1 = 0;
        System.out.println("Pivot i: " + findPivotWithDuplicates(nums1)); // 3
        System.out.println("Target i: " + search(nums1, target1)); // 4

        int[] nums2 = {3, 4, 5, 5, 6, 7, 7, 8, 9, 0, 1, 2};
        int target2 = 6;
        System.out.println("Pivot i: " + findPivotWithDuplicates(nums2)); // 6
        System.out.println("Target i: " + search(nums2, target2)); // 3
    }
}

package com.LeetCode;

public class RotatedSortedArray_Count {
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

    public static int findPivot(int[] arr){

        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            // Ensure mid+1 within bounds(m<e) before checking since we return m & array in desc
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            // Ensure mid-1 within bounds(m>s) before checking since we return m-1 & array in asc
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // Move towards the unsorted part OR To get Larger element
            if(arr[mid] <= arr[start]){ //To ignore 2nd half(after mid) elements smaller than start/mid
                end = mid-1;
            }else{                      //else ignore 1st half(before mid) elements smaller than mid
                start = mid+1;
            }
        }
        return -1;
    }

    public static int countRotation(int[] nums){
        int count = findPivot(nums);

        return count+1;
    }

    public static int countRotation_withDuplicate(int[] nums){
        int count = findPivotWithDuplicates(nums);

        return count+1;
    }



    public static void main(String[] args) {

        //1. Count Rotation in Sorted Array.
        int[] nums1 = {4,5,6,7,0,1,2};
        System.out.println("count: "+countRotation(nums1)+"\n");     //4

        int[] nums2 = {3,4,5,6,7,8,9,0,1,2};
        System.out.println("count: "+countRotation(nums2)+"\n");     //7

        int[] nums3 = {1,2,3,4,5};
        System.out.println("count: "+countRotation(nums3)+"\n");     //0 (Not Rotated)

        //2. Count Rotation in Sorted Array with Duplicate elements.
        int[] nums4 = {2,3,4,4,5,0,1,2};
        System.out.println("count: "+countRotation_withDuplicate(nums4)+"\n");     //5 (with Duplicates)

        int[] nums5 = {9,10,11,15,15,19,19,19,23,27,31,0,1 ,3,5};
        System.out.println("count: "+countRotation_withDuplicate(nums5));     //11 (with Duplicates)

        //Count of rotation of array is always, pivot + 1.

    }
}

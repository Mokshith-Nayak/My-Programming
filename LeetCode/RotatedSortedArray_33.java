package com.LeetCode;

public class RotatedSortedArray_33 {

    public static int binarySearch(int[] nums, int target, int start, int end){

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
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

    public static int search(int[] nums, int target){

        int pivot = findPivot(nums);
        //If pivot not found : The array is not rotated.
        if(pivot == -1){    //Do binary_search
        return binarySearch(nums, target, 0, nums.length-1);
        }
        //If pivot found, we have 2 ascending sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){      //search in left half of array (0 to pivot - 1).
            return binarySearch(nums, target, 0, pivot-1);
        }
        //Otherwise, search in right half of array (pivot + 1 to nums.length - 1).
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        System.out.println("Pivot index: "+findPivot(nums1));   //3
        System.out.println(search(nums1, target1));     //4

        int[] nums2 = {3,4,5,6,7,8,9,0,1,2};
        int target2 = 6;
        System.out.println("Pivot index: "+findPivot(nums2));   //6
        System.out.println(search(nums2, target2));     //3

    }
}

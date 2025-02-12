package com.ArrayBinarySearch;

import java.util.Scanner;

public class B_Search_Asc_Desc {
    public static int orderAgnostic_BinarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[] arr1 = {-99,-86, -67,-32,-5,1, 3, 5, 7, 12, 56, 67, 75, 88, 99, 103, 150};  //Ascending
        int[] arr2 = {105,103,99,88,75,67,56,12,7,5,3,1,-5,-32,-67,-86,-99};  //Descending

        int target = scr.nextInt();
        System.out.println(orderAgnostic_BinarySearch(arr1,target));  //For Ascending
        System.out.println(orderAgnostic_BinarySearch(arr2,target));    //For Descending
    }
}

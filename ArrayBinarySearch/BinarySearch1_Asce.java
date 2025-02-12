package com.ArrayBinarySearch;

import java.util.Scanner;

public class BinarySearch1_Asce {

    public static int binarySearchAsce(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {-99,-86, -67,-32,-5,1, 3, 5, 7, 12, 56, 67, 75, 88, 99, 103, 150};
        int target = scanner.nextInt();
        System.out.println(binarySearchAsce(arr,target));
    }
}

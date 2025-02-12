package com.ArrayBinarySearch;

import java.util.Scanner;

public class BinarySearch_Desc {

    public static int binarySearchAsce(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(target<arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {105,103,99,88,75,67,56,12,7,5,3,1,-5,-32,-67,-86,-99};
        int target = scanner.nextInt();
        System.out.println(binarySearchAsce(arr,target));
    }
}


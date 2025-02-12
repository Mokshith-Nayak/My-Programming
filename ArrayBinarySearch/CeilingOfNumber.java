package com.ArrayBinarySearch;

import java.util.Scanner;

public class CeilingOfNumber {
    public static int ceilingOfNumber(int[] arr,int target){

        int start = 0;
        int mid=0;
        int end = arr.length-1;

        while(start<=end){
            mid = start+(end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(start < arr.length){
            return arr[start];   //OR return arr[end]; for Floor of a number.
        }                       //OR return start or end for Indexes of respective number.
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        int target = scanner.nextInt();
        System.out.println(ceilingOfNumber(arr,target));
    }
}

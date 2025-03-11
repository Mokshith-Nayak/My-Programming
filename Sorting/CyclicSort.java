package com.Sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void cyclicSort(int[] arr) {

        int i=0;
        while(i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[correctIndex] != arr[i]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
Cyclic Sort is an efficient in-place sorting algorithm
used for sorting numbers in a given range **(e.g., 1 to N).
It works by placing each number at its correct index by swapping
until all positive elements are in their correct positions.
 */

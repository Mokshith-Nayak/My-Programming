package com.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0 ; j-- ) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {-8, 13, 64, -63, 25, 1, 12, 22, 11};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

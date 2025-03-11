package com.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swap with correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0, last);

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {-55, 13, 64, 25,-8, 12, 22, 11};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

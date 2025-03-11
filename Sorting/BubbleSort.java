package com.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){

        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //Swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //If you didn't swap for a particular value of i, meaning array if sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, -5, 8, 1, 2, -6, -9, 31};
       bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

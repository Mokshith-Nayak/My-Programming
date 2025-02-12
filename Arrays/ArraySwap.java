package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {

    public static void swap(int[] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }
 public static int maxArray(int[] arr){
     int max = arr[0]; //max = Integer.MIN_VALUE;, int i=0;.
     for (int i = 1; i < arr.length ; i++) {
         if(arr[i]>max){
             max=arr[i];
         }
       }
    return max;
    }

 public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();
        }
//        int index1 = scanner.nextInt();
//        int index2 = scanner.nextInt();
//        swap(arr,index1,index2);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(maxArray(arr));

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}

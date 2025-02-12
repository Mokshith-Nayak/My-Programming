package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Basic_Problems {

    //1.
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    //2
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static int sumOfArray(int[]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int productOfArray(int[] arr){
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }
     public static void sumOf(int[] arr){

          int sum = sumOfArray(arr);
          int max = max(arr);
          int min = min(arr);

        System.out.println(sum-min);
        System.out.println(sum-max);
    }
    public static int[] productOf(int[] arr){
        int[] result = new int[arr.length]; //arr.length = n.

        for (int i = 0; i < arr.length; i++) {
            result[i] = productOfArray(arr)/arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        sumOf(arr);
        System.out.println(Arrays.toString(productOf(arr)));
    }
}

package com.Arrays;

import java.util.Scanner;

public class Array_Sum_Traversal {
    public static void halfArrayInverse(int[]arr) {
        for (int i = arr.length-1; i >=arr.length/2 ; i--) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void secondHalfArray(int arr[]) {
        for (int i = arr.length/2; i <arr.length ; i++) {
                System.out.print(arr[i]+" ");

        }
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        System.out.println(Arrays.toString(arr)); //Without loop to print an Array.

//        System.out.println(Integer.MAX_VALUE);

//        halfArrayInverse(arr);  //1.
//        secondHalfArray(arr);   //2.
//
//        System.out.print(sumOfArray(arr));  //3.
//        System.out.print(productOfArray(arr));
    }
}

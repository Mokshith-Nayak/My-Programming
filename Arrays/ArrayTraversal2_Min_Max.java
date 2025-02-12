package com.Arrays;

import java.util.Scanner;

public class ArrayTraversal2_Min_Max {
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
    //3.
    public static int indexOfLargestElement(int[] arr){
        int max = Integer.MIN_VALUE;   //OR int max=a[0];

        int index = 0;
        for (int i = 0; i < arr.length ; i++) {

            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
    //4.
    public static int repeatedElement(int[] arr,int k){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                count++;
            }
        }
        return count;
    }
    //5.
    public static int largestRepeatedElement(int[] arr){

        int max = max(arr);
        int count = repeatedElement(arr,max);
        return count;
    }
    //6.
    public static int indexOfK(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
//        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }

//        System.out.println(max(arr));
        System.out.println(min(arr));
//        System.out.println(indexOfLargestElement(arr));

//        System.out.println(repeatedElement(arr, k));    //OR countOccurrence

//        System.out.println(largestRepeatedElement(arr));

//        System.out.println(indexOfK(arr,k));
    }
}

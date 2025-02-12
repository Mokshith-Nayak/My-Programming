package com.Arrays;

import java.util.Scanner;

public class Array_2ndLargest_2ndSmallest {

    public static int secondLargestArray(int[] arr){

        int p=Integer.MIN_VALUE;
        int vp=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>p)
            {
              vp=p;   // Update second largest
              p=arr[i];   // Update largest
            }
            else if (arr[i]>vp && arr[i] != p)
            {
              vp=arr[i];  // Update second largest
            }
        }
        return vp;
}
 public static int secondSmallestArray(int[] arr){

        int p=Integer.MAX_VALUE;
        int vp=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<p)
            {
              vp=p;   // Update second largest
              p=arr[i];   // Update largest
            }
            else if (arr[i]<vp && arr[i] != p)
            {
              vp=arr[i];  // Update second largest
            }
        }
        return vp;
}

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        System.out.println(secondLargestArray(arr));
        System.out.println(secondSmallestArray(arr));
    }
}

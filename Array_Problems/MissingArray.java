package com.Array_Problems;

import java.util.Scanner;

public class MissingArray {
    public  static  int sumArray(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;

    }

    public static int missingArray(int[] arr){

        int n = arr.length+1;
        int sum1 = n*(n+1)/2;
        int sum2 = sumArray(arr);
        int sum = sum1-sum2;
      return sum;
    }
    /*
    We use n = arr.length + 1 because:
    The array is missing one number, so we need to account for that by adding 1 to the length.
    arr.length gives the size of the array, but we need the total count of natural numbers (including the missing one).
    * */
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
//        sumArray(arr);
        System.out.println(missingArray(arr));

    }
}

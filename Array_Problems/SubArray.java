package com.Array_Problems;

import java.util.Scanner;

public class SubArray {

   public static void subArray1(int[] arr,int size){

       for (int i = 0; i <= arr.length-size; i++) {
           for(int j=i; j<i+size; j++){
               System.out.print(arr[j]+" ");
           }
           System.out.println();

       }
   }
 public static void sumSubArray1(int[] arr,int size){

     for (int i = 0; i <= arr.length-size; i++) {
         int sum=0;
         for(int j=i; j<i+size; j++){
             sum+=arr[j];
         }
         System.out.println(sum);

     }
   }
public static int countSumSubArrayEqualsK(int[] arr, int size, int k){
     int count =0;
     for (int i = 0; i <= arr.length-size; i++) {
         int sum=0;
         for(int j=i; j<i+size; j++){
             sum+=arr[j];
         }
         if(sum == k){
             count++;
         }
     }
    return count;
   }
public static void printSumSubArrayEqualsK(int[] arr, int size, int k){

     for (int i = 0; i <= arr.length-size; i++) {
         int sum=0;
         for(int j=i; j<i+size; j++){
             sum+=arr[j];
         }
         if(sum == k){
             for(int j=i; j<i+size; j++){
                 System.out.print(arr[j]+" ");
             }
             System.out.println();
         }
     }
   }

public static void printSAllSubArray(int[] arr){

    for (int i = 1; i <= arr.length; i++) {
        subArray1(arr,i);
    }
   }
    public static void sumSubArray(int[] arr){
        int sum =0, count=0;

        for (int size = 1; size <= arr.length; size++) {
            for (int i = 0; i <= arr.length-size; i++) {
                sum=0;
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }
                System.out.println(sum);
            }
        }
    }
    public static void sumSubArrayEqualsK(int[] arr,int k){
      int sum =0;

        for (int size = 1; size <= arr.length; size++) {
            for (int i = 0; i <= arr.length-size; i++) {
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }
                if (sum == k) {
                    for (int j = i; j < i+size; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
                sum = 0;
            }
        }
    }
  public static void longsumSubArrayEqualsK(int[] arr,int k){
      int sum =0;

        for (int size = arr.length; size >=1; size--) {
            for (int i = 0; i <= arr.length-size; i++) {
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }
                if (sum == k) {
                    for (int j = i; j < i+size; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    return;
                }
                sum = 0;
            }
        }
    }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] arr = new int[n];
       for (int i = 0; i < arr.length; i++) {
           arr[i]= scanner.nextInt();
       }
//       int size = scanner.nextInt();
//
//       subArray1(arr,size);

//       sumSubArray1(arr,size);

       int k = scanner.nextInt();
//       System.out.println(countSumSubArrayEqualsK(arr,size,k));
//       printSumSubArrayEqualsK(arr,size,k);

//       printSAllSubArray(arr);

//       int sum = scanner.nextInt();
//       sumSubArray(arr);
//       sumSubArrayEqualsK(arr,k);
       longsumSubArrayEqualsK(arr,k);

    }
}

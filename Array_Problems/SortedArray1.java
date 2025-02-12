package com.Array_Problems;

import java.util.Scanner;

public class SortedArray1 {

    public static void occurrence(int[] arr){
        int count = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                count++;
            }else{
                System.out.println(arr[i]+" - "+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+" - "+count);
    }
    public static void everyPresentElements(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(arr[arr.length-1]);
    }
    public static void uniqueElements(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    System.out.println(arr[i]);
                  }
                count = 1;
            }
        }
        if (count == 1) {
            System.out.println(arr[arr.length - 1]);
        }
    }
    public static int countUniqueElements(int[] arr) {
        int count = 1;
        int uniqueCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    uniqueCount++;
//                    System.out.println(arr[i]);
                }
                count = 1;
            }
        }
        if (count == 1) {
            uniqueCount++;
//            System.out.println(arr[arr.length - 1]);
        }
        return uniqueCount;
    }
    public static int largestRepeating(int[] arr) {

//        for (int i = arr.length - 2; i >= 0; i--) {
//            if(arr[i] == arr[i+1]){
//                return arr[i];
//            }
//        }
//        return -1;
//    }
//    OR
    for (int i = arr.length - 1; i >= 1; i--) {
            if(arr[i] == arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void findRepeatingOddElement(int[] arr1, int[] arr2) {
        boolean found = false;
        int i = 0, j = 0;

        // Loop through both arrays using two pointers
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j] && arr1[i] % 2 != 0) {  // Check for common odd elements
                System.out.print(arr1[i] + " ");
                found = true;
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // If no common odd elements found
        if (!found) {
            System.out.println("No common odd elements found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        occurrence(arr);
//        everyPresentElements(arr);
//        uniqueElements(arr);
//        System.out.println(countUniqueElements(arr));
//        System.out.println(largestRepeating(arr));


    }
}

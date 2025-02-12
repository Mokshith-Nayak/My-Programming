package com.Array_Problems;

import java.util.Scanner;

public class MultipleSortedArray1 {

    public static void repeatedElements(int[] arr1,int[] arr2){
        int i=0,j=0;
        while(i< arr1.length && j< arr2.length)
        {
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }else{
                i++;
            }
        }
    }
    public static void nonRepeatedElements(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i]+" "); // Print non-repeated element from arr1
                i++; // Move to the next element in arr1
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j]+" "); // Print non-repeated element from arr2
                j++; // Move to the next element in arr2
            } else {
                // Skip common elements
                i++;
                j++;
            }
        }

        // Print remaining elements in arr1 that are non-repeated
        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i-1]) { // Check for duplicates within arr1
                System.out.println(arr1[i]);
            }
            i++;
        }

        // Print remaining elements in arr2 that are non-repeated
        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j-1]) { // Check for duplicates within arr2
                System.out.println(arr2[j]);
            }
            j++;
        }
    }

    public static void repeatedElementsDescending(int[] arr1,int[] arr2){
        int i= arr1.length-1, j= arr2.length-1;
        while(i>=0 && j>=0)
        {
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i--;
                j--;
            }
            else if(arr1[i]>arr2[j]){
                j--;
            }else{
                i--;
            }
        }
    }
    public static void repeatedElementsDesc_Asce(int[] arr1,int[] arr2){
        int i= 0, j= arr2.length-1;
        while(i< arr1.length && j>=0)
        {
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j--;
            }
            else if(arr1[i]>arr2[j]){
                j--;
            }else{
                i++;
            }
        }
    }
     public static void mergeArray(int[] arr1,int[] arr2){

        int[] res = new int[arr1.length+ arr2.length];
        int i=0,j=0,k=0;
        while(i< arr1.length && j< arr2.length){
            if(arr2[j]<=arr1[i]){
                res[k]=arr2[j];
                k++;
                j++;
            }
            else{
                res[k]=arr1[i];
                k++;
                i++;
            }
        }
        while(j< arr2.length){
            res[k]=arr2[j];
            k++;
            j++;
        }
        while(i< arr2.length){
            res[k]=arr2[i];
            k++;
            j++;
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= scanner.nextInt();
        }

//        repeatedElements(arr1, arr2);
        nonRepeatedElements(arr1, arr2);
//        repeatedElementsDescending(arr1, arr2);
//        repeatedElementsDesc_Asce(arr1, arr2);
//        mergeArray(arr1, arr2);


    }
}

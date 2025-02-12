package com.Array_Problems;

public class Merge3Array_Unsorted_forLoop {

    public static int[] arrayMerge(int[] arr1, int[] arr2, int[] arr3) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;

        // Create a new array to hold both arrays
        int[] res = new int[n1 + n2 + n3];

        // Copy elements from the first array
        for (int i = 0; i < n1; i++) {
            res[i] = arr1[i];
        }

        // Copy elements from the second array
        for (int j = 0; j < n2; j++) {
            res[n1 + j] = arr2[j];
        }
         // Copy elements from the third array
        for (int k = 0; k < n3; k++) {
            res[n1 + n2 +  k] = arr3[k];
        }
        // Return the merged array
        return res;
    }
    public static void printArray(int[] arr) {
        System.out.print("Merged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample Input 1
        int[] arr1 = {5, 2};
        int[] arr2 = {1, 5, 2};
        int[] arr3 = {3, 2, 5, 4};

        // Merge arrays and print the result
        int[] res = arrayMerge(arr1, arr2, arr3);
        printArray(res);
    }

}

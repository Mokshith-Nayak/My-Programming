package com.Sorting;

import java.util.Arrays;

public class SelectionSortExample {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop through all elements
        for (int i = 0; i < n - 1; i++) {
            // Assume the first unsorted element is the minimum
            int minIndex = i;

            // Find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

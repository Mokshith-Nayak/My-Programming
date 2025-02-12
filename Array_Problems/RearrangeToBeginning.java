package com.Array_Problems;

import java.util.Arrays;

public class RearrangeToBeginning {
    //1. Best Way
    public static void rearrangeMain(int[] arr) {

        int negativeIndex = 0; // Pointer to place the next negative number

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {			 // Swap arr[i] with arr[negativeIndex]
                int temp = arr[i];
                arr[i] = arr[negativeIndex];
                arr[negativeIndex] = temp;
                negativeIndex++;
            }							 // Now all negative numbers are at the start in the original order,
        }								 // and positive numbers remain in their original order.
    }
    //2. Better Way
    public static void rearrangeSecondBest(int[] arr) {
        int i=arr.length-1;
        int j=arr.length-1;
        while(i>=0) {
            if(arr[i] == -1) {
                i--;
            }
            else {
                arr[j] = arr[i];
                i--;
                j--;
            }
        }
        while(j>=0) {
            arr[j] = -1;
            j--;
        }
    }
    //3.Good Way
    public static int[] rearrange(int[] arr) {
        int index=0;
        int[] res = new int[arr.length];
        for(int i=0; i<arr.length; i++) {

            if(arr[i] <0) {
                res[index]=arr[i];
                index++;
            }
        }
        for(int i=0; i<arr.length; i++) {

            if(arr[i] >0) {
                res[index]=arr[i];
                index++;
            }
        }
        return res;
    }


    public static void main(String[] args) {

        int[] arr1 = {5, -1, 3, -1, 4, 5, 3, -1, 8, 2};        // For -1's at the Beginning

        		rearrangeMain(arr1);
        		for(int i=0; i<arr1.length; i++) {
        			System.out.print(arr1[i]+" ");
        		}
        		System.out.println();
        		//2
        		rearrangeSecondBest(arr1);
        		for(int i=0; i<arr1.length; i++) {
        			System.out.print(arr1[i]+" ");
        		}
        		System.out.println();
        		//3
        		System.out.println(Arrays.toString(rearrange(arr1)));
    }
}

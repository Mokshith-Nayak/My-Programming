package com.Array_Problems;

import java.util.Arrays;

public class RearrangeToEnd {
    //1.Best Way
    public static void rearrangeMain2(int[] arr) {

        int zeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                int temp = arr[zeroIndex];
                arr[zeroIndex] = arr[i];
                arr[i] = temp;
                zeroIndex++;
            }
        }
    }
    //2.Better Way
    public static void rearrange2ndForZero(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                i++;
            } else {
                arr[j] = arr[i];
                i++;
                j++;
            }
        }
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }
    //3.Good Way
    public static int[] rearrangeAtEnd(int[] arr) {

        int index = 0;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                res[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= 0) {
                res[index] = arr[i];
                index++;
            }
        }
        return res;
    }


    public static void main(String[] args) {

        int[] arr2 = {3, 7, 0, 4, 0, 6, 0, 8, 0, 3};        // For 0's at the End

        //For zero's at the End
        rearrangeMain2(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        rearrange2ndForZero(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(rearrangeAtEnd(arr2)));
    }
}
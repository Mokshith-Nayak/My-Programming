package com.ArrayLinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2 {

    public  static int[] search2DArray(int[][] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n1 = scanner.nextInt();

        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
//        int[][] arr = new int[n1][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//        arr[2] = new int[4];
//        arr[3] = new int[2];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
////                System.out.print("Enter value for arr[" + i + "][" + j + "]: ");
//                arr[i][j]= scanner.nextInt();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        int target = scanner.nextInt();
        int[] result = search2DArray(arr,target);
        System.out.println(Arrays.toString(result));

    }
}

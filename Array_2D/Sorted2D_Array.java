package com.Array_2D;

import java.util.Arrays;

public class Sorted2D_Array {


    //For Sorted in row, columns and diagonally
    public static int[] targetSearch(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }else if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    //For Sorted in row, columns and diagonally : simple Linear_Search(Inefficient)
    public static int[] target_linearSearch_2D(int[][] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == target){
                return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }




    public static void main(String[] args) {
        int[][] matrix1 = {{10,20,30,40},
                          {15,25,35,45},
                          {28,29,37,49},
                          {33,34,38,50}};

        System.out.println(Arrays.toString(target_linearSearch_2D(matrix1,50)));
        System.out.println(Arrays.toString(targetSearch(matrix1,37)));

    }
}

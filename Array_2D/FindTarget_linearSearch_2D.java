package com.Array_2D;

import java.util.Arrays;

public class FindTarget_linearSearch_2D {

    public static int[] findTarget(int[][] arr, int target) {

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
        int[][] arr1 = {{18,9,12},
                        {36,-4,91},
                        {44,33,16}};

        System.out.println(Arrays.toString(findTarget(arr1,33)));   //[2,1]
        System.out.println(Arrays.toString(findTarget(arr1,-4)));   //[1,1]
    }
}

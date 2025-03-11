package com.LeetCode;

import java.util.Arrays;

class FlipAnImage_832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        for (int i = 0; i < rows; i++) {
            // Flip and invert at the same time
            for (int j = 0; j < (cols + 1) / 2; j++) {
                // Swap and invert
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][cols - 1 - j] ^ 1;
                image[i][cols - 1 - j] = temp;
            }
        }

        return image;
    }

    // Helper method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] image1 = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] image2 = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        System.out.println("Flipped & Inverted Image 1:");
        printMatrix(flipAndInvertImage(image1));

        System.out.println("Flipped & Inverted Image 2:");
        printMatrix(flipAndInvertImage(image2));
    }
}

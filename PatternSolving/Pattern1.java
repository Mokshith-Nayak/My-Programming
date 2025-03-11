package com.PatternSolving;

import java.util.Scanner;

public class Pattern1 {

    public static void squarePattern(int n) {
        System.out.println("\nSQUARE");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightAngleTriangle(int n) {
        System.out.println("\nLEFT ANGLE TRIANGLE");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void inverse_rightAngleTriangle(int n) {
        System.out.println("\nINVERSE LEFT ANGLE TRIANGLE");
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {  //j <= n-i+1 : for without Decrement
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightAngleTriangle_numbers(int n) {
        System.out.println("\nLEFT ANGLE TRIANGLE NUMBERS");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void leftAngleTriangle(int n) {
        System.out.println("\nRIGHT ANGLE TRIANGLE");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pyramid(int n) {
        System.out.println("\nPYRAMID");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void inversePyramid(int n) {
        System.out.println("\nINVERSE PYRAMID");
        for (int i = n; i >=1; i--) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = 5;

    squarePattern(n);
    rightAngleTriangle(n);
    inverse_rightAngleTriangle(n);
    rightAngleTriangle_numbers(n);
    leftAngleTriangle(n);
    pyramid(n);
    inversePyramid(n);


    }
}

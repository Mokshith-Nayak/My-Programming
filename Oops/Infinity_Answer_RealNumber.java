package com.Oops;

import java.util.Scanner;

public class Infinity_Answer_RealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Numerator: ");
        float a = scanner.nextFloat();
        System.out.print("Enter the Denominator: ");
        float b = scanner.nextFloat();
        float c = a/b;
        System.out.println(c);          //Infinity
    }
}

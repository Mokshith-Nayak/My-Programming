package com.Prime;

import java.util.Scanner;

class Prime1 {

    public static void readFactor() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scr.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int countFactor() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scr.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
public class Factors {
    public static void main(String[] args)
    {
        System.out.println(Prime1.countFactor());
        Prime1.readFactor();

    }
}

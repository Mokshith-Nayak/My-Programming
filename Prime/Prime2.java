package com.Prime;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scr.nextInt();

        primeNumbersUpTo(num);
    }

    public static void primeNumbersUpTo(int num) {
        if (num < 2) {
            System.out.println("No prime numbers less than or equal to " + num);
            return;
        }

        System.out.println("com.Factors.Factors numbers up to " + num + ":");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a new line after listing primes
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

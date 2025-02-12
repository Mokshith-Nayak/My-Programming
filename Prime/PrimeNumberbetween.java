package com.Prime;

import java.util.Scanner;

public class PrimeNumberbetween {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = scr.nextInt();
        System.out.print("Enter a number: ");
        int n2 = scr.nextInt();

        primeNumberBetween(n1,n2);
    }

    public static void primeNumberBetween(int n1,int n2) {
        if (n1 < 2 || n2<2) {
            System.out.println("No prime numbers less than or equal to " + n1+ "and"+n2);
            return;
        }

        System.out.println("com.Factors.Factors numbers between "+n1 +" and "+ n2 + ":");
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a new line after listing primes
    }

    public static boolean isPrime(int n) {
//        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

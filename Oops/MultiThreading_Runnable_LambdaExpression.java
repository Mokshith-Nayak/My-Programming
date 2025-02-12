package com.Oops;

import java.util.Scanner;

@FunctionalInterface
interface Adding1 {
    void add();
}

@FunctionalInterface
interface Characters1 {
    void printCharacters();
}

@FunctionalInterface
interface Numbers1 {
    void printNumbers();
}

public class MultiThreading_Runnable_LambdaExpression {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // Lambda for Adding1
        Adding1 addition = () -> {
            System.out.println("Adding Started");
            System.out.println("Enter the Number1:");
            int a = scr.nextInt();
            System.out.println("Enter the Number2:");
            int b = scr.nextInt();
            int c = a + b;
            System.out.println(c);
            System.out.println("Adding Completed");
        };

        // Lambda for Characters1
        Characters1 charPrinter = () -> {
            System.out.println("Printing Characters Started");
            for (int i = 65; i < 70; i++) {
                System.out.println((char) i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread was interrupted.");
                }
            }
            System.out.println("Printing Characters Completed");
        };

        // Lambda for Numbers1
        Numbers1 numPrinter = () -> {
            System.out.println("Printing Numbers Started");
            for (int i = 1; i < 11; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread was interrupted.");
                }
            }
            System.out.println("Printing Numbers Completed");
        };

        // Creating Threads
        Thread t1 = new Thread(addition::add);
        Thread t2 = new Thread(charPrinter::printCharacters);
        Thread t3 = new Thread(numPrinter::printNumbers);

        // Start Threads
        t1.start();
        t2.start();
        t3.start();

        scr.close();
    }
}

package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class ArrayList {
    public static void main(String[] args) {
        displayArray();
    }

    static void displayArray() {
        Scanner scanner = new Scanner(System.in);
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();

        System.out.println("Enter integers (type a non-integer to stop):");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        System.out.println(Arrays.toString(numbers.toArray()));
        scanner.close();
    }
}

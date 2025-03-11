package com.Java_Problems;

import java.util.Scanner;

public class SumOfDigits {
    // com.Oops.Method to calculate the sum of digits
    public static int findSumOfDigits(long num) {
        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum+=num%10;
            num/=10;
        }

//        while (num > 0) {
//            sum += num % 10; // Extract the last digit and add to sum
//            num /= 10;       // Remove the last digit
//        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter a positive integer:");
        long num = sc.nextLong();

        // Call the method and print the result
        int result = findSumOfDigits(num);
        System.out.println("Sum of digits: " + result);

        sc.close();
    }
}

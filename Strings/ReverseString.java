package com.Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println(reverseString(input));   //OR

    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray(); // Convert string to character array
        String result = ""; // Initialize an empty result string to sum all Character in decrement

        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i]; // Append each character in reverse order
        }
        return result;
    }
}

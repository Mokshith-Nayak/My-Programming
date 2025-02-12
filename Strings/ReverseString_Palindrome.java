package com.Strings;

import java.util.Scanner;

public class ReverseString_Palindrome {

    public static String reversedString1(String s) {

        String r = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    public static String palindrome(String a) {
        int i=0;
        int j= a.length()-1;

        while( i <= j)
            if(a.charAt(i) == a.charAt(j)){
                i++;
                j--;
            }else{
                return "Not Palindrome";
            }
        return "Palindrome";
    }

    public static String reversedString2(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));  // Append each character to the StringBuilder
        }
        return result.toString();  // Convert StringBuilder to String
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversed1 = reversedString1(input);
        System.out.println(reversed1);

        //Palindrome 1.
        if(input.equalsIgnoreCase(reversed1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        System.out.println();

        //Palindrome 2.
        System.out.println(palindrome(input));
        System.out.println();

        System.out.println(reversedString2(input));
    }
}

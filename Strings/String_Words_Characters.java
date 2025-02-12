package com.Strings;

import java.util.Scanner;

public class String_Words_Characters {

    public static int countWords(String s) {
        int countWords=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                countWords++;
            }
        }
        return s.charAt(0) == ' ' ? countWords : countWords+1;
    }

    public static String[] print_Words(String s) {

        String [] arr = new String[countWords(s)];
        //countWords(s), will make sure that the length of the String Array depends on no. of words in Array
        String t = "";
        int j=0;
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) != ' '){
                t+=s.charAt(i);
            }else if(!t.isEmpty())  //OR (t.length() > 0)
            {
                arr[j] = t;
                j++;
                t="";
            }
        }
        arr[j]= t;
        return arr;
    }

    public static void print_Unique_Char(String s) {
        String t = "";  // String to store unique characters

        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;  // Flag to check if the character is unique

            // Check if the character has already been encountered
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    isUnique = false;  // Character is not unique
                    break;  // Exit inner loop as we found a duplicate
                }
            }

            // If the character is unique, add it to the uniqueChars string
            if (isUnique) {
                t += s.charAt(i);
            }
        }
        System.out.println(t);
    }

    public static void uniqueCharacter_frequency_count(String s) {
        String t = "";  // String to store unique characters

        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;  // Flag to check if the character is unique

            // Check if the character has already been encountered
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    isUnique = false;  // Character is not unique
                    break;
                }
            }
            // If the character is unique, add it to the uniqueChars string
            if (isUnique) {
                t += s.charAt(i);
            }
        }
        // Now, we need to count the occurrences of each unique character
        String result = "";
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            int count = 0;
            // Count the occurrences of the current unique character
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            result += ch + "" + count;
        }
        System.out.println(result);
    }



    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();
//        System.out.println(Arrays.toString(s.split(" ")));

        System.out.println(countWords(s));

        String[] res = print_Words(s);
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        print_Unique_Char("mississippi");
        uniqueCharacter_frequency_count("mississippi");

    }
}

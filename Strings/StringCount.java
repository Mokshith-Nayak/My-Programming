package com.Strings;

import java.util.Scanner;

public class StringCount {

    public static int countSpaceInString(String input){

        int spaceCount = 0;
//        String empty = " ";
        for (int i = 0; i < input.length(); i++) {
//            if(input.charAt(i) == empty.charAt(0)){   //Other Possibility
            if(input.charAt(i) == ' '){
                spaceCount++;
            }
        }
        return spaceCount;
    }
    public static int countWordsInString(String input){
        if(input.trim().length() == 0){
            System.out.println("Invalid");
            return 0;
        }
        int wordCount = 0;
        for (int i = 0; i < input.length()-1; i++) {
            if(input.charAt(i)==' ' && input.charAt(i+1) != ' '){
                wordCount++;
            }
        }
        return (input.charAt(0)==' ')? wordCount: wordCount+1;
    }

    public static int countVowelsInString(String s){

        int vowelsCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' ||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
    //Without inbuilt for UpperCase (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static int countConsonantsInString(String s) {
        int consonantsCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Only count alphabetic characters (A-Z, a-z)
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                 // Check if it's NOT a vowel (both lowercase and uppercase)
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {

                    consonantsCount++;
                }
            }
        }
        return consonantsCount;
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();

        System.out.println("Spaces: "+countSpaceInString(input));

        System.out.println("Words: "+countWordsInString(input));

        System.out.println("Vowels: "+countVowelsInString(input));

        System.out.println("Consonants: "+countConsonantsInString(input));

    }
}

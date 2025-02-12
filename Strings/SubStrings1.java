package com.Strings;

import java.util.Scanner;

public class SubStrings1 {

    public static void printSubString(String s, int size) {

        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < i + size; j++) {
                t += s.charAt(j);
            }
             System.out.println(t);
        }
    }

    public static String checkSubString(String s1,String s2) {
        int size = s2.length();
        for (int i = 0; i <= s1.length()-size; i++) {
                String t = "";
            for (int j = i; j < i+size; j++) {
                t += s1.charAt(j);
            }
            if(s2.equals(t)){
                return "Yes";
            }
        }
        return "No";
    }
    public static int countSubString(String s1,String s2) {//Required SubString count
        int count =0;
        int size = s2.length();
        for (int i = 0; i <= s1.length()-size; i++) {
                String t = "";
            for (int j = i; j < i+size; j++) {
                t += s1.charAt(j);
            }
            if(s2.equals(t)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String s) {

        int i=0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void printPalindromic_SubString(String s, int size) {

        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < i + size; j++) {
                t += s.charAt(j);
            }
            if(isPalindrome(t)){     //to print all not palindromic SubString, if(! isPalindrome(t))
                System.out.println(t);
            }
        }
    }
    public static String longestPalindromic_SubString(String s) {

        String longestPalindrome = "";
        for(int size =0; size<s.length(); size++) {
            for (int i = 0; i <= s.length() - size; i++) {
                String t = "";
                for (int j = i; j < i + size; j++) {
                    t += s.charAt(j);
                }
                if (isPalindrome(t) && t.length() > longestPalindrome.length()) {     //to print all not palindromic SubString, if(! isPalindrome(t))
                    longestPalindrome = t;
                }
            }
        }
        return longestPalindrome;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.
//        String s = "mississippi";
//        int size1 = 4;
//        printSubString(s, size1);

        //2.
//        String s1 = "mississippi";
//        String s2 = "i";
//        System.out.println(checkSubString(s1,s2));

        //3
//        System.out.println(countSubString(s1,s2));

        //4.
        String s = scanner.nextLine();
//        int size = scanner.nextInt();
//        printPalindromic_SubString(s,size);

        //5.
        System.out.println(longestPalindromic_SubString(s));

    }

}

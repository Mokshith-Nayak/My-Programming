package com.Strings;

import java.util.Scanner;

public class SubStrings2 {
    //1.0
    public static void printAll_Substring(String s) {

        for (int i = 1; i <= s.length() ; i++) {
            SubStrings1.printSubString(s,i);
        }
    }
    //1.1: Efficient
    public static void printAll_SubString(String s){

        for (int size = 1; size <= s.length(); size++) {
            for (int i = 0; i <= s.length()-size ; i++) {
                String t = "";
                for (int j = i; j < i+size; j++) {
                    t+=s.charAt(j);
                }
                System.out.println(t);
            }
        }
    }
    //2
    public static void printAll_SubString_Reverse(String s){

        for (int size = s.length(); size >=1; size--) {
            for (int i = 0; i <= s.length()-size ; i++) {
                String t = "";
                for (int j = i; j < i+size; j++) {
                    t+=s.charAt(j);
                }
                System.out.println(t);
            }
        }
    }
    //3
    public static void printLongest_SubString(String s){

        for (int size = s.length(); size >=1; size--) {
            for (int i = 0; i <= s.length()-size ; i++) {
                String t = "";
                for (int j = i; j < i+size; j++) {
                    t+=s.charAt(j);
                }
                System.out.println(t);
                return;
            }
            //break;
        }
    }

    public static boolean isPalindrome(String s){

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
    //4.
    public static void printAll_Palindromic_SubString(String s){

        for (int size = 1; size <= s.length(); size++) {
            for (int i = 0; i <= s.length()-size ; i++) {
                String t = "";
                for (int j = i; j < i+size; j++) {
                    t+=s.charAt(j);
                }
                if(isPalindrome(t)){
                System.out.println(t);
                }
            }
        }
    }
    //5.
     public static void printLongest_Palindromic_SubString(String s){

        for (int size = s.length(); size >= 1; size--) {
            for (int i = 0; i <= s.length()-size ; i++) {
                String t = "";
                for (int j = i; j < i+size; j++) {
                    t+=s.charAt(j);
                }
                if(isPalindrome(t)){
                System.out.println(t);
                return;
                }
            }
        }
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        //1.
//      printAll_Substring(s);
//      printAll_SubString(s);
        //2.
//        printAll_SubString_Reverse(s);
        //3.
//        printLongest_SubString(s);

//        System.out.println(isPalindrome(s));
        //4.
        printAll_Palindromic_SubString(s);
        System.out.println();
        //5.
        printLongest_Palindromic_SubString(s);

    }
}

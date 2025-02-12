package com.Strings;

import java.util.Scanner;

public class ReverseString_variations {

    public static String reverseString(String s){

        String t="";
        for(int i = s.length()-1; i >=0 ; i--) {
           t+=s.charAt(i);
        }
        return t;
    }

    public static int countWords(String s) {
        int countWords=0;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                countWords++;
            }
        }
        return s.charAt(0) == ' ' ? countWords: countWords+1;
    }
    public static String[] printWords_Split(String s) {
        String[] arr = new String[countWords(s)];
        String t="";
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                t+=s.charAt(i);
            }else{
                arr[j]=t;
                j++;
                t="";
            }
        }
        arr[j]=t;
        return arr;
    }

    public static String count_Character(String s){
        int charCount =0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch<='z'){
                charCount++;
            }
        }
        return charCount+" ";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "India is my Country";
        //1.Reverse
        System.out.println(reverseString(s));
        System.out.println(countWords(s));

        //2.Print all Words OR Split.
        String[] arr = printWords_Split(s);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //3.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(reverseString(arr[i]+" "));  // aidnI si ym yrtnuoC
        }
        System.out.println();
        //4.
        for (int i = arr.length-1;i >= 0; i--) {
            System.out.print(arr[i]+" ");  // Country my is India
        }
        System.out.println();
        //5.
        for (int i = arr.length-1;i >= 0; i--) {
            System.out.print(reverseString(arr[i]+" "));  //  yrtnuoC ym si aidnI
        }
        System.out.println();
        //6.
        for (int i = 1; i < arr.length; i+=2) {
            System.out.print(arr[i]+" "+arr[i-1]+" ");  // is India Country my
        }
        System.out.println();
        //7: with .length(), direct method.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+arr[i].length()+" ");  //India5 is2 my2 Country7
        }
        System.out.println();
        //7.1: with manual code for counting Characters.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ count_Character( arr[i]+" "));  //India5 is2 my2 Country7
        }
    }
}
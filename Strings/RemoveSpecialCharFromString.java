package com.Strings;

import java.util.Scanner;

public class RemoveSpecialCharFromString {

    public static String removeSpecialChar(String s){

        String t="";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){      //To get Only Special Character use, !(Not-Equal)
                t+=ch;                                                               //To get only Characters, remove Numeric Condition
            }
        }
        return t;
    }
    public static String removeSymbols_AddIntegers(String s){

        String t="";
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                t+=ch;
            }else if (ch>='0' && ch<='9'){
                sum=sum+(ch-48);
            }
        }
        return (sum>0) ? (t+sum) : t;   //Avoid '0' in o/p when no integer is present(sum>0).
    }
     public static String toUpperCase(String s){

        String t="";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                t+=(char)(ch-32);   //Likewise for LowerCase, # ch>='A' && ch<='Z', (ch+32)
            }else{
                t+=ch;
            }
        }
        return t;
    }
    public static String swapCases(String s){

        String t="";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                t+=(char)(ch+32);   //for LowerCase, (ch+32)
            }else if(ch>='a' && ch<='z'){
                t+=(char)(ch-32);   //for UpperCase, (ch-32)
            }else{
                t+=ch;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();

        System.out.println(removeSpecialChar(s));
        System.out.println(removeSymbols_AddIntegers(s));
        System.out.println(toUpperCase(s));
        System.out.println(swapCases(s));
    }
}

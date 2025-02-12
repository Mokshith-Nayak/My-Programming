package com.Strings;

import java.util.Scanner;

public class Trim_Accordingly {

    public static String trim(String s) {

        String t = "";
        int startIndex =0;
        int endIndex =0;

        for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           if(ch != ' '){
               startIndex=i;
               break;
           }
        }
        for (int i = s.length()-1; i >=0; i--) {
           char ch = s.charAt(i);
           if(ch != ' '){
               endIndex=i;
               break;
           }
        }
        //For Trim(Leading and Tailing)
//        for (int i = startIndex; i <= endIndex; i++) {
//               t+=s.charAt(i);
//        }

        //For Trim(Leading & tailing) and removing Multiple spaces(Keeping Single Space)
        for (int i = startIndex; i <= endIndex; i++) {

            if(s.charAt(i) != ' ' || s.charAt(i) == ' ' && s.charAt(i+1) != ' ' ){
                t+=s.charAt(i);
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();

        System.out.println(trim(s));

    }
}

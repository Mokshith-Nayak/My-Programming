package com.Strings;

import java.util.Scanner;

public class AddSymbols_Accordingly {

    public static String addStar_Accordingly(String s) {
        String t="";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'A'){
                t+="*"+ch;    //To REPLACE respective char(eg:a), t+="*";
            }else{
                t+=ch;
            }
        }
        return t;
    }


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();

        System.out.println(addStar_Accordingly(s));
    }
}

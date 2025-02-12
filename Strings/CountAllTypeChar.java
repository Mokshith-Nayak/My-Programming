package com.Strings;

import java.util.Scanner;

public class CountAllTypeChar {

    public static void countEveryTypeChar(String s){
        int vowelsCount = 0, consonantsCount = 0, integerCount = 0, specialCharCount =0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch<='z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                    vowelsCount++;
                }else{
                    consonantsCount++;
                }
            }else if(ch>='0' && ch<='9'){
                integerCount++;
            }else{
                specialCharCount++;
            }
        }
        System.out.println("Vowels: "+vowelsCount);
        System.out.println("Consonants: "+consonantsCount);
        System.out.println("Integers: "+integerCount);
        System.out.println("Symbols: "+specialCharCount);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        countEveryTypeChar(s);

    }
}

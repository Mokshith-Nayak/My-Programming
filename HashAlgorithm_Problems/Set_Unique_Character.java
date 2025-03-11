package com.HashAlgorithm_Problems;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Set_Unique_Character {

    public static void removeDuplicate_Char1(String s){

        LinkedHashSet<Character> list = new LinkedHashSet<>();

        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        System.out.println(list);  //1: [];
        //2: Char
        for(Character ch : list){
            System.out.print(ch);
        }
    }
     public static String removeDuplicate_Char2(String s){

        //3: Concatenation to String
        LinkedHashSet<Character> list = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        String t="";
        for(Character ch : list){
            t+=ch;
        }
        return t;
    }
     public static String removeDuplicate_Asce_Char(String s){

        TreeSet<Character> list = new TreeSet<>();
        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        String t="";
        for(Character ch : list){
            t+=ch;
        }
        return t;
    }
     public static String removeDuplicate_Desc_Char(String s){

        TreeSet<Character> list = new TreeSet<>(Comparator.reverseOrder());
        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        String t="";
        for(Character ch : list){
            t+=ch;
        }
        return t;
    }



    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//        String s = scr.nextLine();
        removeDuplicate_Char1("mississippi");  //1: [m, i, s, p], 2: misp (in char).
        System.out.println(removeDuplicate_Char2("mississippi"));  //3: misp (By String Concatenation).
        System.out.println(removeDuplicate_Asce_Char("mississippi"));   //4: imps (in Ascending: TreeSet)
        System.out.println(removeDuplicate_Desc_Char("mississippi"));   //5: spmi (in Descending: TreeSet)
    }
}

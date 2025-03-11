package com.HashAlgorithm_Problems;

import java.util.Scanner;
import java.util.HashSet;
public class Hash_Set {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
//
//        Hash_Set set = new Hash_Set();

        set.add(5);
        set.add(10);
        set.add(15);
        set.add(scr.nextInt());
        set.add(scr.nextInt());
        set.add(scr.nextInt());
        set.add(27);

//        set.add("Mokshith");
//        set.add('j');
//        set.add(5.555);
//        set.add(5.7f);
//        set.add(false);
//        set.add(null);
//        set.add(new NullPointerException());
//        set.add(new Exception());
//
//        for(Object x:set){
//            System.out.println(x);
//        }

        System.out.println(set);

        for (int x : set){
            System.out.println(x);
        }


    }
}

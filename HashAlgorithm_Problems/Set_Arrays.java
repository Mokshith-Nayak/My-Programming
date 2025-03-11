package com.HashAlgorithm_Problems;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Arrays {

    public static TreeSet<Integer> removeDuplicates(int[] arr){

        TreeSet<Integer> set = new TreeSet<>();
        for (int x : arr) {
            set.add(x);
        }
        return set;
      }

    public static Set<String> removeUrlDuplicates(String input){
        String[] arr = input.split(",");

        Set<String> set = new TreeSet<>();
        for(String url: arr){
             set.add(url);
        }
        return set;
    }

    public static Set<String> removeUrlDuplicates_splitAll(String input){
        String[] urls = input.split(",");

        Set<String> set = new TreeSet<>();
        for(String url: urls){
            //Split the URL
            String[] arr = url.split("\\.");

             set.add(arr[1]);
        }
        return set;
    }

    public static Set<String> removeDuplicate_Words(String input){
        String[] words = input.split(" ");

        Set<String> set = new LinkedHashSet<>();
        for(String word: words){
             set.add(word);
        }
        return set;
    }




    public static void main(String[] args) {
        //1. removeDuplicates
        int[] arr1 = {3,5,7,1,5,4,1,3,2,1};
        TreeSet<Integer> res1 = removeDuplicates(arr1);

        for(int x : res1){
            System.out.print(x+" ");
        }
        System.out.println();

        //2. removeUrlDuplicates
        String input1 = "www.fb.com,www.insta.com,www.fb.com,www.google.com,www.tap.com," +
                "www.insta.com,www.flipkart.com,www.ajio.com,www.amazon.com";

        Set<String> res2 = removeUrlDuplicates(input1);
        for(String url : res2){
            System.out.println(url);
        }
        System.out.println();

        //3. removeUrlDuplicates_splitAll
        Set<String> res3 = removeUrlDuplicates_splitAll(input1);
        for(String url : res3){
            System.out.println(url);
        }
        System.out.println();

        //4. removeDuplicate_Words
        String input2 = "fear leads to anger anger leads to hatred " +
                "hatred leads to conflict conflict leads to suffering";

        Set<String> res4 = removeDuplicate_Words(input2);
        for(String word : res4){
            System.out.print(word+" ");
        }

    }
}

package com.HashAlgorithm_Problems;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map_Prob2_ArrayPairs {

    public static int countPairs(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x : arr) {
            if (map.containsKey(x)) {
                int c = map.get(x);
                map.put(x, c + 1);
            } else {
                map.put(x, 1);
            }
        }
        System.out.println(map);  //O/P: {1=3, 3=2, 4=1, 7=4}
        System.out.println(map.values());  //O/P: [3, 2, 1, 4]

        int pairs = 0;
        Collection<Integer> values = map.values();
        for(int value: values){
            pairs = pairs + value/2;
        }
        return pairs;
    }

    public static void wordOccur_values(String s){
        String[] words = s.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String word: words){
            if(map.containsKey(word)){
//                 Integer c = map.getOrDefault(word,0);
                 Integer c = map.get(word);
                 map.put(word, c+1);
            }else{
                map.put(word, 1);
            }
        }
//          System.out.println(map); //O/P: {hatred=2, leads=4, suffering=1, to=4, anger=2, fear=1, conflict=2}
        Set<String> keys =  map.keySet();
        for(String key: keys){
            int value = map.get(key);
            System.out.println(key+" : "+ value);
        }
    }

    public static void wordOccur_moreThan3_getOrDefault(String s){
        String[] words = s.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String word: words){
            Integer c = map.getOrDefault(word,0);
            map.put(word, c+1);
        }
         Set<String> keys =  map.keySet();
            for(String key: keys){
                int value = map.get(key);

                if(value>3){  //UniqueOccur: if(value == 1), evenNo Occer: if(value%2 == 0), etc..
                System.out.println(key+" : "+ value);
                }
            }
    }


    public static void main(String[] args) {
        //1.
        int[] arr = {3,1,7,7,1,7,7,1,4,3};
        System.out.println(countPairs(arr));  //O/P: 4.
        System.out.println();
        //2.
        String s = "fear leads to anger anger leads to hatred " +
                "hatred leads to conflict conflict leads to suffering";
        wordOccur_values(s);
        System.out.println();

        //3.
        wordOccur_moreThan3_getOrDefault(s);


    }
}

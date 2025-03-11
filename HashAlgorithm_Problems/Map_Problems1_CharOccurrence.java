package com.HashAlgorithm_Problems;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Problems1_CharOccurrence {

    public static String countCharOccurrences(String s){

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int c = map.get(ch);
                map.put(ch, c+1);
            }else{
                map.put(ch, 1);
            }
        }
//        System.out.println(map);  o/p: {m=1, i=4, s=4, p=2}
        String t = "";
        Set<Entry <Character,Integer> > entries = map.entrySet();
        for(Entry<Character,Integer> entry: entries)
        {
            t= t + entry.getKey() + entry.getValue();
        }
        return t;
    }

    public static void main(String[] args) {

        String s = "mississippi";

        System.out.println(countCharOccurrences(s));  //o/p: m1i4s4p2
    }
}

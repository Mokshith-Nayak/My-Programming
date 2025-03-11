package com.HashAlgorithm_Problems;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hash_Map {
    public static void main(String[] args) {

//        HashMap map = new HashMap();        //Heterogeneous values
//        HashMap<String,Integer> map = new HashMap<>();        //Random Orders
//        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();      //Insertion Order
        TreeMap<String,Integer> map = new TreeMap<>();      //Ascending Order

        map.put("India",900);
        map.put("China",9500);
        map.put("Usa",500);
        map.put("Japan",300);
        map.put("Uae",300);
        map.put("Italy",500);



//        map.put("India",100001);
//        map.put("China",9500);
//        map.put(0,"Pakistan");
//        map.put("usa",500);
//        map.put("Japan",300);
//        map.put(75.5,null);
//        map.put("uae",300);
//        map.put("Italy",500);
//        map.put(true,false);
//        map.put(new Thread(),100000);
//        map.put("India",100001);

        System.out.println(map);    //entrySet
        System.out.println();

        Set<String> keys = map.keySet();
        System.out.println(keys);   //keySet []
        System.out.println();

        for(String key: keys){
            Integer value = map.get(key);
            System.out.println(key+" : "+ value);    //keySet + values
        }
        System.out.println();

        Set<Entry <String,Integer> > entries = map.entrySet();
        for(Entry<String,Integer> entry : entries){
            System.out.println(entry);  //entry.getKey() - gives only keys, entry.getValue() - gives only values.
        }

    }
}

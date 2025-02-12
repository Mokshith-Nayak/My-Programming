package com.Collections_Frameworks;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Class {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(23);
        list.add(46);
        list.add(78);
        list.add(99);
        list.add(10);
        list.add(99);

        //1. Binary Search
        System.out.println(Collections.binarySearch(list,78));  //2
        //2. Frequency(occurrence)
        System.out.println(Collections.frequency(list,99)); //2
        //3. Maximum and Minimum Value
        System.out.println(Collections.max(list));  //99
        System.out.println(Collections.min(list));  //10
        //4. Replace new value with all old value
        System.out.println(Collections.replaceAll(list,99,55)); //true
        System.out.println(list);   //[23, 46, 78, 55, 10, 55]
        System.out.println();
        //5. Shuffle(mix values/will not maintain the order of insertion)
                Collections.shuffle(list);
                System.out.println(list);   //[46, 55, 55, 10, 23, 78]
        //6. Sort
            Collections.sort(list);     //[10, 23, 46, 55, 55, 78]
            System.out.println(list);

    }
}

package com.Collections_Frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List {
    public static void main(String[] args) {

        ArrayList lists = new ArrayList();

        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);

        System.out.println(Collections.min(lists));

        //1.
        System.out.println(lists);

        //2.
        for(int i=0; i< lists.size(); i++){
            System.out.println(lists.get(i));
        }
        System.out.println();

        //3.
        for(Object list: lists){
            System.out.println(list);
        }
        System.out.println();

        //4. Access elements in Forward direction : Using Iterator interface
        Iterator cursor1 = lists.iterator();
        while(cursor1.hasNext()){
            System.out.println(cursor1.next());
        }
        System.out.println();

        //5. Access elements in Backward direction : Using Iterator interface
        ListIterator cursor2 = lists.listIterator(lists.size());
        while(cursor2.hasPrevious()){
            System.out.println(cursor2.previous());

        }

    }
}

package com.Collections_Frameworks;

import java.util.ArrayDeque;

public class ArrayDeque_creation {
    public static void main(String[] args) {
        /*
        In java we can not create object of Queue(interface),
        Deque(Interface) and Stack(Outdated Class) Hence
        we cannot directly use them, but indirectly through,
        = new LinkedList() and = new ArrayDeque() : Objects for all 3.
         */
        ArrayDeque dique = new ArrayDeque();
        dique.add(100);
        dique.add(200);
        dique.add(300);
        dique.add(30.5);
        dique.add(true);
//        dique.add(null);  //NullPointerException: ArrayDeque doesn't store null value
        
        System.out.println(dique);

    }
}

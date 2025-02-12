package com.Oops;//import java.util.Scanner;

class Animal1{

}
class Tiger1 extends Animal1{

}
class Lion1{

}
class Parent1{
    Animal1 disp() {
        System.out.println("Hi");
        Animal1 a = new Animal1();
        return a;
        }
    }
 class Child1 extends Parent1{

        @Override
        Tiger1 disp(){
            System.out.println("Hello");
            Tiger1 t = new Tiger1();
            return t;
        }
    }


public class OverrideRule4 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.disp();
    }
}

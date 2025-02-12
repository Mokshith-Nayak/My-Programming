package com.Oops;//public class com.Oops.Inheritance {
//    public static void main(String[] args) {
//        com.Oops.Child c = new com.Oops.Child(1,1);
//        c.disp();
//    }
//}
//
//class com.Oops.Parent{
//    int x,y;
//
//    com.Oops.Parent(){
//
//        x=100;
//        y=200;
//    }
//    com.Oops.Parent (int x, int y){
//
//        this.x=x;
//        this.y=y;
//    }
//}
//class com.Oops.Child extends com.Oops.Parent{
//    int a,b;
//
//    com.Oops.Child(){
////        this(23,32);
//        a=300;
//        b=400;
//    }
//    com.Oops.Child(int a, int b){
//        a=9;
//        b=23;
//        this.a=a;
//        this.b=b;
//
//    }
//    void disp(){
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(a);
//        System.out.println(b);
//
//    }
//}

//Program 2
//class BankDetails{
//    private int acNumber =  Integer.MAX_VALUE;
//    private int passWord = 234132;
//
//}
//class Hacker extends BankDetails{
//    Hacker() {
//        acNumber=422443;
//        passWord=2425;
//        System.out.println(acNumber);
//        System.out.println(passWord);
//    }
//}

//Program 3
class Parent{
    Parent(){
        System.out.println("Inside com.Oops.Parent Class");
    }
}
class Child extends Parent{
    Child(){
        //com.Oops.Parent class is not inheriting in com.Oops.Child Class,Constructor will never get Inherited, #but P.Class will execute because of Super() by JVM
        System.out.println("Inside com.Oops.Child Class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
//      System.out.println(Integer.MAX_VALUE+ " Range from " + Integer.MIN_VALUE);
        Child c = new Child();
    }
}

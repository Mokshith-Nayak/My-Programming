package com.Oops;

public class Method
{
    public static void main(String[] args)
    {
//        greet();
//        greet();
//        String s = greet();
//        System.out.println("Water " + s);
//
//        Scanner scr = new Scanner(System.in);
//        String st = scr.nextLine();
//        String a = w("Enter the String : "+st);
//        System.out.println(a);

        int a = 4;
        int b = 5;
        swap(a,b);
        System.out.println(a+" "+b+" ");
    }

//    static String w(String m)
//    {
//        String w = "Hi ";
//        return w;
//    }
//
//    static String greet()
//    {
//        String s = "Hello, World!";
//      System.out.println(s);
//        return s;
//    }
    static void swap(int a, int b)
    {


        int z = a;
        a = b;
        b = z;

    }

}
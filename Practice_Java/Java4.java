package com.Practice_Java;

public class Java4
{
    public static void main(String[] args)
    {
        String man = helloWorld("Mokshith_","Nayak");
        System.out.println(man);
        String man1 = helloWorld("Mokshith_","C V");
        System.out.println("\n"+man1);

    }

    static String helloWorld(String n1,String n2)
    {
        String hello;
//        hello = "How are you, "+ n1+ n2;
        return hello="How are you, "+ n1+ n2;
    }
}

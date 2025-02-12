package com.Oops;

import java.util.Scanner;

class Adding extends Thread{
    @Override
    public void run(){
        System.out.println("Adding Started");
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the Number1:");
        int a = scr.nextInt();
        System.out.println("Enter the Number2");
        int b = scr.nextInt();
        int c = a+b;
        System.out.println(c);
        System.out.println("Adding Completed");
    }
}

class Characters extends Thread{
    @Override
    public void run(){
        System.out.println("Printing Characters Started");
        for (int i = 65; i < 70; i++) {
            System.out.println((char)i);
            try{
                sleep(5000);
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
        System.out.println("Printing Characters Completed");
    }
}

class Numbers extends Thread{
    @Override
    public void run(){
        System.out.println("Printing Numbers Started");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            try{
                sleep(5000);
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        System.out.println("Printing Numbers Completed");
    }
}



public class Multi_Threading_1ExtendsThread {
    public static void main(String[] args) {

        Adding a = new Adding();
        Characters c = new Characters();
        Numbers n = new Numbers();

        a.start();
        c.start();
        n.start();

    }
}

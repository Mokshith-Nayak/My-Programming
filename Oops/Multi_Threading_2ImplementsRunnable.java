package com.Oops;

import java.util.Scanner;

class Adding11 implements Runnable{
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

class Characters11 implements Runnable{
    @Override
    public void run(){
        System.out.println("Printing Characters Started");
        for (int i = 65; i < 70; i++) {
            System.out.println((char)i);
            try{
                Thread.sleep(3000);
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
        System.out.println("Printing Characters Completed");
    }
}

class Numbers11 implements Runnable{
    @Override
    public void run(){
        System.out.println("Printing Numbers Started");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            try{
                Thread.sleep(3000);
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        System.out.println("Printing Numbers Completed");
    }
}



public class Multi_Threading_2ImplementsRunnable {
    public static void main(String[] args) {

        Adding11 a = new Adding11();
        Characters11 c = new Characters11();
        Numbers11 n = new Numbers11();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(n);

        t1.start();
        t2.start();
        t3.start();
    }
}

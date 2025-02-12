package com.Oops;

import java.util.Scanner;

class Alpha extends Thread{
    @Override
    public void run(){
        Thread t = currentThread();
        String name = t.getName();
        if(name.equals("ADD")){
            adding();
        }else if(name.equals("CHAR")){
            printChar();
        }else{
            printNums();
        }
    }

    public void adding(){
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

    public void printChar(){
        System.out.println("Printing Characters Started");
        for (int i = 65; i < 70; i++) {
            System.out.println((char)i);
            try{
                sleep(3000);
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
        System.out.println("Printing Characters Completed");
    }

    public void printNums(){
        System.out.println("Printing Numbers Started");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            try{
                sleep(3000);
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        System.out.println("Printing Numbers Completed");
    }
}

public class MultiThreading_Single_runMethod {
    public static void main(String[] args) {

        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();
        Alpha a3 = new Alpha();

        a1.setName("ADD");
        a2.setName("CHAR");
        a3.setName("NUM");

        a1.start();
        a2.start();
        a3.start();

    }
}

package com.Java_Problems;

import java.util.Scanner;

public class ArmstongNumber {
    public static boolean armstrong1(int n1){
//        int count = com.Java_Problems.CountOfDigits.countOfDigits(n1);
        int count = (int)Math.log10(n1)+1;
        int rem=0;
        int arm = 0;
        int temp = n1;

        while(n1>0) {
           rem = n1%10;
           arm+= (int) Math.pow(rem,count);
           n1/=10;
        }
        return temp == arm;
    }

    public static void armstrong2(int n1,int n2){

        for (int i = n1; i <=n2; i++) {
           if(armstrong1(i)){
               System.out.print(i+" ");
           }
        }
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int n1 = scr.nextInt();
        int n2 = scr.nextInt();
//        System.out.println(armstrong1(n1));  // 1.
        armstrong2(n1,n2);
    }
}

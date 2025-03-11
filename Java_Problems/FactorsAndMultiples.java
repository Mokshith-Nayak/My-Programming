package com.Java_Problems;

import java.util.Scanner;

public class FactorsAndMultiples {

    public static void commonMultiples(int n, int a, int b) {
        int count=0;
        for (int i = 1; count < n; i++) {
            if (i % a == 0 && i%b==0) {
                count++;
                System.out.print(i + " ");
            }
        }
    }
    public static void commonFactors(int n1, int n2){
        //As there is no common factors b/w n1 & n2, loop doent have to go till n2(which is greatest number)
        int min = (n1<n2)?n1:n2;
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i==0) {
                System.out.print(i + " ");
            }
        }
    }
    public static int highestCommonFactors(int n1, int n2){
        int min = (n1<n2)?n1:n2;
        for (int i = min; i >=1; i--) {
            if (n1 % i == 0 && n2 % i==0) {
                return i;
            }

        }
        return -1;
    }
    public static int euclidHCF(int n1, int n2){

        while(n2!=0) {
               int temp =n2;
               n2=n1%n2;
               n1=temp;
           }
        return n1;
    }
    public static int gabrielLameHCF(int n1, int n2) {
        // Ensure n1 is the larger number
        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        while (n2 != 0) {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        return n1; // The GCD when n2 becomes 0
    }


    public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            int n1 = in.nextInt();
            int n2 = in.nextInt();
//            int a = in.nextInt();
//            int b = in.nextInt();

//            commonMultiples(n, a,b);   1.
//            commonFactors(n1, n2);     2.
//            System.out.println(highestCommonFactors(n1,n2));   3.
//            System.out.println(euclidHCF(n1,n2));   4.
              System.out.println(gabrielLameHCF(n1, n2));  //  5.


        }
    }

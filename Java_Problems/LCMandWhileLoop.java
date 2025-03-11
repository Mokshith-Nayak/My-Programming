package com.Java_Problems;

import java.util.Scanner;

public class LCMandWhileLoop {

    public static void leastCommonMultiples1(int n, int a, int b) {
        int count = 0;
        for (int i = 1; count < n; i++) {
            if (i % a == 0 && i % b == 0) {
                count++;
                System.out.print(i + " ");
                break;
            }
        }
    }
//    public static int highestCommonFactors(int n1, int n2){
//        int min = (n1<n2)?n1:n2;
//        for (int i = min; i >=1; i--) {
//            if (n1 % i == 0 && n2 % i==0) {
//                return i;
//            }
//        }
//        return -1;
//    }
    public static int leastCommonMultiple2(int n1, int n2){
//      int lcm= n1*n2/highestCommonFactors(n1,n2);
//      return lcm;

      int lcm =n1*n2/FactorsAndMultiples.highestCommonFactors(n1,n2);   //calling com.Oops.Method from other class/program using class name of static method
      return lcm;
    }

    public static void main (String[]args){
        Scanner scr = new Scanner(System.in);
//        int n = scr.nextInt();
        int n1 = scr.nextInt();
        int n2 = scr.nextInt();

//        leastCommonMultiples1(n, n1, n2);   1.

        System.out.println(leastCommonMultiple2(n1,n2));
    }
}

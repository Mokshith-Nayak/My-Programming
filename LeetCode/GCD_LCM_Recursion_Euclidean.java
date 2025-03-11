package com.LeetCode;

public class GCD_LCM_Recursion_Euclidean {

    public static int gcd(int a, int b) {

        if(a == 0){
            return  b;
        }
        return gcd(b%a, a);
    }
    
    public static int lcm(int a, int b) {
        return  a*b/gcd(a,b);
    }

    public static void main(String[] args) {

        System.out.println("GCD: "+gcd(20,30)); //GCD: 10

        System.out.println("LCM: "+lcm(20,30)); //LCM: 60
    }
}

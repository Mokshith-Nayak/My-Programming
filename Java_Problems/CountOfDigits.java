package com.Java_Problems;

import java.util.Scanner;

public class CountOfDigits {
    public static int countOfDigits(int n){
        int count=0;
        while(n>0) {
            n/=10;
            count++;
        }
        return count;
    }

    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0) {
            sum +=n%10;
            n/=10;
        }
        return sum;
    }

    //Also can be Palindrome, when reverse == n while printing in com.Factors.Recursion_Fibonacci method.
    public static int reverse(int n){
        int reverse=0;
        int rem=0;
        while(n>0) {
//            reverse = reverse*10+n%10;  OR
            rem=n%10;
            reverse = reverse*10+rem;
            n/=10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        System.out.println(countOfDigits(n));    //1.

//        System.out.println(sumOfDigits(n));   2.
//        int rev = reverse(n);
//        System.out.println(rev);  //3. To Print Reverse of Integer.

//        System.out.println((rev==n)?"Palindrome":"Not Palindrome");    //4. To check weather the number is Palindrome or not.
    }

}

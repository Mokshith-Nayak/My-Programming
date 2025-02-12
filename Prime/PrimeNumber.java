package com.Prime;

import java.util.Scanner;
class Main
{
    public static String isPrime()
    {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = scr.nextInt();
        for (int i = 1; i*i <=n; i++)
        {
            if(n%2==0)
            {
                return "Not com.Factors.Factors";
            }
        }
        return "Prime";
    }
}
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(Main.isPrime());;
    }
}

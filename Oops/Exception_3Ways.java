package com.Oops;

import java.util.Scanner;

class Main1{
    void alpha() throws Exception
    {
        System.out.println("Connection Established2");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the Numerator: ");
            int num = scanner.nextInt();

            System.out.print("Enter the Denominator: ");
            int deno = scanner.nextInt();

            int res = num / deno;
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Caught Exception in alpha");
            throw e;
        }
        finally{
            System.out.println("Connection Terminated2");
        }
    }
}
    public class Exception_3Ways {
        public static void main(String[] args){

        System.out.println("Connection Established1");
        Main1 m1 = new Main1();
        try {
            m1.alpha();
        } catch (Exception e) {
            System.out.println("Caught Exception again in main");
        }
        System.out.println("Connection Terminated1");

    }
}
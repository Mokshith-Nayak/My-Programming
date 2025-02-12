package com.Oops;

import java.util.Scanner;

class Demo1{
    void alpha(){
        System.out.println("Connection Established4");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the Numerator: ");
            int num = scanner.nextInt();

            System.out.print("Enter the Denominator: ");
            int deno = scanner.nextInt();

            int res = num / deno;
            System.out.println(res);

        System.out.println("Connection Terminated4");
        }
}
class Demo2{
    void beta(){
        System.out.println("Connection Established3");
//        try{
        Demo1 d1 = new Demo1();
        d1.alpha();
//        } catch (Exception e) {
//            System.out.println("Enter valid input, Try Again.");
//        }
        System.out.println("Connection Terminated3");
    }
}
class Demo3{
    void gamma(){
        System.out.println("Connection Established2");
        try{
        Demo2 d2 = new Demo2();
        d2.beta();
        } catch (Exception e) {
            System.out.println("Enter valid input, Try Again.");
        }
        System.out.println("Connection Terminated2");
    }
}
//Exception Propagation : Usage of UDEH(User Define Exception Handling: try, catch blocks) From 1 Class to another classes
public class Exception_Han_OutsideMainClass_Method {
    public static void main(String[] args) {

        System.out.println("Connection Established1");
        Demo3 d3 = new Demo3();
        d3.gamma();
        System.out.println("Connection Terminated1");

    }
}

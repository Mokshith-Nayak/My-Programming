package com.Oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Connection Established");
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the Numerator: ");
            int num = scanner.nextInt();

            System.out.print("Enter the Denominator: ");
            int deno = scanner.nextInt();

            int res = num/deno;
            System.out.println(res);

            System.out.println("Enter Size of the Array");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the Index");
            int index = scanner.nextInt();

            System.out.println("Enter the Element");
            int data = scanner.nextInt();

            arr[index]=data;
            arr=null;
            System.out.println(arr[index]);

        }catch(ArithmeticException a){
            System.out.println("Enter Non-Zero Denominator");
        }catch(NegativeArraySizeException nae){
            System.out.println("Provide +Ve Array Size");
        }catch(InputMismatchException ime){
            System.out.println("Provide Only Integers");
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Provide Valid Index");
        }catch(Exception e){
            System.out.println("Invalid Input, try again");
        }
        System.out.println("Connection Terminated");
    }
}

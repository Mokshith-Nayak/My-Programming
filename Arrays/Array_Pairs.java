package com.Arrays;

import java.util.Scanner;

public class Array_Pairs {
    public static boolean isPrime(int n) {
//        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void pairPrimeElements(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(isPrime(arr[i])){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

    public static void sumPairEqualPrime(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length; j++) {
                int sum = arr[i]+arr[j];
//                if(isPrime(sum)){   //All pair whose sum is only Factors
                if(isPrime(arr[i])){    //To print all pairs whose 1st number is Factors
                    System.out.println(arr[i]+" "+arr[j]+"= "+sum);
                }
            }
        }
    }

   public static void arrayPairs(int[] arr){
        //IMPORTANT
       for (int i = 0; i < arr.length-1; i++) {
           for (int j = i+1; j <arr.length; j++) {
            System.out.println(arr[i]+" "+arr[j]);
        }
      }
    }

    //**
    public static void sumPairEqualK(int[] arr,int k){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length; j++) {

                if(arr[i]+arr[j]==k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void differencePairEqualK(int[] arr,int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
    public static void printMinSumPair(int[] arr) {

        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum < minSum) {
                    minSum = sum;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
//        int k = scanner.nextInt();

//        arrayPairs(arr);
//        sumPairEqualK(arr,k);
        pairPrimeElements(arr);

        sumPairEqualPrime(arr);
    }
}

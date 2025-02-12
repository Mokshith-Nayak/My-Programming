package com.ArrayLinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch1 {

    public static int linearSearch1(int[] arr,int k){
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static boolean search(String name,char target){

        if(name.isEmpty()){  // if(name.length() == 0)
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
 public static boolean search2(String name,char target){
        //Using For Each Loop
        if(name.isEmpty()){  // if(name.length() == 0)
            return false;
        }
        //To use the for-each-loop we need Array or Collection,Hence String is converted to Array
        target = Character.toLowerCase(target);
        for(char ch : name.toCharArray()){
            if(Character.toLowerCase(ch) == target){
            return true;
            }
          }
        return false;
    }

    public static int rangeInteger(int[] arr,int k){

        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public  static int minNumber(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        char target = scanner.next().charAt(0);
//        System.out.println(search2(name,target));
//
//        System.out.println(Arrays.toString(name.toCharArray()));


        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();
        }
//        int k = scanner.nextInt();
//        System.out.println(linearSearch1(arr,k));
//        System.out.println(rangeInteger(arr,k));
        System.out.println(minNumber(arr));


    }
}

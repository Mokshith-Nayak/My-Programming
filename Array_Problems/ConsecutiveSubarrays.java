package com.Array_Problems;
import java.util.Scanner;

public class ConsecutiveSubarrays {

    public static void consecutiveSubarray(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] - arr[i] == 1){
                System.out.print(arr[i]+" ");
            }else{
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[arr.length-1]);
        System.out.println("---------------");
    }
    public static void consecutiveSubarrayLength(int[] arr){
        int count =1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] - arr[i] == 1){
                count++;
                
            }else{
               System.out.println(count);
                count=1;
            }
        }
    System.out.println(count);
    System.out.println("---------------");
    }
public static void consecutiveSubarrayLongestLength(int[] arr){
        int max = Integer.MIN_VALUE;
        int count =1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] - arr[i] == 1){
                count++;

            }else{
                if(count>max){
                    max=count;
                }
                count=1;
            }
        }
         if(count>max){
            max=count;
         }
    System.out.println(max);
    System.out.println("---------------");
    }
    public static void consecutivePrintAllLongestSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int count =1;
        int endIndex=0;
        int startIndex=0;
         for (int i = 0; i < arr.length-1; i++) {

            if(arr[i+1] - arr[i] == 1){
                count++;
            }else{
                if(count>max){
                    max=count;
                    endIndex=i;
                }
                count=1;
            }
        }
         if(count>max){
            max=count;
            endIndex= arr.length-1;
         }
         startIndex=endIndex-max+1;
          for (int i = startIndex; i <= endIndex ; i++) {
             System.out.print(arr[i]+" ");
              }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {5,12,13,14,9,2,3,4,5,6};

        consecutiveSubarray(arr);
        consecutiveSubarrayLength(arr);
        consecutiveSubarrayLongestLength(arr);
        consecutivePrintAllLongestSubarray(arr);
    }
}

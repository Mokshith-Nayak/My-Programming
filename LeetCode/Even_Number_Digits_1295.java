package com.LeetCode;

import java.util.Scanner;

public class Even_Number_Digits_1295 {
    //1 Way
    public static int findNumbers(int[] nums) {

        int count =0;
        for(int m : nums){
            // if(m<0){ m=-m;} *to use without Math.adb, inside if{} loop.
            if(String.valueOf(Math.abs(m)).length()%2==0){
                count++;
            }
        }
        return count;
    }
    //OR 2.1 Way. and the Best case scenario
    public static int countDigit(int nums) {

        if (nums == 0) return 1; // Handle zero explicitly
        if (nums < 0) nums = -nums; // Convert negatives to positive
        return (int) Math.log10(nums) + 1; // In-Built method to Count digits
    }
    //2 Way
    public static int countNumberOfDigit(int n) {
        if(n<0){
            n*=-1;
        }
        int count = 0;
        do {             //As is will definitely execute for 1 time, there is no need explicitly to count for 0.
            n = n / 10;
            count++;
        }while (n  > 0);
        return count;
    }
    public static int findNumbers2(int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (countNumberOfDigit(num)%2==0) {  //if(countDigit(num)%2 ==0 )  :Best Case
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i]=scanner.nextInt();
        }

        System.out.println(findNumbers(nums));
        System.out.println(findNumbers2(nums));

    }
}

package com.LeetCode;

import java.util.Scanner;
//LeetCode 744
public class SmallestLetter_GreaterThanTarget_744 {
        public static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length-1;

            while(start <= end){
                int mid = start+(end-start)/2;

                if(letters[mid] > target){         //This condition is 1st Important
                   end = mid-1;
                }
                else
                    start=mid+1;
                }
          //This condition is 2nd Important,Where char wraps around
           return letters[start % letters.length];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letters = {'c','f','j'};
        char target = scanner.next().charAt(0);
        System.out.println(nextGreatestLetter(letters,target));
    }
}
/*
Return the smallest character in letters that is lexicographically greater than target.
If such a character does not exist, return the first character in letters.
 */
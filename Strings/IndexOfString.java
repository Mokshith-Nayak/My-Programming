package com.Strings;

import java.util.Scanner;

public class IndexOfString {

    public static int indexOfString(String s,char k){

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == k){
                return i;
            }
        }
        return -1;
    }
     public static int indexOf_BinarySearch(String s,char k){

         char[] chars = s.toCharArray();
         java.util.Arrays.sort(chars); // Sort the characters

         int start = 0, end = chars.length - 1;

         while (start <= end) {
             int mid = start + (end - start) / 2;

             if (chars[mid] == k) {
                 return mid;
             } else if (chars[mid] < k) {
                 start = mid + 1;
             } else {
                 end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char k = scanner.next().charAt(0);

//        System.out.println(indexOfString(s,k));   //O/P: matrix, r -> 3.

        System.out.println(indexOf_BinarySearch(s,k));

    }
}

package com.Strings;

import java.util.Scanner;

public class FInd_SubSequence {

    public static String subSequence(String a,String b) {

        int i=0, j=0;
        while(i<a.length() && j<b.length()){

            if(a.charAt(i) == b.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return (j == b.length())? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(subSequence(a,b));

    }
}

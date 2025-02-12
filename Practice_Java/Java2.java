package com.Practice_Java;

import java.util.Scanner;
public class Java2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[][][] a = new int[3][5][7];
        // int[][] a = new int[3][3];


        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                for (int k = 0; k < a[i][j].length; k++)
                {
                    System.out.println("Enter the School: "+i+" Class: "+j+" Students: "+k);
                    a[i][j][k] = s.nextInt();
                }
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                for (int k = 0; k < a[i][j].length; k++)
                {
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println("----------");
        }
    }
}

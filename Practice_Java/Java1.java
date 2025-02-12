package com.Practice_Java;

import java.util.Scanner;
public class Java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter : ");
        float m = scanner.nextFloat();
        float x = celsius(m);
        System.out.println(x);
    }

    static float celsius(float c)
    {
        float f = (c * ((float)9 / 5)) + 32;
        return f;
    }
}
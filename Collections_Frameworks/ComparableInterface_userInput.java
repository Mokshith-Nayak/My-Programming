package com.Collections_Frameworks; // Ensure package declaration is correct

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> { // Ensure type parameter is provided
    private int id;
    private String name;
    private long phoneNum;  // Changed int to long for phone number

    public Student(int id, String name, long phoneNum) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phoneNum;
    }

    @Override
    public int compareTo(Student other) { // Properly implementing Comparable<Student>
        return Integer.compare(this.id, other.id);
    }
}

public class ComparableInterface_userInput {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scr.nextInt();
        scr.nextLine(); // Consume the leftover newline

        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scr.nextInt();
            scr.nextLine(); // Consume the leftover newline
            System.out.print("Name: ");
            String name = scr.nextLine();
            System.out.print("Phone Number: ");
            long phoneNum = scr.nextLong();

            list.add(new Student(id, name, phoneNum));
        }

        Collections.sort(list); // Sorting based on compareTo()

        System.out.println("\nSorted Students List (by ID):");
        for (Student o : list) {
            System.out.println(o);
        }

        scr.close();
    }
}

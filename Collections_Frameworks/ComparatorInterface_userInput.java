package com.Collections_Frameworks;

import java.util.*;

class Man1 {
    int age;
    String name;

    public Man1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Age: " + age + " Name: " + name;
    }
}

public class ComparatorInterface_userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Man1> list = new ArrayList<>();

        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            list.add(new Man1(age, name));
        }

        // Sorting in ascending order of age
        Comparator<Man1> com = Comparator.comparingInt(m -> m.age);
        Collections.sort(list, com);

        System.out.println("\nSorted by age (Ascending Order):");
        list.forEach(System.out::println);

        // Sorting in descending order of age
        Comparator<Man1> comDesc = (i, j) -> Integer.compare(j.age, i.age);
        Collections.sort(list, comDesc);

        System.out.println("\nSorted by age (Descending Order):");
        list.forEach(System.out::println);

        scanner.close();
    }
}

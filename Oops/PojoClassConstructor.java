package com.Oops;

import java.util.Scanner;

class Department1 {
    private int id;
    private String name;
    private int salary;
    private String email;

    public Department1(int id, String name, int salary, String email) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }


    public Department1() {

    }
    //Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getter and Setter for salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
public class PojoClassConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Department1[] storeObject = new Department1[n];

        for(int i =0; i<n; i++)
        {
            System.out.print("Enter the Details of "+(i+1)+" Employees: ");
            String input1= scanner.nextLine();
            String[] arr1 = input1.split(",");

            Department1 e = new Department1();

            e.setId(Integer.parseInt(arr1[0].trim()));
            e.setName(arr1[1].trim());
            e.setSalary(Integer.parseInt(arr1[2].trim()));
            e.setEmail(arr1[3].trim());

            storeObject[i]=e;
        }

        for(Department1 o :storeObject)
        {
            System.out.println(o.getId()+" "+o.getName()+" "+o.getSalary()+" "+o.getEmail());
        }
    }

}

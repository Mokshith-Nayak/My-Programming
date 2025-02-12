package com.Collections_Frameworks;

import java.util.*;

//ID
class SortIdAsc implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 e1, Employee2 e2){
        return Integer.compare(e1.getId(), e2.getId());

    }
}
class SortIdDesc implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 e1, Employee2 e2){
        return Integer.compare(e2.getId(), e1.getId());  // Simply reverse the order
    }
}
//NAME
class SortNamaAsc implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 name1, Employee2 name2){

        if(name1.getName().equals(name2.getName())){
            return Integer.compare(name1.getId(), name2.getId());
        }
        return name1.getName().compareTo(name2.getName());
    }
}

class SortNamaDesc implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 name1, Employee2 name2){

//        if(name1.getName().equals(name2.getName())){      //for based on id, if duplicate names found
//            return Integer.compare(name2.getId(), name1.getId());
//        }
//        Instead of -1 * id1.compareTo(id2) for descending, use id2.compareTo(id1) for better readability.
        return name2.getName().compareTo(name1.getName());
    }
}
/*
Why compareTo() used here instead compare? -> The compareTo() method belongs to the String class,
while compare() belongs to the Integer class. Integer.compare(e2.getId(), e1.getId()) works because
compare() is a static method of Integer, but there is no compare() method for Strings hence we must use compareTo().
 */

//SALARY
class SortSalaryAsc implements Comparator<Employee2>{
    @Override
    public int compare(Employee2 salary1, Employee2 salary2){

        return Integer.compare(salary1.getSalary(), salary2.getSalary());
    }
}

class SortSalaryDesc implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 salary1, Employee2 salary2) {
        return Integer.compare(salary2.getSalary(), salary1.getSalary());
    }
}

class Employee1 {
    private int id;
    private String name;
    private int salary;

    public Employee1(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return id + " " + name + " " + salary;
    }
}


public class ComparatorInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee2> employees = Arrays.asList(
                new Employee2(2, "Tim", 40000),
                new Employee2(6, "Tim", 40000),
                new Employee2(1, "Justin", 50000),
                new Employee2(3, "Justin", 45000),
                new Employee2(5, "Bob", 75000),
                new Employee2(4, "Wilson", 60000)
        );

        // Mapping input choice to corresponding Comparator
        Map<String, Comparator<Employee2>> comparators = Map.of(
                "1", new SortIdAsc(),
                "2", new SortIdDesc(),
                "3", new SortNamaAsc(),
                "4", new SortNamaDesc(),
                "5", new SortSalaryAsc(),
                "6", new SortSalaryDesc()
        );

        System.out.println("Enter a number (1-6) for sorting:");

        String inputType = scanner.nextLine();
        if (comparators.containsKey(inputType)) {
            printSortedEmployees(employees, comparators.get(inputType));
        } else {
            System.out.println("Invalid input, Enter a number from 1 to 6");
        }
    }

    public static void printSortedEmployees(List<Employee2> employees, Comparator<Employee2> comparator) {
        TreeSet<Employee2> sortedSet = new TreeSet<>(comparator);
        sortedSet.addAll(employees);
        System.out.println(sortedSet);

         for(Employee2 e : sortedSet){
             System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
         }
    }
}

package com.Collections_Frameworks;

import java.util.*;

class Employee2 implements Comparable<Employee2> {
    private int id;
    private String name;
    private int salary;

    public Employee2(int id, String name, int salary){
        super();
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public Employee2(){

    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return id+" "+name+" "+salary;
    }

    @Override
    public int compareTo(Employee2 e2){
//        return Integer.compare(this.id, e2.id);   //OR

        Employee2 e1 = this;
        Integer id1 = e1.id;
        Integer id2 = e2.id;
        return id1.compareTo(id2);

        //For sorting based on String
//        Employee e1 = this;
//        String val1 = e1.name;
//        String val2 = e2.name;
//        return val1.compareTo(val2);
    }

    //For sorting based on String length
// @Override
//    public int compareTo(Employee val2){
//        return Integer.compare(this.name.length(), val2.name.length());
//    }

}


public abstract class Comparable_interface {
    public static void main(String[] args) {

        Employee2 e1 = new Employee2(2,"doing",40000);
        Employee2 e2 = new Employee2(1,"Java",50000);
        Employee2 e3 = new Employee2(3,"am",30000);
        Employee2 e4 = new Employee2(5,"I",60000);
        Employee2 e5 = new Employee2(4,"Practice",70000);

        ArrayList<Employee2> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }


}
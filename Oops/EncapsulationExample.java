package com.Oops;

class Employee
{
   private int id;
   private String name;
   private int salary;
   private String email;

    public void setData(int id, String name,int salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
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

    public String getEmail() {
        return email;
    }
}
public class EncapsulationExample
{
    public static void main(String[] args)
    {
       Employee em = new Employee();
       em.setData(1,"Mokshith",1000000,"m@gmail.com");

        System.out.println(em.getId() + "\n" + em.getName() + "\n" + em.getSalary() + "\n" + em.getEmail());

    }
}

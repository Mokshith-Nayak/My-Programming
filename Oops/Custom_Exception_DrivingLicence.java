package com.Oops;

import java.util.Scanner;

class Rto{
    int age;

    void acceptApplicant(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the age: ");
        age = scr.nextInt();
    }
    void verify() throws UnderAge_Exception, OverAge_Exception{
        if(age >=18 && age <65){
            System.out.println("Driving licence Issued, Take it ");
        } else if (age<18) {
            UnderAge_Exception ua = new UnderAge_Exception();
            System.out.println("Invalid Age");
            throw ua;
        }else {
            OverAge_Exception oa = new OverAge_Exception();
            System.out.println("Invalid Age");
            throw oa;
        }
    }
}
class StateGovernment{

    void get() {
        Rto rto = new Rto();
        try {
            rto.acceptApplicant();
            rto.verify();
        }
        catch (Exception ex) {
                try {
                    rto.acceptApplicant();
                    rto.verify();
                } catch (Exception exc) {
                System.out.println(exc.getMessage());  // You are too Young!, CALM DOWN
//                System.out.println(exc); //O/p: com.Oops.UnderAge_Exception: You are too Young!, CALM DOWN
            }
        }
    }
}


class UnderAge_Exception extends Exception {
    @Override
    public String getMessage() {
        return "You are too Young!, CALM DOWN";
    }
}
class OverAge_Exception extends Exception {
     @Override
     public String getMessage() {
         return "You are too Old!, NOT ELIGIBLE";
     }
}




public class Custom_Exception_DrivingLicence {
    public static void main(String[] args) {

    StateGovernment sg = new StateGovernment();
    sg.get();

    }
}

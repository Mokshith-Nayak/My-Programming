package com.Oops;

import java.util.Scanner;

class Atm{

    int pin = 1234;
    int p;

    void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the PIN number");
        p=scanner.nextInt();

    }

    void verify() throws InvalidPinException{
        if(pin == p){
            System.out.println("Collect your Money");
        }else{

            InvalidPinException ipe = new InvalidPinException();
            System.out.println("Invalid PIN Number");
            throw ipe;
        }
    }
}
class Bank{

    void start(){

        Atm atm = new Atm();
        try{
            atm.acceptInput();
            atm.verify();
        }
        catch(Exception e){
                     try{
                        atm.acceptInput();
                        atm.verify();
                        }catch (Exception ex) {
                        try{
                             atm.acceptInput();
                             atm.verify();
                            }catch (Exception exc) {
                        InvalidPinException ipe = new InvalidPinException();
                        System.out.println(ipe.getMessage());  //O/p: CARD BLOCKED!!!!! PLEASE CONTACT BANK
                        System.out.println(ipe);  //O/p: com.Oops.InvalidPinException: CARD BLOCKED!!!!! PLEASE CONTACT BANK
                   }
             }
        }
    }
}

class InvalidPinException extends Exception{
    @Override
    public String getMessage() {
        return "CARD BLOCKED!!!!! PLEASE CONTACT BANK";
    }
}

public class Custom_Exception_Rbi {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.start();
    }
}
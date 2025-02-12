package com.Oops;

class Plane{

    void fly(){
        System.out.println("com.Oops.Plane Flies");
    }
}

class CargoPlane extends Plane{
    @Override
    void fly() {
        System.out.println("com.Oops.CargoPlane Flies");
    }
    void carryCargo(){
        System.out.println("com.Oops.CargoPlane carries Goods");
    }
}
class PassengerPlane extends Plane{
    @Override
    void fly() {
        System.out.println("com.Oops.PassengerPlane Flies");
    }
    void carryPassenger(){
        System.out.println("com.Oops.PassengerPlane carries People");
    }
}
class FighterPlane extends Plane{
    @Override
    void fly() {
        System.out.println("com.Oops.FighterPlane Flies");
    }
    void carryWeapons(){
        System.out.println("com.Oops.FighterPlane carries Weapons");
    }
}

class Airport{
    public void permit(Plane ref){
        ref.fly();       
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {

        Plane ref;
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

//        ref=cp;
//        ref.fly();
////        ref.carryCargo();                 //Cannot direct access specializes methods by com.Oops.Parent reference
//        ((com.Oops.CargoPlane)ref).carryCargo();     //Can achieve polymorphism by Down casting the parent class
//        System.out.println();
//
//        ref=pp;
//        ref.fly();
//        ((com.Oops.PassengerPlane)ref).carryPassenger();
//        System.out.println();
//
//        ref=fp;
//        ref.fly();
//        ((com.Oops.FighterPlane)ref).carryWeapons();

        Airport a = new Airport();
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
    }
}

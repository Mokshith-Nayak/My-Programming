package com.Oops;

class Charger{
    private String brand;
    private float voltage;

    public Charger(String brand, float voltage){
        super();
        this.brand=brand;
        this.voltage=voltage;
    }

    public String getBrand() {
        return brand;
    }

    public float getVoltage() {
        return voltage;
    }
}
class Os{
    private String name;
    private int size;

    public Os(String name, int size) {
        super();
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}

/*  We don't have Keyword for Aggregation & composition like extends in com.Oops.Inheritance,
    Then we have to create our own LOGIC to Achieve ASSOCIATION
    (Together Composition(Has-A: Tightly Bond, Hence inside and created Object) and
    Aggregation(Has-A: Loosely Bond, Hence outside and created method))
    --> Inside com.Oops.Mobile class  */

class Mobile{
    //COMPOSITION(OS/Has-A)
    Os os = new Os("ANDROID",2);

    //AGGREGATION(charger/Has-A) - Have to achieve Encapsulation
    void hasA(Charger c){
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}


public class HasA1 {
    public static void main(String[] args) {

     Charger c = new Charger("SAMSUNG",12.5f);
     Mobile m = new Mobile();

     //com.Oops.Mobile is Not Lost
        System.out.println(m.os.getName());
        System.out.println(m.os.getSize());
//        m.hasA(c);

     //com.Oops.Mobile is Lost
        m=null;
//        System.out.println(m.os.getName());  //Now com.Oops.Mobile object is empty, and object without reference is collected by Garbage collector
//        System.out.println(m.os.getSize());  //But we can access com.Oops.Charger, as it is loosely bonded it can be accessed Directly.


        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}

package com.Oops;

class Human1{

    Heart1 heart = new Heart1(2.5f,65);

    Brain1 brain = new Brain1(1.6f,"Grey");

}
class Heart1{
    private float weight;
    private int bpm;

    public Heart1(float weight, int bpm) {
        super();
        this.weight = weight;
        this.bpm = bpm;
    }

    public float getWeight() {
        return weight;
    }

    public int getBpm() {
        return bpm;
    }
}
class Brain1{
    private float weight;
    private String colour;

    public Brain1(float weight, String colour) {
        super();
        this.weight = weight;
        this.colour = colour;
    }

    public float getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }
}
class Bike1{
    private String brand;
    private int milage;

    public Bike1(String brand, int milage) {
        super();
        this.brand = brand;
        this.milage = milage;
    }

    public String getBrand() {
        return brand;
    }

    public int getMilage() {
        return milage;
    }
}
class Books1{
    private String name;
    private String author;

    public Books1(String name, String author) {
        super();
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
class Student1 extends Human1{

    void hasA(Bike1 bike){
        System.out.println(bike.getBrand());
        System.out.println(bike.getMilage());
    }
    void hasA(Books1 books){
        System.out.println(books.getName());
        System.out.println(books.getAuthor());
    }
}

public class HasA_IsA {
    public static void main(String[] args) {

        Bike1 bike = new Bike1("Hero",55);
        Books1 books = new Books1("Merchant of Venice","Shekesphere");
        System.out.println();

        //Parent Class
        Human1 human = new Human1();
        System.out.println(human.heart.getWeight());
        System.out.println(human.heart.getBpm());
        System.out.println(human.brain.getWeight());
        System.out.println(human.brain.getColour());

        System.out.println();
        //Child Class
        Student1 st = new Student1();
        //Inherited
        System.out.println(st.heart.getWeight());
        System.out.println(st.heart.getBpm());
        System.out.println(st.brain.getWeight());
        System.out.println(st.brain.getColour());

        System.out.println();
        //Specialized and Has_A
        st.hasA(bike);
        st.hasA(books);

        human=null;
//        System.out.println(human.heart.getWeight());
//        System.out.println(human.heart.getBpm());
//        System.out.println(human.brain.getWeight());
//        System.out.println(human.brain.getColour());
//
        System.out.println();
        //Specialized and Has_A
        st.hasA(bike);
        st.hasA(books);
    }
}

package com.Oops;

class Heart{
    private float weight;
    private int bpm;

    public Heart(float weight, int bpm) {
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
class Brain{
    private float weight;
    private String colour;

    public Brain(float weight, String colour) {
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
class Bike{
    private String brand;
    private int milage;

    public Bike(String brand, int milage) {
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
class Book{
    private String name;
    private String author;

    public Book(String name, String author) {
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

class Student{
    Heart h = new Heart(0.3f,70);
    Brain b = new Brain(1.4f,"Grey");

    void hasBike(Bike b){
        System.out.println(b.getBrand());
        System.out.println(b.getMilage());
    }

    void hasBook(Book b){
        System.out.println(b.getName());
        System.out.println(b.getAuthor());
    }

}


public class HasA2 {
    public static void main(String[] args) {

        Bike bi = new Bike("HONDA",50);
        Book bo = new Book("JAVA","Kshithij");

        Student st = new Student();
        st.hasBike(bi);
        st.hasBook(bo);

        //Before st = null;
        System.out.println(st.h.getWeight());
        System.out.println(st.h.getBpm());

        System.out.println(st.b.getWeight());
        System.out.println(st.b.getColour());

        st=null;

//        System.out.println(st.h.getWeight());
//        System.out.println(st.h.getBpm());
//
//        System.out.println(st.b.getWeight());
//        System.out.println(st.b.getColour());

        System.out.println(bi.getBrand());
        System.out.println(bi.getMilage());

        System.out.println(bo.getName());
        System.out.println(bo.getAuthor());

    }
}
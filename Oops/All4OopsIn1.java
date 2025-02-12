package com.Oops;

import java.util.Scanner;

//Parent Class
abstract class Shape{
    float area;

    abstract void acceptInput();

    abstract void calcArea();

    void dispArea(){
        System.out.println(area);
    }
}
//Square class(Child)
class Square extends Shape{
   private float side;

    @Override
    void acceptInput(){
        System.out.println("SQUARE:");
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Side: ");
        side = scr.nextFloat();
    }

    @Override
    void calcArea(){
        area = side*side;
    }
}

//Rectangle class(Child)
class Rectangle extends Shape{
    private float length;
    private float breadth;

    @Override
    void acceptInput(){
        System.out.println("RECTANGLE:");
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = scr.nextFloat();
        System.out.print("Enter the breadth: ");
        breadth = scr.nextFloat();
    }

    @Override
    void calcArea(){
    area = length*breadth;
    }
}

//Circle class(Child)
class Circle extends Shape{
    private float radius;


    @Override
    void acceptInput(){
        System.out.println("CIRCLE:");
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        radius = scr.nextFloat();
    }

    @Override
    void calcArea(){
    area = (float)(Math.PI*Math.pow(radius,2));
    }
}

class Maths{

   public void geometry(Shape ref){
        ref.acceptInput();
        ref.calcArea();
        ref.dispArea();
    }
}

public class All4OopsIn1 {
    public static void main(String[] args) {

        Square s = new Square();

        Rectangle r = new Rectangle();

        Circle c = new Circle();

        //By Polymorphism
        Maths maths  = new Maths();
        maths.geometry(s);
        maths.geometry(r);
        maths.geometry(c);

    }
}

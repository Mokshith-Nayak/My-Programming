package com.Oops;

public class ComplexConstructor {
    public static void main(String[] args) {
        Complex c1 = new Complex(5,10);
        Complex c2 = new Complex(4,8);

        c1.print();
        c2.print();

        System.out.println("Adding 2 complex 1&2 variable: ");
        Complex c = c1.add(c2);
        c.print();
    } 
}
class Complex{
    int a;
    int b;

    public Complex(int real, int imaginary){
        a=real;
        b=imaginary;
    }
    void print(){
        System.out.println(a+" + "+b+"i");
    }
    Complex add(Complex num){
        return new Complex(a+num.a,b+num.b);

    }
}

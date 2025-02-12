package com.Oops;

abstract class Bird{

    abstract void eat();

    abstract void fly();
}

abstract class Eagle extends Bird{

    @Override
    void fly(){
        System.out.println("Eagle Flies at Greater Height");
    }
}

class SerpentEagle extends Eagle{

    @Override
    void eat(){
        System.out.println("SerpentEagle eats Snakes");
    }
}
class GoldenEagle extends Eagle{

    @Override
    void eat(){
        System.out.println("GoldenEagle eats Fishes");
    }
}

class Birdfamily{
    void method(Eagle ref){
        ref.eat();
        ref.fly();
    }
}

public class Abstract1 {
    public static void main(String[] args) {

        SerpentEagle s = new SerpentEagle();
        s.eat();
        s.fly();

        GoldenEagle g = new GoldenEagle();
        g.eat();
        g.fly();
        System.out.println();

        Birdfamily bf = new Birdfamily();
        bf.method(s);
        bf.method(g);
    }
}

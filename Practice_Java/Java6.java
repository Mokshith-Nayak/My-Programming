package com.Practice_Java;

public class Java6
{
    public static void main(String[] args)
    {
        Hello();
    }
    static void Hello()
    {
        Object[] animal= new Object[5];

        Dog dog = new Dog();
        dog.name = "1. Charlie";
        dog.price = 5000;
        dog.country = "China";
        dog.hight = 2.5f;
        animal[0] = dog;

        Cat cat = new Cat();
        cat.name = "Ruby";
        cat.price = 2000;
        cat.country = "USA";
        cat.hight = 1.5f;
        animal[1] = cat;

        Elephant elephant = new Elephant();
        elephant.name = "Bhima";
        elephant.price = 500000;
        elephant.country = "India";
        elephant.hight = 9f;
        animal[2] = elephant;

        Tiger tiger = new Tiger();
        tiger.name = "Royal";
        tiger.price = 5000000;
        tiger.country = "Africa";
        tiger.hight = 4.5f;
        animal[3] = tiger;

        Lion lion = new Lion();
        lion.name = "King";
        lion.price = 450000;
        lion.country = "India";
        lion.hight = 4.3f;
        animal[4] = lion;

        for(int i = 0 ; i < animal.length ; i++)
        {
            System.out.println(((Animal) animal[i]).details());
            System.out.println("----------");
        }
        System.out.println("------END------");
    }
}
class Animal
{
    String name;
    int price;
    String country;
    float hight;

    String details()
    {
        return "";
    }
}

class Dog extends Animal
{
    @Override
    String details() {
        return name+"\n"+price+"\n"+country+"\n"+hight;
    }
}
class Cat extends Animal
{
    String details() {
        return name+"\n"+price+"\n"+country+"\n"+hight;
    }
}
class Elephant extends Animal
{
    String details() {
        return name+"\n"+price+"\n"+country+"\n"+hight;
    }
}
class Tiger extends Animal
{
    String details() {
        return name+"\n"+price+"\n"+country+"\n"+hight;
    }
}
class Lion extends Animal
{
    String details() {
        return name+"\n"+price+"\n"+country+"\n"+hight;
    }
}


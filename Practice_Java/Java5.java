package com.Practice_Java;

class Dogs
{
    String name;
    float price;
    String breed;

    String all()
    {
        return name + "\n" + price + "\n" + breed;
    }
}
class Cats
{
    String name;
    float price;
    String breed;

    String all()
    {
        return name + "\n" + price + "\n" + breed;
    }
}
class Monkey
{
    String name;
    float price;
    String breed;

    String all()
    {
        return name + "\n" + price + "\n" + breed;
    }
}


public class Java5 {
    public static void main(String[] args)
    {
        call();
        call();
    }
    static void call()
    {
        Dogs[] dog = new Dogs[1];

        dog[0] = new Dogs();

        dog[0].name = "John";
        dog[0].price = 12.5f;
        dog[0].breed = "Pug";
        //2
        Cats[] cat = new Cats[1];
        cat[0] = new Cats();

        cat[0].name = "Borax ";
        cat[0].price = 5;
        cat[0].breed = "African";
        //3
        Monkey[] monkey = new Monkey[1];
        monkey[0] = new Monkey();

        monkey[0].name = "wat";
        monkey[0].price = 8.9f;
        monkey[0].breed = "American";

        for (int i = 0; i < dog.length; i++)
        {
            System.out.println(dog[i].all());
            System.out.println();
        }
        for (int i = 0; i < cat.length; i++)
        {
            System.out.println(cat[i].all());
            System.out.println();
        }
        for (int i = 0; i < monkey.length; i++)
        {
            System.out.println(monkey[i].all());
            System.out.println();
        }
        System.out.println("-------------");
    }
}
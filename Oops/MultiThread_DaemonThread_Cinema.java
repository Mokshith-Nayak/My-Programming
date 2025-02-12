package com.Oops;

//Primary Thread1
class Hero extends Thread{
    @Override
    public void run(){


        try{
            MakeupArtist ma = new MakeupArtist();
            LightBoy lb = new LightBoy();

            ma.setName("MakeupArtist");
            lb.setName("Light");

             ma.setDaemon(true);
            lb.setDaemon(true);

            ma.start();
            lb.start();

            System.out.println("Hero Goes to Film Set");
            sleep(3000);
            System.out.println("Hero Eats Food");
            sleep(3000);
            System.out.println("Hero Dress-Up");
            sleep(3000);
            System.out.println("Hero Acts");
            sleep(3000);
            System.out.println("Hero return Home");

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
//Primary Thread2
class Heroine extends Thread{
    @Override
    public void run(){

        try{
            MakeupArtist ma = new MakeupArtist();
            LightBoy lb = new LightBoy();

            ma.setName("MakeupArtist");
            lb.setName("Light");

            ma.setDaemon(true);
            lb.setDaemon(true);

            ma.start();
            lb.start();

            System.out.println("Heroine Goes to Film Set");
            sleep(3000);
            System.out.println("Heroine Eats Food");
            sleep(3000);
            System.out.println("Heroine Dress-Up");
            sleep(3000);
            System.out.println("Heroine Acts");
            sleep(3000);
            System.out.println("Heroine return Home");

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
//Daemon Thread1
class MakeupArtist extends Thread{
    @Override
    public void run(){

       for( ; ; ){
           try{
               System.out.println("MakeupArtist will be in Film Set");
               sleep(3000);

           }
           catch(Exception e){
               e.printStackTrace();
           }
       }
    }
}
//Daemon Thread2
class LightBoy extends Thread{
    @Override
    public void run(){

        for( ; ; ){
            try{
                System.out.println("LightBoy will be in Film Set");
                sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}


public class MultiThread_DaemonThread_Cinema {
    public static void main(String[] args) {

        Hero hero = new Hero();
        Heroine heroine = new Heroine();

        hero.setName("Hero");
        heroine.setName("Heroine");

        hero.start();
        heroine.start();

    }
}

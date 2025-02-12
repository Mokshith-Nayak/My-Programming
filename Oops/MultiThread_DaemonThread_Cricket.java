package com.Oops;

//Primary Thread
class Rohit extends Thread{
    @Override
    public void run(){

        try{

            BattingCoach bac = new BattingCoach();
            BowlingCoach boc = new BowlingCoach();

            bac.setName("Bac");
            boc.setName("Boc");

            bac.setDaemon(true);
            boc.setDaemon(true);

            bac.start();
            boc.start();

            System.out.println("Rohit enters the GROUND");
            sleep(3000);
            System.out.println("Rohit will do WARM-UP");
            sleep(3000);
            System.out.println("Rohit will do Catching PRACTICE");
            sleep(3000);
            System.out.println("Rohit will do Bowling PRACTICE");
            sleep(3000);
            System.out.println("Rohit will do Batting PRACTICE");
            sleep(3000);
            System.out.println("Rohit will go back to HOTEL");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

//Daemon Thread
class BattingCoach extends Thread{
    @Override
    public void run(){
        for( ; ; ){
            try{
            System.out.println("BattingCoach will be in Ground");
            sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

//Daemon Thread
class BowlingCoach extends Thread{
    @Override
    public void run(){
        for( ; ; ){
            try{
                System.out.println("BowlingCoach will be in Ground");
                sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}


public class MultiThread_DaemonThread_Cricket {
    public static void main(String[] args) {

        Rohit r = new Rohit();
        r.setName("Rohit");
        r.start();

    }
}

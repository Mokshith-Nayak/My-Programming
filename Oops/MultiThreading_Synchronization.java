package com.Oops;

class BathRoom{

    synchronized void bathRoom(){
        try{
            System.out.println(Thread.currentThread().getName()+" Has Entered the BathRoom");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is Using the BathRoom");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" has Left the BathRoom");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Boy extends Thread{

    private BathRoom ba;

    Boy(BathRoom ba){
        this.ba = ba;
    }

    @Override
    public void run(){
        ba.bathRoom();
    }
}

class Girl extends Thread{

    private BathRoom ba;

    Girl(BathRoom ba){
        this.ba = ba;
    }
    @Override
    public void run(){
        ba.bathRoom();
    }
}

class Others extends Thread{

    private BathRoom ba;

    Others(BathRoom ba){
        this.ba = ba;
    }
    @Override
    public void run(){
        ba.bathRoom();
    }
}

public class MultiThreading_Synchronization {
    public static void main(String[] args) {

        BathRoom ba = new BathRoom();

        Boy boy = new Boy(ba);
        Girl girl = new Girl(ba);
        Others others = new Others(ba);

        boy.setName("Boy");
        girl.setName("Girl");
        others.setName("Other");

        boy.start();
        girl.start();
        others.start();

    }
}

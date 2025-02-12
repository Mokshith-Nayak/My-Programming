package com.Oops;

class BathRoom1{

    void bathRoom(){
        try{
            System.out.println(Thread.currentThread().getName()+" Has Entered the BathRoom(1)");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" locked the BathRoom(2)");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" is Using the BathRoom(3)");
            Thread.sleep(3000);
           synchronized (this){
               System.out.println(Thread.currentThread().getName()+" finished using BathRoom(4)");
               Thread.sleep(3000);
               System.out.println(Thread.currentThread().getName()+" has Left the BathRoom(5)");
           }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Boy1 extends Thread{

    private BathRoom1 ba;

    Boy1(BathRoom1 ba){
        this.ba = ba;
    }

    @Override
    public void run(){
        ba.bathRoom();
    }
}

class Girl1 extends Thread{

    private BathRoom1 ba;

    Girl1(BathRoom1 ba){
        this.ba = ba;
    }
    @Override
    public void run(){
        ba.bathRoom();
    }
}

class Others1 extends Thread{

    private BathRoom1 ba;

    Others1(BathRoom1 ba){
        this.ba = ba;
    }
    @Override
    public void run(){
        ba.bathRoom();
    }
}

public class MultiThreading_SynchronizationBlock_this {
    public static void main(String[] args) {

        BathRoom1 ba = new BathRoom1();

        Boy1 boy = new Boy1(ba);
        Girl1 girl = new Girl1(ba);
        Others1 others = new Others1(ba);

        boy.setName("Boy");
        girl.setName("Girl");
        others.setName("Other");

        boy.start();
        girl.start();
        others.start();

    }
}

package com.Oops;

class Warrior extends Thread{
    String res1 = "Brahmastra";
    String res2 = "Sarpastra";
    String res3 = "Pashupatastra";

    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("Arjuna")){
            arjuna();
        }
        else{
            karna();
        }
    }

    public void arjuna(){
       try{
           Thread.sleep(3000);
           synchronized (res1){
               System.out.println("Arjuna acquired "+ res1);
               Thread.sleep(3000);
               synchronized (res2){
                   System.out.println("Arjuna acquired "+ res2);
                   Thread.sleep(3000);
                   synchronized (res3){
                       System.out.println("Arjuna acquired "+ res3);
                   }
               }
           }
       }
       catch(Exception e){
            e.printStackTrace();
       }
    }

//    public void karna(){
//        try{
//            Thread.sleep(3000);
//            synchronized (res1){
//                System.out.println("Karna acquired "+ res1);
//                Thread.sleep(3000);
//                synchronized (res2){
//                    System.out.println("Karna acquired "+ res2);
//                    Thread.sleep(3000);
//                    synchronized (res3){
//                        System.out.println("Karna acquired "+ res3);
//                    }
//                }
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }

    //Dead lock
    public void karna(){
        try{
            Thread.sleep(3000);
            synchronized (res3){
                System.out.println("Karna acquired "+ res3);
                Thread.sleep(3000);
                synchronized (res2){
                    System.out.println("Karna acquired "+ res2);
                    Thread.sleep(3000);
                    synchronized (res1){
                        System.out.println("Karna acquired "+ res1);
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


public class MultiTreading_statesOfThread_DeadLock{
    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior();

        w1.setName("Arjuna");
        w2.setName("Karna");

        w1.start();
        w2.start();

    }
}

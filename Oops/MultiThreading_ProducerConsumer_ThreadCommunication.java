package com.Oops;

class Queue1{
    private int data;
    private boolean dataIsPresent = false;

//Only with synchronized keyword (in method/block) notify() and wait() will work : Object class Methods
    public synchronized void setData(int data){
        if(!dataIsPresent){  // if(dataIsPresent == false)
            this.data=data;
            System.out.println("Producer produced the Value "+data);
            dataIsPresent = true;
            notify();
        }else{
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void getData(){
        if(dataIsPresent){
            System.out.println("Consumer consumed the Value "+data);
            dataIsPresent = false;
            notify();
        }else{
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer1 extends Thread{
    Queue1 q;

    public Producer1(Queue1 q){
        this.q=q;
    }

    @Override
    public void run(){
        int i=1;
        for( ; ; ){
            q.setData(i++);
        }
    }
}
class Consumer1 extends Thread{
    Queue1 q;

    public Consumer1(Queue1 q){
        this.q=q;
    }

    @Override
    public void run(){

        for( ; ; ){
            q.getData();
        }
    }
}

public class MultiThreading_ProducerConsumer_ThreadCommunication {
    public static void main(String[] args) {

        Queue1 q = new Queue1();

        Producer1 p = new Producer1(q);
        Consumer1 c = new Consumer1(q);

        p.start();
        c.start();

    }
}

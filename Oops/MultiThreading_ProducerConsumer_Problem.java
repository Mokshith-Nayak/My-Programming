package com.Oops;

class Queue{
    private int data;

    public void setData(int data){
        this.data=data;
        System.out.println("Producer produced the Value "+data);
    }

    public void getData(){
        System.out.println("Consumer consumed the Value "+data);
    }
}

class Producer extends Thread{
    Queue q;

    public Producer(Queue q){
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
class Consumer extends Thread{
    Queue q;

    public Consumer(Queue q){
        this.q=q;
    }

    @Override
    public void run(){

        for( ; ; ){
        q.getData();
        }
    }
}

public class MultiThreading_ProducerConsumer_Problem {
    public static void main(String[] args) {

        Queue q = new Queue();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();

    }
}

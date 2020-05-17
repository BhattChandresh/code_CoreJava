package com.practice.java.ProduceConsumer;

import java.util.ArrayList;
import java.util.Random;

public class Producer implements Runnable {

    private int  SIZE;
    private ArrayList<Integer> buffer;
    Random randomNo = new Random();

    Producer() {
        System.out.println("No Args Constructor");
    }

    Producer(ArrayList<Integer> buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
        if(App.isDebug) {
            System.out.println("Producer buffer Value");
            for(int i=0;i<buffer.size();i++) {
                System.out.println(buffer.get(i));
            }
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                produce(randomNo.nextInt(100));
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public void produce(int i) throws InterruptedException  {
       // If buffer is full, then this thread enters into the wait state.
        while(buffer.size() >= SIZE) {
            synchronized (buffer) {
                System.out.println("Buffer is full " + Thread.currentThread().getName() + " is waiting and total size =" + buffer.size());
                buffer.wait();
            }
        }

        // Add the element and notify the consumer thread.
        synchronized (buffer) {
            buffer.add(i);
            System.out.println("produced no is : " + i);
            System.out.println("Buffer size = "+ buffer.size());
            buffer.notify();
            Thread.sleep(100);
        }
    }
}

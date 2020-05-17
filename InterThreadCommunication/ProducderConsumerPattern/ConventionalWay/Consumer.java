package com.practice.java.ProduceConsumer;

import java.util.ArrayList;

public class Consumer implements Runnable {
    private int SIZE;
    private ArrayList<Integer> buffer;

    Consumer() {
        System.out.println("Consumer No args Constructor");
    }

    Consumer(ArrayList<Integer> buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
        if(App.isDebug) {
            System.out.println("Consumer Buffer Value");
            for(int i=0;i < buffer.size();i++) {
                System.out.println(buffer.get(i));
            }
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                consume();
                Thread.sleep(200);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public  void consume() throws InterruptedException {
        // If buffer is empty then consumer thread enters into waiting state.
        while(buffer.isEmpty()) {
            synchronized (buffer) {
                System.out.println("Buffer is Empty " + Thread.currentThread().getName() + " is waiting, size = " + buffer.size());
                buffer.wait();
            }
        }

        // If buffer is not full, then consume the element and notify producer thread.
        synchronized (buffer) {
            buffer.notify();
            int element = buffer.remove(0);
            System.out.println("Consumed element is = " + element);
            System.out.println("Buffer size = " + buffer.size());
        }
    }
}

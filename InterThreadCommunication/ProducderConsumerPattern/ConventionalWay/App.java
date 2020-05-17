/**
 *  Producer-Consumer pattern.
 *  References :
 *  https://www.java67.com/2012/12/producer-consumer-problem-with-wait-and-notify-example.html
 *  https://medium.com/@mr.anmolsehgal/multi-threading-basics-in-java-f1edf978f7fb
 */
package com.practice.java.ProduceConsumer;

import java.util.ArrayList;

public class App {
    static boolean isDebug = false;
    public static void main(String[] args) {
        final int SIZE = 10;
        ArrayList<Integer> buffer = new ArrayList<>(SIZE);

        Thread producer = new Thread(new Producer(buffer, SIZE), "Producer Thread");
        Thread consumer = new Thread(new Consumer(buffer,SIZE), "Consumer Thread");

        producer.start();
        consumer.start();
    }
}

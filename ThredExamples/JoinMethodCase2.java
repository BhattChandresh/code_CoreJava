/**
 * Reference : Durga Software Solutions.
 */

package com.practice.java;

public class JoinMethodCase2 {
    public static void main(String[] args) {
        JoinThread2 jt = new JoinThread2();
        Thread t = new Thread(jt);
        JoinThread2.mt = Thread.currentThread();
        t.start();
        for(int i=0;i < 10;i++) {
            System.out.println("Main Thread....");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class JoinThread2 implements Runnable {
    static Thread mt;
    @Override
    public void run() {
        try {
            mt.join();
            for(int i=0; i< 10;i++) {
                System.out.println("Chiild thread.....");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

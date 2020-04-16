/**
 * Reference : Durga Software Solutions.
 * If a thread wants to wait until completing some other thread then use join() method.
 * Example:
 * There  are two threads t1 and t2.
 * t1 wants to use the output of t2. In other words t1 is dependent on output of t2.
 * hence  a thread t1 wants to wait until completing t2 then t1 has to call
 * t2.join()
 * If t1 executes t2.join() then immediately t1 will be entering into waiting state until t2 completes.
 * Once t2 completes then t1 can continue its execution.
 *
 * syntax : public final void join() throws InterruptedException
 *               public final void join(long ms) throws InterruptedException
 *               public final void join(long ms) throws InterruptedException
 *
 */
package com.practice.java;

import java.util.concurrent.ThreadLocalRandom;

public class JoinMethodCase1 {
    public static void main(String[] args) throws InterruptedException{
        JoinThread jt = new JoinThread();
        Thread t = new Thread(jt);
        t.start();
        t.join();  // Since main thread has called the join method so main thread will entered into waiting state until join thread completed.
        for(int i=0;i<10;i++) {
            System.out.println("Main thread.....");
        }
    }
}

class JoinThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i < 10;i++) {
            System.out.println("Child Thread = JoinThread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

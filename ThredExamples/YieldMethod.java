/**
 *  Reference : Durga Software Solutions.
 *
 * yield() method  pause current executing thread to give the chance to waiting threads of same priority.
 *  If there is no waiting thread or all waiting threads have low priority then same thread can
 *  continue it's execution.
 *
 *  syntax : public static [native] void yield();
 *
 *  When current executing thread calls yield method then thread state changed from
 *  Running to Runnable/Ready.
 *
 */


package com.practice.java;

public class YieldMethod {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for(int i=0;i<100;i++){
            System.out.println((i+1) + " - Main Thread");
            Thread.yield();
        }
    }
}

class MyThread extends  Thread {

    @Override
    public void run() {
        super.run();
        for(int i=0;i<100;i++){
            System.out.println((i+1) + " - Child Thread");
            Thread.yield();
        }
    }
}

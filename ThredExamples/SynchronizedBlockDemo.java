package com.practice.java;

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        DisplaySyncBlock d = new DisplaySyncBlock();
        Thread t1 = new Thread(new ThreadSyncBlock(d, "Dhoni"));
        Thread t2 = new Thread(new ThreadSyncBlock(d, "Virat"));
        t1.start();
        t2.start();
    }
}


class DisplaySyncBlock {
     public void wish(String name) {
         // Assume some code is here
         synchronized (this) {
             for(int i=0; i< 10;i++) {
                 System.out.println();
                 System.out.print("Good Morning :");
                 try {
                     Thread.sleep(500);
                 } catch (InterruptedException e) {
                     System.out.println(e.getStackTrace());
                 }
                 System.out.print(name);
             }
         }
         //Assume some code here as well
     }
}

class ThreadSyncBlock implements Runnable {
    DisplaySyncBlock d;
    String name;

    ThreadSyncBlock(DisplaySyncBlock d, String name) {
        this.d =d;
        this.name = name;
    }
    @Override
    public void run() {
        d.wish(name);
    }
}
package com.practice.java;

public class SynchronizationPart2 {
    public static void main(String[] args) {
        Display_2 d1 = new Display_2();
        Display_2 d2 = new Display_2();
        Thread t1 = new Thread(new SyncThread_2(d1, "dhoni"));
        Thread t2 = new Thread(new SyncThread_2(d2, "Sachin"));
        t1.start();
        t2.start();
     }
}

class Display_2
{
    public static synchronized void wish(String name) {
        for(int i=0; i<5; i++) {
            System.out.println("Good Morning : ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getStackTrace());
            }
            System.out.println(name);
        }
    }
}

class SyncThread_2 implements Runnable {
    Display_2 d;
    String name;
    public SyncThread_2(Display_2 d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
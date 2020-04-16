package com.practice.java;

public class DeadLockWithMainThread {
    public static void main(String[] args) {
        System.out.println("This is main thread and it is going to enter into dead lock");
        try {
            Thread.currentThread().join();
        }
        catch (InterruptedException e) {

        }
        System.out.println("Waiting to execute this statement");
    }
}

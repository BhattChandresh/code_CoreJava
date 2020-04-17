/**
 *  Reference : Durga Software Solutions.
 *   NOTE :
 *   - Two or more threads can communicate with each other using wait(),notify() and notifyAll() methods.
 *   - wait(),notify(), notifyAll() methods are the members of Object class.
 *   - After calling wait() method (thread which expects the updation from another thread calls the wait() method)
 *    thread releases the lock and then immediately enters into the waiting state.
 *   - After completing the work thread which provides the updation notifies the another thread by calling notify() or notifyAll() methods
 *     but it may not immediately releases the lock.
 *   - In order to call the wait(),notify() and notifyAll() method, thread must be the owner of the object meaning it must acquire the lock of that
 *   object otherwise Exception IillegalMonitorStateException will be thrown.
 */
package com.practice.java;

public class InterThreadCommunicationDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadA ta = new ThreadA();
        Thread child = new Thread(ta);
        child.start();
        synchronized(child) {
            child.wait(); // main thread enters into waiting state because it calls wait method on child object.
        }
        System.out.println(ta.total);
    }
}

class ThreadA implements   Runnable {
    int total = 0;
    @Override
    public void run() {
        synchronized (this) {
            for(int i=1;i <=100;i++) {
                total += i;
            }
            this.notify(); // After completing calculation child thread gives notification to main thread to resume.
        }
    }
}

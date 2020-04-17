/**Reference : Durga Software Solutions.
 * synchronized is modifier which is  only applicable to methods and not applicable to class or variable.
 *  If method or block is declared as synchronized then only one thread is allowed to executed the method on given object.
 *  Every object in Java has a unique lock.
 *  In order to check the effect,
 *   declare the method wish()  synchronized, run the code and check the result.
 *   declare the method wish() normal method, run the code and check the result.
 */
package com.practice.java;

public class SynchronizationPart1 {
    public static void main(String[] args) {
       Display d = new Display();
       Thread t1 = new Thread(new SyncThread_1(d, "dhoni"));
       Thread t2 = new Thread(new SyncThread_1(d, "Sachin"));
       Thread t3 = new Thread(new SyncThread_1(d, "Virat"));
       Thread t4 = new Thread(new SyncThread_1(d, "Rohit"));

       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }
 }

class Display
{
    public synchronized void wish(String name) {
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

class SyncThread_1 implements Runnable {
    Display d;
    String name;

    public SyncThread_1() {

    }

    public SyncThread_1(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
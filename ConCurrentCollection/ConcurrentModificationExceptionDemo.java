/**
 *  ConcurrentModificationException demonstration.
 *  In normal collection when one thread is iterating over the  traditional collection of objects and if other thread
 *  tries to modify (update, delete, add) the underlying collection then concurrentmodificationException
 *  throws.
 *
 *  In order to overcome this problem of traditional collection objects we need to use concurrent collection.
 *
 *  Below are the list of concurrent collection
 *
 *  <1> ConcurrentHashMap
 *  <2> CopyOnWriteArrayList
 *  <3> CopyOnWriteArraySet
 *
 *  Reference : Durga Software Solutions
 */
package com.practice.java.ConcurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceptionDemo {
    static ArrayList<String> al = new ArrayList<>();
    public static void main(String[] args) {
        al.add("A");
        al.add("B");
        al.add("C");
        Thread t = new Thread(new MyThread1());
        t.start();
        Iterator it = al.iterator();
        while(it.hasNext()) {
            String s1 = (String) it.next();
            System.out.println("Main thread is iterating and current object is : " + s1);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException ie) {

            }
            System.out.println(al);
        }
    }
}

class MyThread1 implements  Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {

        }
        System.out.println("Child thread updating the list");
        ConcurrentModificationExceptionDemo.al.add("D");
    }
}

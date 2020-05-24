/**
 *  ConcurrentModificationException demonstration.
 *  In normal collection when one thread is iterating over the  traditional collection of objects and if other thread
 *  tries to modify (update, delete, add) the underlying collection then ConCurrentModificationException
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

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 {
    static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer, String>();
    public static void main(String[] args) {
        chm.putIfAbsent(1001,"AA");
        chm.putIfAbsent(1002,"BB");
        chm.putIfAbsent(1003,"CC");
        Thread t = new Thread(new MyThread2());
        t.start();
        Set s1 = chm.keySet();
        Iterator it = s1.iterator();
        while(it.hasNext()) {
            Integer i1 = (Integer) it.next();
            System.out.println("Main thread is iterating and current object is : " + i1);
            try{
                Thread.sleep(5000);
            } catch (InterruptedException ie) {

            }
        }
        System.out.println(chm);
    }
}

class MyThread2 implements  Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {

        }
        System.out.println("Child thread updating the list");
        ConcurrentHashMapDemo2.chm.putIfAbsent(1004,"DD");
    }
}
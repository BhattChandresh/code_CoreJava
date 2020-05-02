/**
 * The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
 *  Implementation :
 *   - Lazy Instantiation
 *   - Eagar Instantiation
 *   - Thread Safe
 *   - Double Locking mechanism
 */


package com.practice.java.SingleTon;

public class SingleTonDemo {
    public static void main(String[] args) {

        //Lazy Instantiation -- Demo
        System.out.println("Lazy Instantiation Demo");
        SingleTonLazyEval.getInstance();
        SingleTonLazyEval.getInstance();
        System.out.println("*************************************************");

        //Eager Instantiation -- Demo
        System.out.println("Eager Instantiation Demo");
        SingleTonEagerEval.getInstance();
        SingleTonEagerEval.getInstance();
        System.out.println("########################################");

        //Thread-Safte Lazy Instantiation -- Demo
        System.out.println("Thread Safe Lazy Instantiation Demo");
        SingleTonSync.getInstance();
        SingleTonSync.getInstance();
        System.out.println("########################################");

        //Double Checking Lock  -- Demo
        System.out.println("Double Checking Lock Lazy Instantiation Demo");
        SingleTonDblChkLock.getInstance();
        SingleTonDblChkLock.getInstance();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}

/**
 *  Method-1
 *  Lazy Instantiation
 */
class SingleTonLazyEval {
    private static SingleTonLazyEval singleTonInstance;
    private SingleTonLazyEval() {
        System.out.println("Lazy Instantiation CTOR");
    }
    public static SingleTonLazyEval getInstance() {
        System.out.println("----------------------------------------------------------------------");
        if(singleTonInstance == null) {
            System.out.println("Creating SingleTon Instance because it is called");
            singleTonInstance = new SingleTonLazyEval();
        }
        System.out.println("Returning SingleTon Instance.");
        return singleTonInstance;
    }
}

/**
 *  Method-2
 *  Eager Instantiation
 */
class SingleTonEagerEval{
    private static SingleTonEagerEval singleTonInstace = new SingleTonEagerEval();
    private SingleTonEagerEval() {
        System.out.println("Eager Instantiation CTOR");
    }
    public static SingleTonEagerEval getInstance() {
        System.out.println("*************************************************");
        System.out.println("Retuning Eagerly Instantiated SingleTon Instance");
        return singleTonInstace;
     }
}


/**
 *  Method-3
 *  Thread-Safte Lazy Instantiation
 */
class SingleTonSync{
    private static SingleTonSync singleTonInstance;
    private SingleTonSync() {
        System.out.println("Thread-safe Lazy Instantiation CTOR");
    }
    public static synchronized SingleTonSync getInstance() {
        if(singleTonInstance == null){
            System.out.println("Creating thread safe SingleTon Instance");
            singleTonInstance = new SingleTonSync();
            System.out.println("##########################################");
        }
        System.out.println("Returning Thread Safe SingleTon Instance");
        return singleTonInstance;
    }
}

/**
 *  Method-4
 *  Thread-Safte Lazy Instantiation
 */
class SingleTonDblChkLock {
    private volatile static SingleTonDblChkLock singleTonInstance;
    private SingleTonDblChkLock() {
        System.out.println("Creating SingleTon Double Check Locking CTOR");
    }
    public static SingleTonDblChkLock getInstance() {
        if(singleTonInstance == null) {
            synchronized (SingleTonDblChkLock.class) {
                if(singleTonInstance == null) {
                    System.out.println("Creating SingleTon Instance With Double Lock mechanisem");
                    singleTonInstance = new SingleTonDblChkLock();
                }
            }
        }
        return singleTonInstance;
    }
}
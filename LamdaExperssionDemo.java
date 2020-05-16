/**
 *  Lamda Expression Demo.
 *  Theory:
 *  Lamda Expression can be implemented using functional interface.
 *  Functional interface is an interface which has one and only one abstract method.
 *  Way to implement lamda expression:
 *  say you have method  add which adds 5 to given number as shown in example.
 *  Ex. public  int add(int i){
 *     i = i+5
 *     System.out.println(i);
 *  }
 *
 *  How to implement lamda expression for this.
 *
 *  1. first remove the modifier public and add '->' between method argument and method body.
 *     Ex.  int add(int i) { body of the method }
 *
 *  2. remove the return type
 *     Ex. add(int i) ->  { body of the method }
 *
 *  3. remove the method name
 *      (int i) -> { i = i+5; System.out.println(i);};
 *
 *  4. remove the data type from method argument.
 *  (i) -> {
 *      i = i+5;
 *      System.out.println(i);
 *  }
 *
 *
 */

package com.practice.java;

public class LamdaExperssionDemo {
    public static void main(String[] args) {

        // Lamda Implementation for addFive functional interface.
        addFive a = (i) -> {
            i = i+5;
            System.out.println(i);
        };
        a.add(5);

        //Lamda implementation for  printMessage functional interface
        printMessage prt = () -> System.out.println("This is the message");
        prt.printMsg();
    }
}

@FunctionalInterface
interface printMessage {
    public abstract void printMsg();
}

@FunctionalInterface
interface addFive {
    public abstract void add(int i);
}


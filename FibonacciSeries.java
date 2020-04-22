/**
 * Calculate Fibonacci Series in Java.
 * Fibonacci series is series of natural number where next number is equivalent to the sum of previous two number.
 * fn = fn-1 + fn-2.
 * The first two numbers of Fibonacci series is always 1, 1.
 * First 10 numbers in fibonacci series are:
 *
 * 1 1 2 3 5 8 13 21 34 55
 */
package com.practice.java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int count = s.nextInt();
        s.close();
        fibonacci(count);
    }

    public static void fibonacci(int count) {
        int prevNo = 0;
        int nextNo = 1;
        int fib = 0;
        System.out.println("First " + count + " fibonacci numbers are :");
        for(int i=1; i <= count;i++){
            fib = prevNo + nextNo;
            prevNo = nextNo;
            nextNo = fib;
            System.out.print(prevNo + " ");
        }
    }
}

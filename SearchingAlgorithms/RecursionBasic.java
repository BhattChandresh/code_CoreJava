package com.practice.java;

public class RecursionBasic {
    public static void main(String[] args) {
        reduceByOne(10);
    }

    public  static void reduceByOne(int n) {
        //Defined the BaseCase here.
        if(n >= 0)
            reduceByOne(n-1);
        System.out.println("Completed call " + n);
    }
}

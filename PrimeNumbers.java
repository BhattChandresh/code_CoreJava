package com.practice.java;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumbers {
    public static void main(String[] args) {
        boolean isPrime = true;
        int maxCheck = 1000;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=2;i < maxCheck;i++) {
            isPrime = checkPrime(i);
            if(isPrime) {
                al.add(i);
            }
        }
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + ",");
        }
    }

    static boolean checkPrime(int number) {
        for(int i=2 ; i <= number/2;i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}

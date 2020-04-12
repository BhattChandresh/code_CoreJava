package com.practice.java;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();
        scan   .close();
        long result = reverse(input);
        System.out.println("Reversed Integer is : " + result);
    }

    public static long reverse(long x) {
        long m = 0;
        long result = 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }
        String str = Long.toString(x);
        int power = str.length()-1;
        for(int index =0;index < str.length();index++ ) {
            m = x % 10;
            x = x / 10;
            result = result + (m * (long) Math.pow(10,power));
            power -= 1;
        }
        if(isNegative) {
            result = -result;
            isNegative = false;
        }
        return result;
    }
}

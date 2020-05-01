/**
 * Check if the given number is Armstrong Number in Java.
 * In an Armstrong number (also known as narcissistic number),
 * is a number that is the sum of its own digits each raised to the power of the number of digits.
 *
 * xy...z = x^n + y^n + ... + z^n
 * where n is the number of digits in a number.
 * Examples :
 * Few examples are: 153, 371, 407, 8208,1634 etc.
 *
 * 153 = 13 + 53 + 33
 * 8208 = 84 + 24 + 04 + 84
 */
package com.practice.java;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        sc.close();
        int armStrongNo = armStrongNumber(number);
        System.out.println("Input is = " + number);
        System.out.println("Output is = " + armStrongNo);
        if(number == armStrongNo)
            System.out.println("The given number is ArmStrong number.");
        else
            System.out.println("The given number is not ArmStrong number.");
    }

    public static int armStrongNumber(int number) {
        String str = Integer.toString(number);
        int result = 0;
        int temp = 0;
        int len = str.length();
        while (number > 0){
                   temp = number % 10;
                   result = result + (int) Math.pow(temp,len);
                   number = number / 10;
        }
        return result;
    }
}

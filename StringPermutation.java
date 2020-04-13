/**
 * Cracking the Coding Interview.
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 */
package com.practice.java;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();
        sc.close();
        permutationString(str1,str2);
    }

    static void permutationString(String testStr1, String testStr2) {

        boolean isPermutation = true;
        //First check the length of both the string. If the length of  both the String
        // are not equal then Safely we can say that no permuation relation between the two
        int len1 = testStr1.length();
        int len2 = testStr2.length();
        if(len1 != len2){
            System.out.println("$ Given Strings have not permutation relationship");
            return;
        }

        char[] c1 = testStr1.toCharArray();
        char[] c2 = testStr1.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int index=0;index < c1.length;index++) {
            if(c1[index] != c2[index]) {
                isPermutation = false;
                break;
            }
        }
        if(isPermutation)
            System.out.println("# Given Strings have permutation relationship");
        else
            System.out.println("$ Given Strings have not permutation relationship");


//        if(c1.equals(c2))
//            System.out.println("# Given Strings have permutation relationship");
//        else
//            System.out.println("$ Given Strings have not permutation relationship");
    }
}

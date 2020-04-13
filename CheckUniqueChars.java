/**
 * Cracking the Coding Interview.
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 *
 * Algorithm without any data structrue to be developed.
 *
 */

package com.practice.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckUniqueChars {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        //checkUniqueCharInString_1(str);
        checkUniqueCharInString_2(str);
    }

    //Method - 1
    static void checkUniqueCharInString_1(String testStr) {
        int length = testStr.length();
        char[] c = testStr.toCharArray();
        Set<Character> set = new HashSet<Character>();
        for(int index=0;index < c.length;index++) {
            set.add(c[index]);
        }

        if(set.size() == length)
            System.out.println("# All the characters in string are uniform");
        else
            System.out.println("$ All the characters in string are not uniform");
    }

    //Method - 2
    // Assumption is string is ASCII
    static void checkUniqueCharInString_2(String testStr) {
       boolean uniqueChar = true;
       boolean[] char_set = new boolean[128];
       for(int i=0;i < testStr.length();i++) {
           int val = testStr.charAt(i);
           if(char_set[val])
                    uniqueChar = false;
           char_set[val] = true;
       }
       if(uniqueChar == true)
           System.out.println("# All the characters in string are uniform");
       else
           System.out.println("$ All the characters in string are not uniform");
    }
}

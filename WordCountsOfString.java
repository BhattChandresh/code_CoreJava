/**
 * Below program demonstrate to count the no of words in String.
 */
package com.practice.java;

import java.util.HashMap;
import java.util.Scanner;

public class WordCountsOfString {
    public static void main(String[] args) {
        String str = "";
        System.out.println("Enter a String:");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        String[] split = str.split(" ");
        int count = 1;
        HashMap<String,Integer> m = new HashMap<String, Integer>();
        for(int i=0; i< split.length;i++) {
            if(m.containsKey(split[i])) {
                count = m.get(split[i]);
                m.put(split[i],count+1);
            } else {
                m.put(split[i],1);
            }
         }
        System.out.println(m);
   }
}

// https://www.softwaretestinghelp.com/java-coding-interview-programs/

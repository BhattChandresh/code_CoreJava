/**
 *  Problem Statement:
 * How to Count Occurrences of a Character in String
 */

package com.practice.java;

import java.util.HashMap;

public class MaxCharOccurance {
    public static void main(String[] args) {
//        String str = "ABABCABAACBDA";
        String str = "Today is Monday";
        maxCharOccurance(str);
    }

    public static void maxCharOccurance(String str) {
        int value = 1;
        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        char[] c = str.toCharArray();
        for(int i=0;i < c.length;i++){
            if(m.containsKey(c[i])) {
                value = m.get(c[i]);
                m.put(c[i], value+1);
            } else {
                m.put(c[i],1);
            }
        }
        System.out.println(m);
    }
}

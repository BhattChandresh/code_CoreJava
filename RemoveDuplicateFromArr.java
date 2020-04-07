/**
 * Remove the Duplicate element from an Array.
 */
package com.practice.java;

import java.util.*;

public class RemoveDuplicateFromArr {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,4,9,2};
        int[] arr2 = {1,2,1,2,1,2};
        int[] arr3 = {15,21,11,21,51,21,11};
        int[] arr4 = {7,3,21,7,34,18,3,21};
        removeDuplicatesFromArray(arr1);
        removeDuplicatesFromArray(arr2);
        removeDuplicatesFromArray(arr3);
        removeDuplicatesFromArray(arr4);
    }

    static void removeDuplicatesFromArray(int[] arr) {
        Set<Integer> s1 = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++) {
            s1.add(arr[i]);
        }
        System.out.println(s1);
     }
}

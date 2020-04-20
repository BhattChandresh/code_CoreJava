/**
 * Find the Missing Number
 * You are given a list of n-1 integers and these integers are in the range of 1 to n.
 * There are no duplicates in the list.
 * One of the integers is missing in the list. Write an efficient code to find the missing integer.
 */

package com.practice.java;

public class FindMissingNumber {
    public static void main(String[] args) {
        int missingNo = 0;
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        //int[] arr = {1, 2, 3, 5};
        missingNo = getMissingNumber(arr, arr.length);
        System.out.println("Missing number is : " + missingNo);
    }

    public static int getMissingNumber(int[] arr, int n) {
        int total = 0;
        int arrSum = 0;
        total = ((n + 1) * (n+1+1))/2;
        for(int i=0;i<arr.length;i++) {
            arrSum = arrSum + arr[i];
        }
        System.out.println("Sum : " + total + "-" + arrSum);
        return total - arrSum;
    }
}

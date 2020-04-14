package com.practice.java;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,55,65,75,85,12};
        int result = linearSerach(arr, 100);
        System.out.println("Value found at Index : " + result);
    }

    public static int linearSerach(int [] arr, int value) {
        for(int index =0; index < arr.length;index++) {
            if(arr[index] == value) {
                return index;
            }
          }
          return -1;
    }
}

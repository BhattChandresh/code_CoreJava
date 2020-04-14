package com.practice.java;

public class RecursiveLinearSearch {
    static boolean isFind = false;
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30,35,40,45,50};
        int start = 0;
        int value = 15;
        int result = recursiveLinearSerach(arr,start,value);
        System.out.println("Value found at index : " + result);
    }

    public static int recursiveLinearSerach(int arr[], int i, int value) {
        //Define the BaseCase First.
        if(arr[i] == value){
            return i;
        }
        else if(i > arr.length) {
            return -1;
        }
        else {
            System.out.println("Index :" + i);
            return recursiveLinearSerach(arr,i+1,value);
        }
    }
}

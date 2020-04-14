package com.practice.java;

public class RecursiveBinarySearch {
    static int retValue = 0;
    public static void main(String[] args) {
        int[] arr = {3,11,21,29,41,54,61,78,110,127};
        int head = 0;
        int tail = arr.length-1;
        int value = 299;
        int result = recursiveBinarySearch(arr,head,tail,value);
        System.out.println("Index of the value " + value + " is :" + result);
    }

    public static int recursiveBinarySearch(int[] arr,int head, int tail, int value) {
        //Define the BaseCase here.

        System.out.println("[ " + head + " ... " + tail + " ]");
        if(head > tail)
            retValue = -1;
        else {
            int mid = (int) Math.floor((head+tail)/2);
            if(arr[mid] == value)
                retValue = mid;
            else if(arr[mid] < value) {
                head = mid +1;
                return recursiveBinarySearch(arr,head,tail,value);
            }
            else if(arr[mid] > value) {
                tail = mid-1;
                return recursiveBinarySearch(arr,head,tail,value);
            }
        }
        return  retValue;  // This will never executes.
     }
}

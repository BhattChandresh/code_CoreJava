package com.practice.java;

public class BinarySearchApp {
    public static void main(String[] args) {
        /**
         * In order for Binary Search to work, precondition is elements should be sorted.
         * Here assumption is arrays are already sorted.
         */
        int[] arr = {3,11,21,29,41,54,61,78,110,127};
        int value = 54;
        int result = BinarySerach(arr,value);
        System.out.println("Index of the element is :" + result);
    }

    public static int BinarySerach(int[] arr, int value) {
        // 1. Find the total range / length of the array.
        int head = 0;
        int tail = arr.length-1;
        int mid = 0;

        //2. Iterate over the array
        while(head <= tail) {
            // 2.a find the middle element of the array and check
            // value to be search is in which half.
            mid = (int) Math.floor(head + tail) / 2;
            System.out.println("Find the half :" + mid);
            //2.b check that mid index is matching index then return the value
            if(arr[mid] == value)
                return mid;
            //2.c if value to be search is > arr[mid]  then adjust the head = mid +1
            //2.c if value to be search is < arr[mid] then adjust the tail = mid -1
            if(arr[mid] < value) {
                head = mid+1;
                System.out.println("New Head :" + head);
            }
            else if(arr[mid] > value) {
                tail = mid-1;
                System.out.println("New Tail : " + tail);
            }
        }
        return -1;
    }
}

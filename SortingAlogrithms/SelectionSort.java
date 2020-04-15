/**
 * Time Complexicity : O(n*n) where n is no of elements.
 */

package com.practice.java;

public class SelectionSort {
    public static void main(String[] args) {
        //int[] arr = {25,47,3,19,8,18};
        int[] arr = {70,25,34,110,67,56,99,33,11,27};
        //int[] arr = {10,5,10,7,3,4,3};
        int[] result = selectionSort(arr);
        System.out.print("[");
        for(int index=0;index < result.length;index++) {
            System.out.print(result[index] + ",");
        }
        System.out.print("]");
    }

    public static int[] selectionSort(int[] arr) {
        int [] a = arr;
        int min = 0;
        int temp = 0;
        for(int i =0; i < a.length;i++) {
            min = i;
            for(int j=i+1;j<a.length;j++) {
                 if (a[min] > a[j])
                    min = j;
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }
}

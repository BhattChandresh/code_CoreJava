/**
 * Time Complexity : O(n^n)
 *
 *  Algorithm:
 *    > for i=1 to arr.length - 1 (started with  index =1 because we assume that  index =0 is sorted):
 *    > Set element = arr[i] and j = i-1
 *    > while(j >=0 and arr[i] > element):
 *        >> set arr[j+1] = a[j]
 *        >> Decrement j by 1
 *    > set arr[j+1] = element
 */

package com.practice.java;

public class InsertionSort {
    public static void main(String[] args) {
        //int[] arr = {25,47,3,19,8,18};
        //int[] arr = {70,25,34,110,67,56,99,33,11,27};
        int[] arr = {10,5,10,7,3,4,3};
        int[] result = insertionSort(arr);
        System.out.println(" --- Insertion Sort ---");
        System.out.print("[");
        for(int index=0;index < result.length;index++) {
            System.out.print(result[index] + ",");
        }
        System.out.print("]");
    }

    public static int[] insertionSort(int[] arr) {
        int[] a = arr;
        for(int i=1;i<a.length;i++) {
            int element = a[i];
            int j= i-1;
            while(j >=0 && a[j] > element){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = element;
        }
        return a;
    }
}

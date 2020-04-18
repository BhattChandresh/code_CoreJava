/**
 *  Quick time complexity is O(n log n) is general cases.
 *  Worst time complexity is O(n^2).
 *
 *  Here recursive approach are used to sort the elements.
 *
 *  Pseudo Code :
 *   [Here A = Array, s = first index position of Array and e = last index position of array]
 *  quickSort(A, s, e) {
 *      if(s < e) {
 *          mid = partition(A,s,e)
 *          quickSort(A,s,mid-1)
 *          quickSort(A,mid+1,e)
 *      }
 *  }
 *
 * Pseudo Code for partition :
 * partition(A,s,e) {
 *     x = A[e] (Pivot element)
 *     i = s -1 (i = -1)
 *     for(j = s to e-1) {
 *         if(A[j] <= x) {
 *             i = i+1
 *             swap A[i] with A[j]
 *         }
 *     }
 *     swap A[i+1] with A[e]
 *     return i+1
 * }
 */
package com.practice.java;

public class QuickSort {
    static int count =0;
    public static void main(String[] args) {
//        int arr[] = {10,7,1,3,5,8,9,6};
//        int arr[] = {6,8,7,2,4,3,5};
        int arr[] = {12,81,74,43,1098,0,8,92,17,754,912,0,6,4};
           int[] result = quickSort(arr,0,arr.length-1);
        System.out.print("[");
            for(int i=0; i<result.length;i++)
                System.out.print(result[i] + ",");
        System.out.print("]");
    }

    public static int[] quickSort(int arr[], int start, int end) {

        if(start < end) {
            count ++;
            System.out.println(count);
            int mid = partition(arr,start,end);
            System.out.println(start + " ----> " + mid + " ----> " +  end);
            quickSort(arr,start,mid -1);    //sorts the left half of the range.
            quickSort(arr,mid+1,end);   //sorts the right half of the range.
        }
        return arr;
    }

    public static int partition(int[] arr, int start, int end) {
        int x = arr[end];
        int i = start -1;
        int temp;
        System.out.println(x + " ... " + i);
        for(int j=start; j < end;j++) {
            if(arr[j] < x) {
                i = i+1;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        temp = 0;
        temp = arr[end];
        arr[end] = arr[i+1];
        arr[i+1] = temp;
        return  i+1;
    }
}

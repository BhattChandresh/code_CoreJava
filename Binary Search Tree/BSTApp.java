package com.practice.java.BST;

public class BSTApp {
    public static void main(String[] args) {
        BSTUtil bst = new BSTUtil();

        //https://dwgeek.com/identify-and-remove-duplicate-records-from-hive-table.html/


        bst.insert(53, "53");
        bst.insert(28,"28");
        bst.insert(10, "10");
        bst.insert(63,"63");
        bst.insert(100,"100");

        System.out.println("Min value from BST : " + bst.findMin().value);
        System.out.println("Max value from BST : " + bst.findMax().value);
    }
}

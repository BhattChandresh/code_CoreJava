package com.practice.java;

import java.util.Scanner;

public class ReverseStringwithStack {
    public static void main(String[] args) {
        StackOps stack = new StackOps(100);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = scan.nextLine();
        scan.close();
        stack.push(str);
        System.out.println("Entered String is : " + str);
        String reverseStr = "";
        while(!stack.isStackEmpty()) {
            char c = stack.pop();
            reverseStr = reverseStr + c;
        }
        System.out.println();
        System.out.println("Reversed String is :" + reverseStr);

    }
}

class StackOps{
    private int maxStackSize;
    private char[] stackArr;
    private int top;

    StackOps(int maxStackSize) {
        this.maxStackSize = maxStackSize;
        top = -1;
        stackArr = new char[maxStackSize];
    }

    public void push(String str) {
        for(int index=0;index < str.length();index++) {
            top +=1;
            stackArr[top] = str.charAt(index);
        }
    }

    public char pop() {
        int temp = top;
        top -=1;
        return stackArr[temp];
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }
}

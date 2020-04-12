package com.practice.java;

public class StackOperations {
    private int maxStackSize;
    private long[] stackArr;
    private int top;

    public StackOperations(int maxStackSize) {
        this.maxStackSize = maxStackSize;
        stackArr = new long[maxStackSize];
        top = -1;
    }

    public void push(int value) {
        top +=1;
        if(top == maxStackSize) {
            System.out.println("Stack is full, can not add elements " + value + " Please increase the size of stack.");
            top -=1;
            return;
        }
        //System.out.println("top variable during push :" + top);
        stackArr[top] = value;
    }

    public long pop() {
        int temp = top;
        top -=1;
        //System.out.println("top variable during pop :" + top);
        return stackArr[temp];
    }

    public boolean isStackEmpty() {
        if(top == -1) {
            System.out.println("Stack is Empty.");
            return true;
        }
        else
            return false;
        // Below is the code which is more optimized
        // return (top == -1);
    }

    public boolean isStackFull() {
        if(maxStackSize == top - 1)
            return true;
        else
            return false;
        // Below is the code which is more optimized
        // return (maxStackSize == top - 1);
    }

    public int pointer() {
        return top+1;
    }
}

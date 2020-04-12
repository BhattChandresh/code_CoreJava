package com.practice.java;

public class StackDemo {
    public static void main(String[] args) {
        StackOperations stack = new StackOperations(10);

        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);
        stack.push(100);
        stack.push(120);
        stack.push(140);
        stack.push(160);
        stack.push(180);
        stack.push(200);
        stack.push(220);

        System.out.println("Values in the stack is as follows:");
        while(!(stack.isStackEmpty())) {
            long value = stack.pop();
            int pointer = stack.pointer();
            System.out.println("Index(" + pointer + ") = " + value);
        }
    }
}

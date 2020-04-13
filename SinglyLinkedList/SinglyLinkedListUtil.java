package com.practice.java;

public class SinglyLinkedListUtil {
    private Node first;

    public SinglyLinkedListUtil() {
    }

    public boolean isEmpty() {
        return (first == null);
    }

    //used to add  the element at the beginning of the list
    public void insertAtBegining(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    //used to add  the element at the end of the list
    public void insertAtLast(int data) {
        Node current = first;
        while(current.next != null) {
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
     }

    public void displayList() {
        System.out.println("List (first --> last)");
        Node current = first;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}

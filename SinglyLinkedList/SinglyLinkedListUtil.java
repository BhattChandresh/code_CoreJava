package com.practice.java;

public class SinglyLinkedListUtil {
    public Node first;

    public SinglyLinkedListUtil() {
    }

    public boolean isEmpty() {
        return (first == null);
    }

    //used to insert the node at the begining.
    public void insertAtBegining(int data) {
        Node addNode = new Node();
        addNode.data = data;
        addNode.next = first;
        first = addNode;
    }

    //used to insert the element at the middel
    public void insertAtMiddle(int value) {

    }


    //used to insert the node at the last
    public void insertAtLast(int data) {
        Node current = first;
        while(current.next != null) {
            current = current.next;
        }
        Node addNode = new Node();
        addNode.data = data;
        current.next = addNode;
    }

    //used to delete the last node in LinkedList
    public void deleteLastNode() {
        Node current = first;
        Node last = null;
        while(current.next != null) {
            last = current;
            current = current.next;
        }
        last.next = null;
    }

    //used to delete the first node in LinkedList
    public void deleteFirstNode() {
        Node current = first;
        first = current.next;
        current.next =null;
    }


    //display the list.
    public void displayList() {
        System.out.println("list (first ----> last)");
        Node current = first;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}

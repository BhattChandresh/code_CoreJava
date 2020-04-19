package com.practice.java.DoublyLinkedList;

public class DoublyLinkedListUtil {
    private Node first;
    private Node last;

    public DoublyLinkedListUtil() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    // insert the node from beginning.
    public void insertAtBeginning(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty())
            last = newNode;
        else
            first.previous = newNode;
         newNode.next = first;
        first = newNode;
    }

    // insert the node from last.
    public void insertAtLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty())
            first = newNode;
        else{
            newNode.previous = last;
            last.next = newNode;
        }
        last = newNode;
    }

    //delete the node from beginning
    // Assumption : List is non empty
    public void deleteFromFirst() {
        Node temp = first;
        if(first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        temp = null;
    }

    //delete the node from end
    // Assumption : List is non empty
    public void deleteFromLast() {
        Node temp = last;
        if(first.next == null)
            first = null;
        else
            last.previous.next = null;
         last = last.previous;
        temp = null;
    }

    //insert a node after a particular node.
    //Assumption : List is non empty
    public boolean insertAfter(int key, int data) {
        Node current = first;
        while(current.data != key) {
            current = current.next;
            if(current == null)
                return false;
        }
        Node newNode = new Node();
        newNode.data = data;
        if(current == last) {
            last.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    //Delete a node after a particular node.
    //Assumption : List is non empty
    public Node deleteKey(int key) {
        Node current = first;
        while (current.data != key){
            current = current.next;
            if(current == null) {
                System.out.println("Desired node not found");
                return null;
            }
        }
        if(current == first)
            first = current.next;
        else {
            //current.previous.next = current.next;
            current.previous = first;
            first.next = current.next;
        }

        if(current == last) {
            last = current.previous;
        }else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayList() {
        System.out.println("list [First ----> Last]");
        Node current = first;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}

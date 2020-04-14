/**
 *  Circular LinkedList is a list in which we keep the track of first node as well as last node.
 */

package com.practice.java;

public class CircularLinkedListUtil {
    private Node first;
    private Node last;

    public CircularLinkedListUtil() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    //used to insert the node at the begining.
    public void insertAtBegining(int data) {
        Node node = new Node();
        node.data = data;
        if(isEmpty()){
            last = node;
        }
        node.next = first;
        first = node;
    }

    //used to insert the element at the middel
    public void insertAtMiddle(int value) {

    }

    //used to insert the node at the last
    public void insertAtLast(int data) {
        Node node = new Node();
        node.data = data;
        if(isEmpty()) {
            first = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    //used to delete the last node in LinkedList
    public void deleteLastNode() {
        Node current = first;
        Node temp = null;
        while(current.next != null) {
            temp = current;
            current = current.next;
        }
        if(last.next == null){
            last = null;
            last = temp;
            last.next = null;
        }
    }

    //used to delete the first node in LinkedList
    public void deleteFirstNode() {
        Node temp = first;
        if(first.next == null){
            last = null;
        }
        first = first.next;
        temp = null;
    }

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

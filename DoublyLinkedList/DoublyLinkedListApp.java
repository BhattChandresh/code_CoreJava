package com.practice.java.DoublyLinkedList;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedListUtil list = new DoublyLinkedListUtil();
        list.insertAtBeginning(22);
        list.insertAtBeginning(44);
        list.insertAtBeginning(66);
        list.insertAtBeginning(88);
        System.out.println("Doubly Linked List after adding 4 nodes at the beginning");
        list.displayList();
        list.insertAtLast(55);
        list.insertAtLast(33);
        System.out.println("Doubly Linked List after adding 2 nodes at the last");
        list.displayList();
        list.deleteFromFirst();
        list.deleteFromFirst();
        System.out.println("Doubly Linked List after deleting 2 nodes from first");
        list.displayList();
        System.out.println("Add the new node at the beginning for testing purpose");
        list.insertAtBeginning(400);
        list.displayList();
        list.deleteFromLast();
        list.deleteFromLast();
        System.out.println("Doubly Linked List after deleting 2 nodes from last");
        list.displayList();
        list.insertAfter(44,99);
        list.displayList();
        list.deleteKey(44);
        list.displayList();
    }
}

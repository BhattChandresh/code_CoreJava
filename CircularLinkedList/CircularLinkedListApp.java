package com.practice.java;

public class CircularLinkedListApp {
    public static void main(String[] args) {
        CircularLinkedListUtil list = new CircularLinkedListUtil();
        list.insertAtBegining(15);
        list.insertAtBegining(30);
        list.insertAtBegining(45);
        list.insertAtBegining(60);
        System.out.println("Insert 4 Nodes using insertAtBegining()");
        list.displayList();

        list.insertAtLast(300);
        list.insertAtLast(500);
        System.out.println("Insert 2 Nodes using insertAtLast()");
        list.displayList();


        System.out.println("Reversed Linked List");
        list.reverseLinkedList();
        list.displayList();

        list.deleteLastNode();
        list.deleteLastNode();
        System.out.println("Delete last Node using deleteLast()Node");
        list.displayList();

        list.deleteFirstNode();
        list.deleteFirstNode();
        System.out.println("Delete First Node using deleteLast()Node");
        list.displayList();

    }
}

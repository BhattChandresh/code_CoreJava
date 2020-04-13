package com.practice.java;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        SinglyLinkedListUtil myList = new SinglyLinkedListUtil();

        myList.insertAtBegining(10);
        myList.insertAtBegining(20);
        myList.insertAtBegining(30);
        myList.insertAtBegining(40);

        System.out.println("Insert 4 Nodes using insertAtBegining()");
        myList.displayList();

        myList.insertAtLast(100);
        myList.insertAtLast(200);

        System.out.println("Insert 2 more Nodes using insertAtLast()");
        myList.displayList();

        myList.deleteLastNode();
        myList.deleteLastNode();
        System.out.println("delete 2 node using insertAtLast()");
        myList.displayList();

        myList.deleteFirstNode();
        myList.displayList();


    }
}

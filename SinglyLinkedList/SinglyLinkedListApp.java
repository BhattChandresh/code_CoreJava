package com.practice.java;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
        SinglyLinkedListUtil mylist = new SinglyLinkedListUtil();

        mylist.insertAtBegining(3);
        mylist.insertAtBegining(5);
        mylist.insertAtBegining(7);
        mylist.insertAtBegining(9);
        mylist.insertAtBegining(11);
        mylist.insertAtLast(500);

        mylist.displayList();
    }
}

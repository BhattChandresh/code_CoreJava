package com.practice.java.BST;

public class BSTUtil {
    private Node root;

    public void insert(int key,String value) {
        Node newNode = new Node(key, value);
        if(root == null) {
            root = newNode;
            System.out.println("     " + newNode.value + "     ");
        } else {
            Node current = root;  // This reference variable change as we traverse down in the BST.
            Node parent;                // This reference variable is the parent of the current node in BST.

            while(true) {
                parent = current;
                if(key < current.key) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        System.out.println(newNode.value);
                        return;
                    }
                } else if(key > current.key){
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        System.out.println("            " + newNode.value);
                        return;
                    }
                }
            }
        }
    }

    public boolean removeNode(int key) {
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = false;

        //Searching the node to delete that matches the key.
        while(currentNode.key != key) {
            parentNode = currentNode;
            if(key < currentNode.key) {
                isLeftChild = true;
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
            if(currentNode == null)
                return false;
        }

        //Found the node to delete
        Node nodeToDelete = currentNode;

        // If node is a leaf node

        //If node has one child

        //if node has 2 children  (This is tricky)

        return true;
    }

    public Node findMin() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
         return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }
}

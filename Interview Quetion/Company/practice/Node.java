package com.practice;

public class Node {
    int data;
    Node left;
    Node right;

    // Constructor
    Node(int val) {
        this.data = val;
        left = null;
        right = null;
    }

    // Static utility class
    static class Utility {
        // Method to calculate the height of the tree
        static int height(Node root) {
            if (root == null) 
            	return 0; // Height of an empty tree is 0
            
            int lHeight = height(root.left);
            int rHeight = height(root.right);
            
            return Math.max(lHeight, rHeight) + 1;
        }
    }

    // Main method
    public static void main(String[] args) {
        Node root = new Node(11);

        root.left = new Node(7);
        root.right = new Node(9);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.left.left.left = new Node(1);

        int treeHeight = Utility.height(root);
        System.out.println("Height of the tree: " + treeHeight);
    }
}

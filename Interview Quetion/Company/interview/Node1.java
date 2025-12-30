package com.interview;

public class Node1 {

    int data;
    Node1 left, middle, right;

    Node1(int val) {
        this.data = val;
        left = right = middle = null;
    }

    // Function to calculate the height of the ternary tree
    static int height(Node1 root) {
        if (root == null) {
            return -1; // Return -1 for edges count; return 0 for node count
        }

        // Recursively find the height of each child subtree
        int leftHeight = height(root.left);
        int middleHeight = height(root.middle);
        int rightHeight = height(root.right);

        // Return the maximum height among the three children + 1 for the current node
        return  Math.max(leftHeight, Math.max(middleHeight, rightHeight))+1;
    }

    public static void main(String[] args) {

        // Manually construct the ternary tree
        Node1 root = new Node1(11);

        root.left = new Node1(1);
        root.middle = new Node1(2);
        root.right = new Node1(3);

        root.left.left = new Node1(4);
        root.left.middle = new Node1(5);
        root.left.right = new Node1(6);

        root.middle.left = new Node1(8);
        root.middle.middle = new Node1(9);
        root.middle.right = new Node1(7);

        // Calculate and print the height of the ternary tree
        System.out.println("Height of the ternary tree: " + height(root)); // Expected output: 2
    
}

}
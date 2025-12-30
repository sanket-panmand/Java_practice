package com.interview;

public class Node {

	int data;
	Node left;
	Node right;
	
	Node(int val){
		this.data = val;
		left = null;
		right = null;
	}
	
	static class utility{
		static int height(Node root) {
			if(root == null)
				return 0;
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			
			return Math.max(lHeight, rHeight) + 1;
		}
	}
	
	public static void main(String[] args) {
	
		Node root = new Node(11);
		
		root.left = new Node(7);
		root.right = new Node(9);
		
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.left.left.left = new Node(1);
		 
		int treeHeight = utility.height(root);
		System.out.println("Height of tree is "+treeHeight);
	}

}

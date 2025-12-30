package com.practice;

public class Node3 {

	int data;
	Node left;
	Node right;
	
	 Node3(int val){
		this.data = val;
		left =null;
		right = null;
	}
	 static class utility{
		 static int height(Node root) {
			 if(root==null)
			 return 0;
			 
			 int LHeight = height(root.left);
			 int RHeight = height(root.right);
			 
			 return Math.max(LHeight, RHeight)+1;
		 }
	 }
	
	
	
	public static void main(String[] args) {
		
		Node node = new Node(11);
		
		node.left = new Node(7);
		node.right = new Node(9);
		
		node.left.left = new Node(5);
		node.left.right = new Node(3);
		
		node.left.left.left = new Node(1);
		
		
		int result = utility.height(node);
		
		System.out.println(result);

	}

}

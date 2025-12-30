package com.practice;

public class NodeP {
	int data;
	NodeP left ;
	NodeP right;
	
	NodeP(int val){
		this.data=val;
		left= null;
		right = null;
	}
	
	static class xyz {
		static int height(NodeP root) {
			if(root ==null) return 0;
			
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			
			
			return Math.max(lHeight, rHeight) +1;
			
		}
		
	}

	public static void main(String[] args) {
		
		NodeP root = new NodeP(11);
		
		root.left  = new NodeP(7);
		root.right  = new NodeP(9);
		root.left.left  = new NodeP(3);
		root.left.right  = new NodeP(5);
		root.left.left.left  = new NodeP(1);
		
		int b = xyz.height(root);
	System.out.println(b);
	}
}

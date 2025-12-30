package com.interview;

public class tree_height {

	int data;
	tree_height left;
	tree_height right;
	
	tree_height(int val){
		this.data = val;
		left = null;
		right =null;
	}
	
	static class utility{
		static int height(tree_height root) {
			if(root == null)
			return 0;
			
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			return Math.max(lheight, rheight)+1;
		}
	}
	
	public static void main(String[] args) {
		tree_height root = new tree_height(11);
		
		root.left = new tree_height(7);
		root.right = new tree_height(9);
		
		root.left.left = new tree_height(3);
		root.left.right = new tree_height(5);
		root.left.left.left = new tree_height(1);
		
		int treeHeight = utility.height(root);
		System.out.println(treeHeight );

	}

}

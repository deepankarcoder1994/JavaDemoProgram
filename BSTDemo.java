package com.BSTDemo;

public class BSTDemo {

	//Implementation of Binary Search Tree.
	public static void main(String[] args) {
		Tree intTree = new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		
		//Sorted data will be printed when we do Inorder Traversal for a BST.
		intTree.traverseInOrder();
		System.out.println();
		
		System.out.println(intTree.get(27));
		System.out.println(intTree.get(17));
		System.out.println(intTree.get(888));
		
		//Printing the minimum and maximum elements
		System.out.println(intTree.min());
		System.out.println(intTree.max());
		

	}

}

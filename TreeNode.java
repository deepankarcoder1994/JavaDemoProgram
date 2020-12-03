package com.BSTDemo;

//Implementation of Binary Search Tree.
public class TreeNode {
	
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	//Constructor
	public TreeNode(int data){
		this.data=data;
	}
	
	
	public void insert(int value){
		if(value == data){
			return;
		}
		
		if(value<data){
			if(leftChild == null){
				leftChild = new TreeNode(value);
			}
			else{
				leftChild.insert(value);
			}
		}
		else{
			if(rightChild ==null){
				rightChild = new TreeNode(value);
			}
			else{
				rightChild.insert(value);
			}
		}
		
	}
	
	//Getting the value from BST
	public TreeNode get(int value){
		if(value == data){
			return this;
		}
		
		if(value < data){
			if(leftChild!=null){
				 return leftChild.get(value);
			}
		}
		
		else{
			if(rightChild!=null){
				return rightChild.get(value);
			}
		}
		
		return null;
	}
	
	
	
	//Finding the Minimum entry in the Tree
	public int min(){
		if(leftChild == null){
			return data;
		}
		else{
			return leftChild.min();
		}
		
	}
	
	//Finding the Maximum Entry in a Tree
	public int max(){
		if(rightChild==null){
			return data;
		}
		else{
			return rightChild.max();
		}
	}
	
	
	//Method to traverse the Tree Inorder Traversal
	public void traverseInOrder(){
		
		//Traversing left Subtree
		if(leftChild!=null){
			leftChild.traverseInOrder();
		}
		//Root
		System.out.print(data + ", ");
		
		//Traversing Right Subtree.
		if(rightChild!=null){
			rightChild.traverseInOrder();
		}
		
	}
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
}

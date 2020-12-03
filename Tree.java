package com.BSTDemo;

//Implementation of Binary Search Tree.
public class Tree {
	
	private TreeNode root;
	
	public void insert(int value){
		
		if(root == null){
			root=new TreeNode(value);
		}
		
		else{
			root.insert(value);
		}
	}
	
	public TreeNode get(int value){
		if(root!=null){
			return root.get(value);
		}
		
		return null;
	}
	
	//Deleting a Node from BST(Case 1 and Case 2)
	public void delete(int value){
		//Calling a private method called delete()
		root = delete(root,value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot,int value){
		if(subtreeRoot == null){
			return subtreeRoot;
		}
		
		if(value<subtreeRoot.getData()){
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),value));
		}
		else if(value > subtreeRoot.getData()){
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),value));
		}
		
		else{
			//Cases 0 and 1 : Node to delete has 0 or 1 Children. 
			if(subtreeRoot.getLeftChild() == null){
				return subtreeRoot.getRightChild();
			}
			else if(subtreeRoot.getRightChild() == null){
				return subtreeRoot.getLeftChild();
			}
		}
		
		return subtreeRoot;
		
	}
	
	public int min(){
		if(root == null){
			return Integer.MIN_VALUE;
		}
		return root.min();
	}
	
	public int max(){
		if(root == null){
			return Integer.MAX_VALUE;
		}
		return root.max();
	}
	
	public void traverseInOrder(){
		if(root!=null){
			root.traverseInOrder();
		}
	}
}

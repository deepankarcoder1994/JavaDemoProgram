package SummationProgramPractice;

public class GFG {
	
	static int sum = 0;
	
	//Node of a Binary Tree
	static class Node{
		int data;
		Node left,right;
	};
	
	//Function to get a New Node
	static Node getNode(int data){
		Node newNode = new Node();
		newNode.data= data;
		newNode.left = newNode.right = null;
		return newNode;
	}
	
	//Function to find the sum of all the parent nodes having child Node as X
	static void sumOfParentOfX(Node root,int x){
		//if root = null
		if(root==null)
			return;
		
		if((root.left!=null && root.left.data == x)||(root.right!= null && root.right.data ==x)){
			sum = sum + root.data;
		}
		
		//Recursively find the required parent Nodes in the left and right Subtree
		sumOfParentOfX(root.left, x);
		sumOfParentOfX(root.right, x);	
	}
	
	//Utility function to find sum of all the parent Nodes having child Node X
	static int sumOfParentOfXUtil(Node root,int x){
		sum = 0;
		sumOfParentOfX(root, x);
		
		return sum;
	}

	public static void main(String[] args) {
		// binary tree formation  
	    Node root = getNode(4);         //     4      
	    root.left = getNode(2);         //     / \      
	    root.right = getNode(5);         //     2 5      
	    root.left.left = getNode(7);     //     / \ / \      
	    root.left.right = getNode(2); // 7 2 2 3  
	    root.right.left = getNode(2);  
	    root.right.right = getNode(3);  
	      
	    int x = 2;  
	      
	    System.out.println( "Sum = " + 
	           sumOfParentOfXUtil(root, x)); 

	}

}

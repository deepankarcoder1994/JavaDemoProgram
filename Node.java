package SummationProgramPractice;

public class Node {
			int data;
			Node left, right;
			
		Node(int item){
			data = item;
			left= right = null;	
		}
		
}

class BinaryTree{
	
	Node root;
	
	//Function to check if a given Node is a leaf or not
	boolean isLeaf(Node node){
		if(node == null)
			return false;
		if(node.left == null && node.right == null){
			return true;
		}
		return false;
}	
	
	//Function to return the sum of all left leave Nodes
		int leftLeavesSum(Node node){
			int res = 0;
			
			if(node !=null){
				if(isLeaf(node.left)){
					res += node.left.data;
				}else{
					res += leftLeavesSum(node.left);
				}
				
				res += leftLeavesSum(node.right);
			}
			
			return res;
			
		}
	

	public static void main(String[] args) {
	      BinaryTree tree = new BinaryTree(); 
	        tree.root = new Node(20); 
	        tree.root.left = new Node(9); 
	        tree.root.right = new Node(49); 
	        tree.root.left.right = new Node(12); 
	        tree.root.left.left = new Node(5); 
	        tree.root.right.left = new Node(23); 
	        tree.root.right.right = new Node(52); 
	        tree.root.left.right.right = new Node(12); 
	        tree.root.right.right.left = new Node(50); 
	   
	        System.out.println("The sum of leaves is " +  
	                                       tree.leftLeavesSum(tree.root));

	}

}


public class EmployeeLinkedList {
	
	private EmployeeNode head;
	
	
	//Function to add the Node at the front of the list
	public void addToFront(Employee employee){
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
	}
	
	public void printList(){
		EmployeeNode current = head;
		System.out.print("Head -> ");
		while(current!=null){
			System.out.print(current);
			System.out.println(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
		
	}
}

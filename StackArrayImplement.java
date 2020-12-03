
public class StackArrayImplement {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(10);
		
		stack.push(new Employee("Deepankar", "Sharma", 123));
		stack.push(new Employee("Drishti","Aggarwal",3456));
		stack.push(new Employee("Esha","Chauhan",88));
		stack.push(new Employee("Chirag","Singhal",89));
		stack.push(new Employee("Shantanu","Chauhan",90));
		
		stack.printStack();
		System.out.println(stack.peek());
		
		

	}

}

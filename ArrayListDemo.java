import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Jane","Jones", 123));
		employeeList.add(new Employee("John","Doe", 4567));
		employeeList.add(new Employee("Mary","Smith",22));
		employeeList.add(new Employee("Mike","Wilson",3245));
		
		
		System.out.println("Traversing list through forEach() method:");
		/*employeeList.forEach(employee -> System.out.println(employee));*/
		
		//Suppose you need to print second employee in the list.Time complexity will be O(1).
		System.out.println(employeeList.get(1));
		
		//Method to check whether the list is empty.
		System.out.println(employeeList.isEmpty());
		
		//Replacing one employee with another.
		//O(1) is the time complexity.
		employeeList.set(1, new Employee("John","Adams", 4568));
		
		
		//printing all employees in the list.
		employeeList.forEach(employee -> System.out.println(employee));
		
		//Getting the number of items in the list
		System.out.println(employeeList.size());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//Adding a element at a specified Index.worst case complexity is O(N),because if you
		//the new element at the beginning then all the elements has to be shifted by one place.
		employeeList.add(3, new Employee("John","Doe",4567));
		employeeList.forEach(employee -> System.out.println(employee)); 
		
		System.out.println("-------------------------------------------------------------------------");
		//if we want the array that is backing up the arraylist which is holding the employees.
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for(Employee employee:employeeArray){
			System.out.println(employee);
		}
		
		//Returned false because references are different,so we have to Override equals method.
		//So when we override then equals() method will compare the content.
		System.out.println(employeeList.contains(new Employee("Mary","Smith",22)));
		
		//method to check the Index of an Employee
		System.out.println(employeeList.indexOf(new Employee("John","Doe",4567)));
		
		System.out.println("After removing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//Method to remove the Items from the list.Complexity is O(N).
		employeeList.remove(2);
		employeeList.forEach(employee -> System.out.println(employee));
		
	}

}

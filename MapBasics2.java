import java.util.HashMap;
import java.util.Map;

//Ex. of user defined Object used in the Map.
class Book{
	int id;
	String name;
	int quantity;
	
	public Book(int id, String name, int quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}	
}

public class MapBasics2 {
	public static void main(String[] args) {
		//Creating Map of books
		Map<Integer,Book> map = new HashMap<Integer,Book>();
		
		Book b1 = new Book(1,"Let us C",2);
		Book b2 = new Book(2,"DAA Book",3);
		
		//Inserting Into Map.
		map.put(1, b1);
		map.put(2, b2);
		
		//Traversing the Map
		for(Map.Entry<Integer,Book> m : map.entrySet()){
			int key = m.getKey();
			Book b = m.getValue();
			System.out.println(key +  " Details: ");
			System.out.println(b.id + " " + b.name + " " + b.quantity);
		}
	}

}

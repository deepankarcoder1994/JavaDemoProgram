import java.util.NavigableMap;
import java.util.TreeMap;
/*
 * 
 * A NavigableMap may be accessed and traversed in either ascending or descending key order. 
 * The descendingMap method returns a view of the map with the senses of all relational and directional 
 * methods inverted.
 */
public class NavigableMapPractice {

	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new TreeMap<Integer,String>();
		map.put(100, "Deepankar");
		map.put(101, "Abhinav");
		map.put(102, "Sushant");
		map.put(103, "Priyanka");
		
		//Descending order
		System.out.println("descending Map : " + map.descendingMap());
		
		//Returns key-value pairs whose keys are less than or equal to the specified key.  
		System.out.println("headMap: " + map.headMap(102, true));
		
		//Returns key-value pairs whose keys are greater than or equal to the specified key.  
		System.out.println("tailMap : " + map.tailMap(102, true));
		
		
		//Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(100, false, 102, true));
	}

}

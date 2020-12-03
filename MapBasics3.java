import java.util.Map;
import java.util.TreeMap;

public class MapBasics3 {

	//TreeMap Code Practice
	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(100, "Microsoft");
		map.put(101, "Dell");
		map.put(102, "Fujitsu");
		
		for(Map.Entry m : map.entrySet()){
		    System.out.println(m.getKey() + " " + m.getValue());	
		}
	}

}

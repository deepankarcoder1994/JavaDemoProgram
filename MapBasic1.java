import java.util.HashMap;
import java.util.Map;

public class MapBasic1 {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "JBOSS Application Server");
		hm.put(2, "ECLIPSE");
		hm.put(3, "SPRING");
		hm.put(4, "HIBERNATE");
		for(Map.Entry m : hm.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}

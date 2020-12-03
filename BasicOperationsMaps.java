import java.util.HashMap;
import java.util.Map;

public class BasicOperationsMaps {

	public static void main(String[] args) {
		Map<String,String> languages = new HashMap<>();
		if(languages.containsKey("Java")){
			System.out.println("Java already Exists!!");
		}else{
			languages.put("Java", "a compiled high level, object oriented,platform Independent language");
			System.out.println("Java Added Successfully!");
		}
		
		languages.put("Python", "an interpreted ,object oriented, high level programming language with Dynamic semantics");
		languages.put("Algol", "an algorithmic language");
		//If the below print statement retuen null then it indicates that it is a Brand new Object.
		System.out.println(languages.put("BASIC","Beginners all Purpose Symbolic Instruction Code"));
		languages.put("Lisp", "Therein lies madness");
		
		//Code to check whether a Key is already present in the Map via containsKey() method
		if(languages.containsKey("Java")){
			System.out.println("Java is already present in the Map!");
		}else{
			languages.put("Java", "this course is about Java!");
		}
		
        System.out.println(languages.get("Java"));
        
        System.out.println("=============");
        //Remove on the basis of a key
        languages.remove("Lisp");
        
        //Remove if the key is mapped to a certain value
        if(languages.remove("Algol", "algorithmic languages")){
        	System.out.println("Algol removed!!");
        }else{
        	System.out.println("Algol not removed!!key/value pair not found");
        }
        
        System.out.println(languages.replace("Python", "a functional programming language with Imperative features"));
        System.out.println(languages.replace("Scala", "this will not be added"));
        
        
        
        //Looping through the keyset() present in the Map
        //There is no guarantee of the Order in the HashMap.
        for(String key:languages.keySet()){
        	System.out.println(key + ": " + languages.get(key));
        }

	}

}

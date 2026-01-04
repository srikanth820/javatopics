package collections;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
	public static void main(String[] args) {
		
		

		Map m = new HashMap();
		
		
		m.put(101,"John");
	    m.put(102,"scott");
	    m.put(103,"David");
	    m.put(104,"Mary");
	    m.put(105, "saii");
	    m.put(104, "stokess");
	    m.put(106,"David");
	   
	  System.out.println(m);
	   System.out.println(m.containsKey(103));
	  //  System.out.println(m.entrySet());
//	    
	    System.out.println(m.keySet());
	    System.out.println(m.values());
//	    
	    System.out.println(m.entrySet());

	}

}

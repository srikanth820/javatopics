package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map3 {
   public static void main(String[] args) {
	

	Map<Character, Integer> map = new LinkedHashMap();
	
	map.put('a', 101);
	map.put('b', 102);
	map.put('c', 103);
	map.put('d', 104);
	map.put('e', 105);
	map.put('f', 106);
	map.put('g', 107);
	map.put('h', 108);
	map.put('a', 108);

	
	System.out.println(map);
	
	System.out.println(map.containsKey('f'));
	
	 System.out.println(map.keySet());
	 System.out.println(map.values());
	 
	 System.out.println(map.entrySet());
	
	

}
}

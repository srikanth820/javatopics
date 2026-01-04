package collections;

import java.util.HashSet;
import java.util.Set;

public class HasSet {
	public static void main(String[] args) {
		
		Set ss = new HashSet();
		
		ss.add(10);
		ss.add(200);
		ss.add('a');
		ss.add("sao");
		ss.add(true);
		ss.add(null);
		ss.add(10);
		ss.add(null);
		ss.add(200);
		
		
		System.out.println(ss.size());
		ss.add('b');
		System.out.println(ss);
	
//		for(Object s: ss)
//		{
//			System.out.println(s);
//		}
	}

}

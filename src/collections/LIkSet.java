package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LIkSet {
	public static void main(String[] args) {
		
		Set ss = new LinkedHashSet();
		
		ss.add(10);
		ss.add(20);
		ss.add(30);
		ss.add('a');
		ss.add(10);
		ss.add("srikanth");
		ss.add('a');
		
		//System.out.println(ss);
	
		System.out.println(ss.size());
		Iterator it =ss.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

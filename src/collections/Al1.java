package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Al1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al = new ArrayList();
		
		al.add(10);
		al.add(20);
	    al.add(20.0);
	    al.add("srikanth");
	    al.add('a');
	    al.add(true);
	    al.add(null);
	    al.add(null);
	    al.add("20");
	    al.add("srikanth");
	    
	/*   System.out.println(al);
	    System.out.println(al.size());
	    
	   System.out.println(al.get(0));
	   System.out.println(al.remove(0));
	   System.out.println(al);
         System.out.println(al.size());
         System.out.println(al.contains("srikanth"));
         System.out.println(al.set(8,"sai"));
         System.out.println(al);
	  */
	    System.out.println("no of elements in arraylist:"+ al.size());
	   
//	    for(Object e: al)
//	    {
//	    	System.out.println(e);
//	    	
//	    }
	       
        Iterator it =al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	} 
	       
	
}

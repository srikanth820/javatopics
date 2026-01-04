package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Link1 {
	
	public static void main(String[] args) {
		
List al = new LinkedList();
		
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
	    
	   for(int i=0; i<al.size(); i++)
	   {
		   System.out.println(al.get(i));
	   }
	       
	     /* for(Object ll : al)
	       {
	    	   System.out.println(ll);
	       }
	     */
	       
	}

}

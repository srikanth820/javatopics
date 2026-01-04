package strings;

public class Demo1 {
	public static void main(String[] args) {
		
		
		String s = "srikanth";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(0));
		
		
		
//		   char c[] = s.toCharArray();
//		   
//		     for(char cc : c)
//		     {
//		    	 System.out.println(c);
//		     }
		
		String ss = "   sai srikanth  ";
		
		String tr = ss.trim();
		System.out.println(tr);
		
		
		String s1 = "sai srikanth sarma";
		
		String sp[] = s1.split(" ");
		System.out.println(sp.length);
		for(String w: sp)
		{
			System.out.println(w);
		}
		
		//concat
		
		String co = "Srikanth";
		
		String cc =co.concat(" ").concat("sarma");
		
		System.out.println(cc);
		
		System.out.println("srikanth"+"  "+ "sarma"+"  "+"saii");
	}

}

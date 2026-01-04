package strings;

public class Day1 {
	public static void main(String[] args) {
		
		String s1 ="srikanth";
		
		System.out.println(s1.length());
		
		String s2= "sai srika sarma";
		
		String s[] = s2.split(" ");
		
		System.out.println(s.length);
		for(String w: s)
		{
			System.out.println(w);
		}
		
		String s3= "  saisrikanth  ";
		System.out.println(s3.length());
	 
		
		System.out.println(s3.trim());
		

		
		
		
	}

}

package strings;

public class Demo3 {
	
	public static void main(String[] args) {
		
	
	String s ="srikanth";
	
	String ss = s.concat(" ").concat("sarma");
	
	System.out.println(ss);
	
	
	StringBuilder sb = new StringBuilder(s);
	sb.append(" ").append("sarma");
	
	System.out.println(sb);
	
	System.out.println(sb.reverse());
	

}
}
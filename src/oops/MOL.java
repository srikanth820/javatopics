package oops;

public class MOL {
	
	public void m1(int x, int y) {
		System.out.println(x+y);
	}
	
	public void m2(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	
	public void m3(double a, int b) {
		System.out.println(a+b);
	}
	
	public void m4(int a, int b, int c) {
		System.out.println(a+b-c);
	}

	public static void main(String[] args) {
		MOL obj = new MOL();
		obj.m1(10,20);
		obj.m3(20.0,20);
		obj.m2(100,200,300);
		obj.m4(2, 3, 4);

	}

}

package oops;

interface m1 {
	
	public void a1();
	
	public static void b1() {
		System.out.println("statci meth");
	}
	
	public default void c1() {
		System.out.println("deta meth");
	}

}
class  m2 implements m1{
	
	public void a1() {
		System.out.println("abstracrt me");
	}
}

public class MulInt {
	public static void main(String[] args) {
		m2 obj = new m2();
		obj.a1();
		obj.c1();
		m1.b1();
	}

}

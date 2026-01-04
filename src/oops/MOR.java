package oops;

class A {
	
	public void m1() {
	  System.out.println("is a parent method access");	
	}
}
	
	class B extends A{
		
		public void m1() {
			System.out.println("is a child method access");
		}
	}
	public class MOR {
		public static void main(String[] args) {
		B obj = new B();
		A obj1 = new A();
		
		obj1.m1();
		obj.m1();
		
		}
	
	}


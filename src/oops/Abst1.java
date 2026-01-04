package oops;

abstract class  A1 {
	
	public void m1() {
		System.out.println("non-static methodd");
	}
	
	public abstract void m2(); 
		
	
	public static void m3() {
		System.out.println("static methodd");
	}
	
}
	
	class B1 extends A1 {
		
		   public void m2() {
			System.out.println("abstract method");
		   }
			
		   public void m4() {
				System.out.println("child class method");
			}
		}
	

     public class Abst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B1 obj = new B1();
         obj.m2();
         obj.m1();
         obj.m3();
         obj.m4();
         A1 bj = new B1();
         bj.m1();
         
         
	}
}



















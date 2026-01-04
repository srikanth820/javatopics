package arrays;

public class Day1 {
	public static void main(String[] args) {
		int a[] = new int [5];   // declaring of array size 
	//1.	
		a[0]=100;   // assign the elements into array by using index
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=600;
		//a[5]=500; java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println("length of the arrays:"+ a.length);
		//System.out.println(a.s);
		System.out.println(a[0]);
	//	System.out.println(a[5]);
	
	//2.
		int aa[] = {10,20,30,40,50};
		
//		for(int i=0; i<=aa.length-1; i++)
//		{
//			System.out.println(aa[i]);
//		}
		
	//for each
		for(int ar : aa)
		{
			System.out.println(ar+" ");
			
		}
		
		for(int i=4; i>=0; i--)	
		{
			
			System.out.println(aa[i]+" ");
			System.out.println();
		}
		
Object b[] = {10,20,'a',"sro",20.0,true};
		
		for(Object ar: b)
		{
			System.out.print(ar+" ");
		}
	}
	
	}



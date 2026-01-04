package arrays;

public class Day2 {
	public static void main(String[] args) {
		
		int a[][] = {
				       {100, 200},
				       {300, 400},
				       {500, 600},
	                 };
		
		for(int r=0; r<=2; r++) 
		{
		
			for(int c=0; c<=1; c++) 
				{
				System.out.print(a[r][c]+" ");
				}
				
				System.out.println();
		}
		
		
		int b[] [] = {
				      {100,200,300},
				      {400,500,600},
				      {600,700,800},
				      {900, 1000},
			
		           };
		
		System.out.println("no of rows:"+ b.length);
		System.out.println("no of columns:"+ b[3].length);
		System.out.println("no of columns:"+ b[2].length);
		
		
		for(int i=0; i<=b.length-1; i++)
		{
		for(int j=0; j<=b[i].length-1; j++)
		{
			System.out.print(b[i][j]+" ");
		}
		
		System.out.println();
		}
		
		
		
	}

}

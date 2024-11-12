package Array;

public class ArrayClass2D {

	
	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4,5},
				     {6,7,8,9,10}};
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		
for (int row=0; row<=1; row++) 									// here the logic for printing numbers in sequel
	{
	for (int col=0; col<=4; col++) 
	{
	System.out.println(a[row][col]);
	}
	System.out.println();
	}
	
}
}

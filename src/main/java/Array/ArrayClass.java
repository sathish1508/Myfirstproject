package Array;

public class ArrayClass {

//	Array = Array is collection of elements
//	we can store only homogeniuos(one type of data) data in array
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		String name[] = {"Apple", "Ball", "Cat"};
		boolean bool[] = {true, false, true};
		double d[] = {11.2, 12.3, 13.5};
		
//		System.out.println(a[0]);  // Prints the index value in the Array
//		System.out.println(a.length); // length = number of units in the array 
		
//		for(int i=0; i<a.length; i++) {
//				System.out.println(a[i]);  // Prints out all the numbers in the array in order
//			}
//
//		for(int obj:a) {
//			System.out.println(obj); // Array of Object
//		}

		int sum = 0;
		
		for(int i=0; i<a.length; i++) { // for loop {  print statement should be in brackets}
//			System.out.println(a[i]);
			sum = sum+a[i];
		}
		System.out.println(sum);
		}

}

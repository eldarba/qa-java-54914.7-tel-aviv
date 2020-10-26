package c.arrays.bounds;

public class Demo1Bounds {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		System.out.println("length: " + arr.length);
		
		System.out.println(arr[0]);
		System.out.println(arr[4]);

		// out of array index bounds
		System.out.println(arr[5]); // error
		System.out.println(arr[-1]); // error

	}

}

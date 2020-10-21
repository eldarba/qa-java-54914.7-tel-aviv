package d.arrays;

public class Demo1 {

	public static void main(String[] args) {
		
//		int[] =====> array of int elements
		
		int[] arr = new int[5];
		
		System.out.println("array length: " + arr.length);
		
		// add elements
		arr[0] = 200;
		arr[1] = 300;
		arr[4] = 5;
		
		// access element
		
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		

	}

}

package f.arrays.forEach;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8 };

		// for loop - index
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("======================");
		
		// for-each - no index but reference to current element
		for(int currElement: arr) {
			System.out.println(currElement);
		}

	}

}

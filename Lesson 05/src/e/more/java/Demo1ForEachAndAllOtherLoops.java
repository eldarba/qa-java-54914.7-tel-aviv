package e.more.java;

public class Demo1ForEachAndAllOtherLoops {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8 };
		
		// iterating array using "do-while" loop
		int m = 0;
		do {
			System.out.print(arr[m] + ", ");
			m++;
		}while(m < arr.length);
		System.out.println();
		System.out.println("===============================");

		// iterating array using "while" loop
		int c = 0;
		while (c < arr.length) {
			System.out.print(arr[c] + ", ");
			c++;
		}
		System.out.println();
		System.out.println("===============================");
		
		// iterating array using "for" loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		// iterating array using "for-each" loop
		System.out.println("===============================");
		for(int x : arr) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}

}

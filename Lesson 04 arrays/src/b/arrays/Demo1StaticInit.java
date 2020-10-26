package b.arrays;

import java.util.Arrays;

public class Demo1StaticInit {

	public static void main(String[] args) {

		// dynamic initialization
		int[] arr1 = new int[3];

		// change the values later
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;

		// static initialization
		int[] arr2 = { 2, 4, 6, 8 };

		// print the array by iterating it with a loop
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		// print array using the Arrays.toString(arr) method
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}

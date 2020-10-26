package b.arrays.dimentions;

import java.util.Arrays;

public class Demo3StaticInit {

	public static void main(String[] args) {
		
		int[][] arr = { { 1, 2, 3, 4 }, { 10, 20 }, { 9, 8, 7, 6, 5 } };
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}

}

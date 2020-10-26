package d.arrays.copy;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		// create the original array
		int[] arr = { 2, 4, 6 };
		System.out.println(Arrays.toString(arr));
		
		// to resize create another array
		int[] arrTemp = new int[arr.length + 2];
//		System.out.println(Arrays.toString(arrTemp));
		
		// array copy (from original to the new array)
		System.arraycopy(arr, 0, arrTemp, 0, arr.length);
//		System.out.println(Arrays.toString(arrTemp));
		
		// Reassign address of arr to the new array object
		arr = arrTemp;
		System.out.println(Arrays.toString(arr));

	}

}

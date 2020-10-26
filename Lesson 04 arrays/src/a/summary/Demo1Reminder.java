package a.summary;

import java.util.Scanner;

public class Demo1Reminder {

	public static void main(String[] args) {
		
		// java data types (simple - primitives, complex - objects)
		// primitive data types

		// numeral integers
		byte n1 = 10;
		short n2 = 10;
		int n3 = 10;
		long n4 = 10L;
		// numeral decimals
		float f1 = 5.3F;
		double f2 = 6.98D;

		// logical
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = n1 == n2;

		// character
		char c1 = 'A';
		char c2 = 'à';
		char c3 = '.';
		char c4 = '1';

		// ================== flow control

		// if
		if (n1 == n2) {
			// concatenation of data to a single String object
			System.out.println("n1 and n2 are equals: " + n1 + ", " + n2);
		}

		// if
		if (n1 != n2) {
			// concatenation of data to a single String object
			System.out.println("n1 and n2 are not equals: " + n1 + ", " + n2);
		}

		// if - else
		if (n1 == n2) {
			// concatenation of data to a single String object
			System.out.println("n1 and n2 are equals: " + n1 + ", " + n2);
		} else {
			System.out.println("n1 and n2 are not equals: " + n1 + ", " + n2);
		}

		// if - else if
		if (n1 == n2) {
			System.out.println("n1 and n2 are equals: " + n1 + ", " + n2);
		} else if (n1 == n3) {
			System.out.println("n1 and n3 are equals: " + n1 + ", " + n3);
		} else if (n1 == n4) {
			System.out.println("n1 and n4 are equals: " + n1 + ", " + n4);
		} else {
			System.out.println("non are equals");
		}

		// switch
		switch (n1) {
		case 100:
			System.out.println("one hundred");
			break;
		case 10:
			System.out.println("ten");
			break;
		case 0:
			System.out.println("zero");
			break;

		default:
			System.out.println("something else");
			break;
		}

		// loops
		System.out.println(" ========= loops");

		// while loop
		while (n4 != 0) {
			System.out.println(n4);
			n4 = n4 / 10;
		}

		System.out.println(" ========= loops");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// arrays
		System.out.println(" ========= arrays");
		int[] arr1 = new int[5];
		arr1[3] = (int) (Math.random() * 101); // random int [0 - 100]
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);

		System.out.println(" ========= arrays");
		String[] arr2 = new String[3];

		// input
		System.out.println(" ========= arrays");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some text");
		arr2[0] = sc.nextLine();
		System.out.println("enter some text");
		arr2[1] = sc.nextLine();
		System.out.println("enter some text");
		arr2[2] = sc.nextLine();
		sc.close();

		System.out.println("printing the array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}

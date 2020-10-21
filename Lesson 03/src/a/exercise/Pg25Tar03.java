package a.exercise;

import java.util.Scanner;

public class Pg25Tar03 {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);

		// get n from user
		System.out.print("enter a number: ");
		int n = sc.nextInt();

		System.out.println("n is " + n);

		for (int i = 0; i <= n; i+=2) {
			System.out.println(i);
		}
		
//		for (int i = 0; i <= n; i++) {
//			if (i % 2 == 0) { // check that i is even
//				System.out.println(i);
//			}
//		}
		
		sc.close();

	}

}

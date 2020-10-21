package a.exercise;

import java.util.Scanner;

public class Pg25Tar01 {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		// prompt user for input
		System.out.print("enter a positive integer: ");
		// take input from user
		int top = sc.nextInt();
		// close the scanner
		sc.close();

		// print all numbers from 1 to top inclusive
		for (int i = 1; i <= top; i++) {
			System.out.println(i);
		}
	}

}

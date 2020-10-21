package a.exercise;

import java.util.Scanner;

public class Pg25Tar10RightDigit {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		int rd = n % 10;
		System.out.println("right digit of " + n + " is " + rd);

		// =========================================
		sc.close();
	}

}

package a.exercise;

import java.util.Scanner;

public class Pg25Tar05 {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.print("enter a number: ");
		int n = sc.nextInt();

		while (n != -99) {
			if (n > 0) { // make sure we add only positive numbers
				sum += n;
			}
			System.out.print("enter another number: ");
			n = sc.nextInt();
		}

		System.out.println("sum = " + sum);

		// =========================================
		sc.close();
	}

}

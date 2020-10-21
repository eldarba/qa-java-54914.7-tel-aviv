package a.exercise;

import java.util.Scanner;

public class Pg25Tar10 {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		int nCopy = n;
		
		while(n > 9) {
			n = n/10;
//			System.out.println(n);
		}
		
		
		System.out.println("left digit of " + nCopy + " is " + n);

		// =========================================
		sc.close();
	}

}

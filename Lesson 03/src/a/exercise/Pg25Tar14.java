package a.exercise;

import java.util.Scanner;

public class Pg25Tar14 {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int a = sc.nextInt();
		System.out.println("the number is " + a);
		
		int b = 0;
		
		while(a != 0) {
			// 1. multiply b by 10
			b = b * 10;
			// 2. get right digit of a and add to b
			int rd = a % 10;
			b = b + rd;
			// 3. divide a by 10
			a = a / 10;
		}
		
		System.out.println("the invert number is " + b);
		

		// =========================================
		sc.close();
	}

}

package a.exercise;

import java.util.Scanner;

public class Pg25Tar15 {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int aCopy = sc.nextInt();
		int a = aCopy;
//		System.out.println("the number is " + aCopy);
		
		int b = 0;
		
		while(aCopy != 0) {
			// 1. multiply b by 10
			b = b * 10;
			// 2. get right digit of a and add to b
			int rd = aCopy % 10;
			b = b + rd;
			// 3. divide a by 10
			aCopy = aCopy / 10;
		}
		
//		System.out.println("the invert number is " + b);
		
		if(a==b) {
			System.out.println("Palindrom");
		}else {
			System.out.println("NOT Palindrom");
		}
		
		
		

		// =========================================
		sc.close();
	}

}

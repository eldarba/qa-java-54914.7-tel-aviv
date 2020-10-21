package b.loops;

import java.util.Scanner;

public class Demo4Nesting {

	public static void main(String[] args) {

		// 1. get n as input from user
		// 2. get lines as input from user
		// 3. print the required number of line of n *, 
		// you have 5 minutes
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number of * you want us to print: ");
		int n = sc.nextInt();
		
		System.out.print("enter number of lines you want us to print: ");
		int lines = sc.nextInt();
		
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		
		sc.close();

		
	
	}

}

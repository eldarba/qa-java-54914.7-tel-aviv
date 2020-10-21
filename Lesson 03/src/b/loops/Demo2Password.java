package b.loops;

import java.util.Scanner;

public class Demo2Password {

	public static void main(String[] args) {
		
		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		
		int password = 123;
		int input;
		
		do {
			System.out.print("enter password: ");
			input = sc.nextInt();
		}while(input != password);
		
		System.out.println("You are logged in");
		

		// ==============
		sc.close();
	}

}

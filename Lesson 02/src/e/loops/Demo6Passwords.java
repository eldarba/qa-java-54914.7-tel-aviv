package e.loops;

import java.util.Scanner;

public class Demo6Passwords {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int systemPass = 1234;
		System.out.print("enter password: ");
		int userInput = sc.nextInt();
		
		while(userInput != systemPass) {
			System.out.print("enter password: ");
			userInput = sc.nextInt();
		}
		
		System.out.println("you are logged in");
		sc.close();
		
		

	}
}

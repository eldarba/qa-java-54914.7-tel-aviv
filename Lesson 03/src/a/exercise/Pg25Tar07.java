package a.exercise;

import java.util.Scanner;

public class Pg25Tar07 {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first number: ");
		int n = sc.nextInt();
		int max = n;
		
		while(n > 0) {
			if(n > max) {
				max = n; // update the max to the current value
			}
			System.out.print("enter another number: ");
			n = sc.nextInt();
		}
		
		System.out.println("max is: " + max);

		// =========================================
		sc.close();
	}

}

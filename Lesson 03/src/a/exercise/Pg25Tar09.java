package a.exercise;

import java.util.Scanner;

public class Pg25Tar09 {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		int max = 0; // initialize max to 0
		int indexMax = -1;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("enter a number");
			int n = sc.nextInt();
			if(n > max) {
				max = n;
				indexMax = i;
			}
		}
		
		System.out.println("index of max: " + indexMax);

		// =========================================
		sc.close();
	}

}

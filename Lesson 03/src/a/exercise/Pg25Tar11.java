package a.exercise;

import java.util.Scanner;

public class Pg25Tar11 {

	public static void main(String[] args) {

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int n = sc.nextInt();
		System.out.println("the number: " + n);
		
		int c = 0;
		
		while(n != 0) {
			c++;
			n = n / 10;
		}
		
		if(c==0) {
			c = 1;
		}
		
		System.out.println("number of digits: " + c);
		

		// =========================================
		sc.close();
	}

}

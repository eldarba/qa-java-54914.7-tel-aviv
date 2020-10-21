package a.exercise;

import java.util.Scanner;

public class Pg25Tar02 {

	public static void main(String[] args) {

		int a, b;

		// create a scanner for input operations
		Scanner sc = new Scanner(System.in);

		// get a and b from user
		System.out.print("enter first number: ");
		a = sc.nextInt();
		System.out.print("enter second number: ");
		b = sc.nextInt();
		sc.close();
		
		// make sure a is smaller than b
		if(a > b) {
			// switch a and b
			int temp = a;
			a = b;
			b = temp;
		}

		System.out.println("a=" + a + ", b=" + b);

		for (int i = a; i <= b; i++) {
			System.out.print(i + ", ");
		}

	}

}

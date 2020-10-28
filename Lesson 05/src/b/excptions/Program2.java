package b.excptions;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		System.out.println("== start ==");
		
		Scanner sc = new java.util.Scanner(System.in);
		
		try {
			System.out.print("enter 1st number: ");
			int a = sc.nextInt();
			System.out.print("enter 2nd number: ");
			int b = sc.nextInt();
			
			System.out.println(a + " : " + b + " = " + a / b);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
		}

		sc.close();
		System.out.println("== stop ===");

	}

}

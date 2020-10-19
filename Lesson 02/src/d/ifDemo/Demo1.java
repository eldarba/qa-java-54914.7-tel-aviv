package d.ifDemo;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number: ");
		a = sc.nextInt();
		System.out.print("enter second number: ");
		b = sc.nextInt();
		sc.close();
		
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
		
		if(sum > 100) {
			System.out.println("Big");
		}else {
			System.out.println("Small");
		}
		
		// הפסקה עד 11:55
	}

}

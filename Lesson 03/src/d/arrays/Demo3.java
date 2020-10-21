package d.arrays;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] names = new String[5];

		for (int i = 0; i < names.length; i++) {
			System.out.print("enter name: ");
			names[i] = sc.nextLine();
		}
		sc.close();
		
		System.out.println("thank you");
		System.out.println("printing names");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		

	}

}

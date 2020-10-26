package b.arrays.dimentions;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2Theater {

	public static void main(String[] args) {
		
		String[][] theater = new String[3][];
		
		theater[0] = new String[5];
		theater[1] = new String[7];
		theater[2] = new String[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter name: ");
		String name = sc.nextLine();
		
		System.out.print("enter row number: ");
		int row = sc.nextInt() - 1;
		
		System.out.print("enter seat number: ");
		int seat = sc.nextInt() - 1;
		
		theater[row][seat] = name;
		
		// print to see that they are seated
		for (int i = 0; i < theater.length; i++) {
			System.out.println(Arrays.toString(theater[i]));
		}
		
		sc.close();
		
		

	}

}

package b.arrays.dimentions;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2TheaterLoop {

	public static void main(String[] args) {
		
		String[][] theater = new String[3][];
		
		theater[0] = new String[5];
		theater[1] = new String[7];
		theater[2] = new String[10];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("=== admit person #" + i);
			// ================
			System.out.print("enter name: ");
			String name = sc.nextLine();
			
			System.out.print("enter row number: ");
//			int row = sc.nextInt() - 1; // error
			int row = Integer.parseInt(sc.nextLine()) - 1;
			
			System.out.print("enter seat number: ");
//			int seat = sc.nextInt() - 1;
			int seat = Integer.parseInt(sc.nextLine()) - 1;
			
			if(theater[row][seat] == null) {
				theater[row][seat] = name;
			}else {
				System.out.println("sori this seat is taken by " + theater[row][seat]);
			}
			// ================
		}
		
		// print to see that they are seated
		System.out.println("\nprinting theater");
		for (int i = 0; i < theater.length; i++) {
			System.out.println(Arrays.toString(theater[i]));
		}
		
		sc.close();
		
		

	}

}

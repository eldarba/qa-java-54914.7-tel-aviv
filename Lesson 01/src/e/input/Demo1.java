package e.input;

import java.util.Scanner;

//import declaration (for the user convenience)

public class Demo1 {

	public static void main(String[] args) {
		
		// in order to get input we need an input object
		// such an object is called Scanner
		
		// input source is usually the keyboard
		
		// keyboard is: System.in
		
		//================================
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int x = sc.nextInt(); // the scanner will wait for input (user should give input and click enter)
		System.out.println(x);
		
		sc.close(); // close the scanner when you are done
	}

}

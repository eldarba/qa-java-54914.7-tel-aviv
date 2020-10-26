package e.arrays;

import java.util.Scanner;

public class TriviaGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to our Trivia game");
		System.out.println("Please enter your name below");

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println("Hello " + name + " nice to meet you");
		
		// ============== array
		
		String text = "What is the capital of Albania?";
		System.out.println(text);
		
		String[] options = new String[4];
		options[0] = "Jerusalem";
		options[1] = "Tirana";
		options[2] = "New York";
		options[3] = "Samarkand";
		
		for (int j = 0; j < options.length; j++) {
			System.out.println((j + 1) + "." + options[j]);
		}
		// ============== array
		
		System.out.print("Your answer: ");
		int userAnswer = sc.nextInt();
		
		if (userAnswer == 2) {
			System.out.println("Correct answer!");
		} else {
			System.out.println("Wrong answer!");
		}

		sc.close();

	}

}

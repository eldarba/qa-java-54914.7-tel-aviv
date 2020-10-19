package a;

import java.util.Scanner;

public class TriviaGame {

	public static void main(String[] args) {

		System.out.println("Welcome to our Trivia game");
		System.out.println("Please enter your name below");

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println("Hello " + name + " nice to meet you");

		// ====================== part 2
		String questionText = "What is the capital of Albania?";
		System.out.println(questionText);
		System.out.println("1 ...... Jerusalem");
		System.out.println("2 ...... Tirana");
		System.out.println("3 ...... New York");
		System.out.println("4 ...... Samarkand");
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

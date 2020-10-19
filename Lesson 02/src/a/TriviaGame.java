package a;

import java.util.Scanner;

public class TriviaGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to our Trivia game");
		System.out.println("Please enter your name below");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("Hello " + name + " nice to meet you");
		sc.close();
	}

}

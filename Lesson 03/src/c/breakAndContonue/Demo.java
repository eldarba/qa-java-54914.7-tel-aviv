package c.breakAndContonue;

public class Demo {

	public static void main(String[] args) {

		// 7 boom game

		for (int i = 1; i <= 1000; i++) {

			// print boom instead of numbers that divides by 7 (x%7==0)

			if (i % 7 == 0) {
				System.out.println("BOOM");
				continue;
			}

			System.out.println(i);

		}
	}

}

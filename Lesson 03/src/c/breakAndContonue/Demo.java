package c.breakAndContonue;

public class Demo {

	public static void main(String[] args) {

		// 7 boom game

		lbl: for (int i = 1; i <= 1000; i++) {

			// print boom instead of numbers that divides by 7 (x%7==0)
			if (i % 7 == 0) {
				System.out.println("BOOM");
				continue;
			}

			// print boom instead of numbers that contains the digit 7
			int c = i;
			while (c != 0) {
				if (c % 10 == 7) {
					System.out.println("BOOM");
					continue lbl;
				}
				c = c / 10;
			}

			System.out.println(i);

		}
	}

}

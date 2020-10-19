package e.loops;

public class Demo7forLoop {

	public static void main(String[] args) {

		{// while loop

			int c = 1;
			while (c <= 10) {
				System.out.println(c);
				c++;
			}

		}

		System.out.println("================");

		{ // for loop (index)

			for (int c = 1; c <= 10; c++) {
				System.out.println(c);
			}

		}

		System.out.println("================");

		{
			for (char c = 'A'; c <= 'Z'; c++) {
				System.out.print(c + ", ");
			}
			System.out.println();
		}
		System.out.println("================");
		
		{
			for (char c = 'à'; c <= 'ú'; c++) {
				System.out.print(c + ", ");
			}
			System.out.println();
		}

	}

}

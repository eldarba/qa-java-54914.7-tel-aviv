package e.loops;

public class Demo2While {

	public static void main(String[] args) {

		int c = 1;
		int r;

		while (c <= 10) {
			r = (int) (Math.random() * 11);
			System.out.println(c + ":\t" + r);
			c++;
		}
		System.out.println("===========");

	}

}

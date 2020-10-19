package e.loops;

public class Demo2Sum {

	public static void main(String[] args) {

		int c = 1;
		int sum = 0;
		int r;

		while (c <= 10) {
			r = (int) (Math.random() * 11);
			System.out.println(c + ":\t" + r);
			sum += r;
			c++;
		}
		System.out.println("===========");
		System.out.println("sum: " + sum);

		double avg = sum / 10D;
		System.out.println("average: " + avg);

	}

}

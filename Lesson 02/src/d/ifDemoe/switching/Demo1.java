package d.ifDemoe.switching;

public class Demo1 {

	public static void main(String[] args) {
		// 1 - 4
		int key = (int) (Math.random() * 6) + 1;
		System.out.println(key);

		switch (key) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default:
			System.out.println(key + " is not a valid value (1, 2, 3, 4 only)");
		}

	}

}

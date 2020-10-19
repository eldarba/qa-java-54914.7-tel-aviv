package d.ifDemoe.switching;

public class Demo2 {

	public static void main(String[] args) {
		int day = (int) (Math.random() * 7) + 1;
		System.out.println("day: " + day);

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println(day + " is not a valid value for a day");
		}

	}

}

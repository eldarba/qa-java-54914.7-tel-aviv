package d.ifDemo;

public class Demo2 {

	public static void main(String[] args) {

		int g = (int) (Math.random() * 15);
		System.out.println("grade is: " + g);

		if (g < 5) {
			System.out.println("fail");
		} else if (g < 7) {
			System.out.println("pass");
		} else if (g < 10) {
			System.out.println("good");
		} else if (g == 10) {
			System.out.println("great");
		}else {
			System.out.println(g + " is not a valid grade value");
		}
		
		System.out.println("== end ==");
	}

}

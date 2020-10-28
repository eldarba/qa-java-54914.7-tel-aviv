package b.excptions;

public class Program1 {

	public static void main(String[] args) {

		System.out.println("== start ==");
		
		// try-catch construct
		// used for handling exceptions (errors)
		// prevents the program from stopping
		try {
			// original plan
			System.out.println(20 / 0);
		} catch (Exception e) {
			// plan B
//			System.out.println("error: " + e.getMessage());
//			System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("== stop ===");

	}

}

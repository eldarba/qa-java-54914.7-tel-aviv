package b;

public class Demo2Methods {
	
	static int g; // global - initialized automatically
	
	public static void main(String[] args) {
		
		double a = 10;
		double b = 3;
		System.out.println(a + ", " + b);
		
		double x = sum(a, b);
		System.out.println("sum: " + x);
		
		System.out.println("subtract: " + subtract(a, b));
		System.out.println("multiply: " + multiply(a, b));
		System.out.println("divide: " + divide(a, b));
	}

	// define a sum method
	static double sum(double a, double b) {
		double sum; // local variable - not initialized automatically
		sum = a + b;
		return sum;
		// the parameters a, b and the variable sum are local
	}
	
	// define a subtract method - חיסור
	static double subtract(double a, double b) {
		return a - b;
	}
	
	// define a multiplication method named multiply
	static double multiply(double a, double b) {
		return a * b;
	}
	// define a division method named divide
	static double divide(double a, double b) {
		return a / b;
	}
	
	


}
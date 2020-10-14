package c.types.primitives;

public class Demo3Numerals {
	
	public static void main(String[] args) {
		// NUMERALS
		
		// integers
		byte n1 = 10; // 8 bit
		short n2 = 10; // 16 bit
		int n3 = 10; // 32 bit
		long n4 = 10; // 64 bit
		
		// decimals
		float f1 = 5.2F; // 32 bit
		double f2 = 5.325; // 64 bit
		
		// literls  (5   5.32) have a default type
		// literal integer is of type int by default
		// literal decimal is of type double by default
		// to change the literal default type we use suffix
		// D - double
		// F - float
		// L - long
		
		System.out.println(3.3333333333333333333333333333333333333333333333333333D);
		System.out.println(3.3333333333333333333333333333333333333333333333333333F);
		
		long x = 9999999999L;
		
		System.out.println(5);
		System.out.println(5D);
		
		System.out.println("======================");
		// overflow
		byte num1 = 127;
		System.out.println(num1);

		num1++;
		System.out.println(num1);
		
		// primitives - simple type
		// objects - complex type
		// String is not a primitive - it is an object
		System.out.println("555555555555555555555555555555555555555555555555");
		
		// =======================================
		// הפסקה עד
		// 15:05
		// =======================================
		
		
	}

}

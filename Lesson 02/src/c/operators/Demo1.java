package c.operators;

public class Demo1 {

	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		x = x + 1;
		System.out.println(x);
		x++; // x = x + 1;
		System.out.println(x);
		x--; // x = x - 1;
		System.out.println(x);
		System.out.println("=============");
		System.out.println(x++); // print + increment
		System.out.println(++x); // increment + print
		System.out.println(x);
		System.out.println("=============");
		int a = -10;
		System.out.println(a);
		System.out.println(-a);
		System.out.println("=============");
		// % operator (modulus) - returns the remainder of division
		System.out.println("11 / 3 = " + 11 / 3);
		System.out.println("11 % 3 = " + 11 % 3);

		System.out.println("=============");
		System.out.println(10 == 10);
		System.out.println(10 != 10);
		System.out.println("NOT operator: " + !(10 == 10));

		System.out.println("=============");
		int x1 = 100, y1 = 105;
		int max = x1 > y1 ? x1 : y1; // _?_:_ this is ternary operators
		System.out.println(max);
		System.out.println("=============");
		int num;
		num = 5;
		
		num = num + 12;
		num += 5; // same as above but shorter

		num = num - 5;
		num -= 5; // same as above but shorter
		
		num = num *2;
		num *= 2; // same as above but shorter

		num = num /2;
		num /= 2; // same as above but shorter

	}

}

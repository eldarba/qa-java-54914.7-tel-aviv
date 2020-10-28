package c.applicationSystem;

import java.util.Scanner;

import a.Person;

public class Test {

	public static void main(String[] args) {
		Theater t = new Theater();
		t.display();

		Scanner sc = new java.util.Scanner(System.in);

		while (true) {
			System.out.println("admit person to theater");
			Person p = new Person();
			System.out.print("enter name: ");
			p.setName(sc.nextLine());
			System.out.print("enter id: ");
			p.setId(Integer.parseInt(sc.nextLine()));
			System.out.print("choose row: ");
			int row = Integer.parseInt(sc.nextLine());
			System.out.print("choose seat: ");
			int seat = Integer.parseInt(sc.nextLine());

			try {
				t.admitViewer(p, row, seat);
			}catch (Exception e) {
				System.out.println("error in row / seat number");
			}
			t.display();

			System.out.println("admit more? 1 (yes), 2 (no)");

			int x = Integer.parseInt(sc.nextLine());

			if (x != 1) {
				break;
			}
		}
		sc.close();
		
		System.out.println("Bye");
	}

}

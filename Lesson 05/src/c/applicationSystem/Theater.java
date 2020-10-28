package c.applicationSystem;

import a.Person;

public class Theater {

	private Person[][] viewrs = new Person[3][5];

	public void display() {
		System.out.println("============= screen ===============");
		for (int i = 0; i < viewrs.length; i++) {
			for (int j = 0; j < viewrs[i].length; j++) {
				Person p = viewrs[i][j];
				if (p == null) {
					System.out.print("   O   ");
				} else {
					System.out.print("   X   ");
				}
			}
			System.out.println();
		}
	}

	public void admitViewer(Person viewer) {
		for (int i = 0; i < viewrs.length; i++) {
			for (int j = 0; j < viewrs[i].length; j++) {
				if (viewrs[i][j] == null) {
					viewrs[i][j] = viewer;
					return;
				}
			}
		}
		System.out.println("sori, theater is full");
	}
	
	// method overload
	/**
	 * admit a viewer to the specified row and seat. first row is 1, first seat 1. 
	 * */
	public void admitViewer(Person viewer, int row, int seat) {
		row--; // adjust to array index (starts at 0)
		seat--; // adjust to array index (starts at 0)
		if(viewrs[row][seat] == null) {
			viewrs[row][seat] = viewer;
		}else {
			System.out.println("sori. this seat is taken");
		}
	}
	
	

}

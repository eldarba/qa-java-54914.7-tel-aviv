package y.extra.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo1 {
	
	public static void main(String[] args) {
		
		LocalDate dateNow = LocalDate.now();
		System.out.println(dateNow);
		
		// 25/4/1987
		LocalDate date1 = LocalDate.of(1987, 4, 25);
		System.out.println(date1);
		
		LocalDate date2 = date1.plusDays(15);
		System.out.println(date2);
		
		// =================================
		System.out.println("======================");
		LocalDateTime dtNow = LocalDateTime.now();
		System.out.println(dtNow);
		
		System.out.println("======================");
		LocalDate datePavel = LocalDate.of(1752, 9, 13); // check with sql
		System.out.println(datePavel);
	}

}

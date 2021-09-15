package silver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Silver1036 {
	public static void main(String[] args) {
	    LocalDate date1 = LocalDate.now();
	    LocalDate date2 = LocalDate.of(2021, 9, 11);
	    LocalDate date3 = LocalDate.parse("2021-09-11",DateTimeFormatter.ISO_DATE);
	    System.out.println(date1);
	    System.out.println(date2);
	    System.out.println(date3);
	}

}

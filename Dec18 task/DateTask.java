package Dec19;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTask {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd//MM//yyyy");
		Scanner input=new Scanner(System.in);
		String format=input.nextLine();
		LocalDate date=LocalDate.parse(format,dtf);
	
        LocalDate newDate = date.plusDays(4).plusMonths(4).plusYears(4);


        System.out.println("Original date: " + date);
        System.out.println("New date after adding 4 days, 4 months, and 4 years: " + newDate);
		

	}

}

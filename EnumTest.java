package Class20;

import java.util.Scanner;

public class EnumTest {
	
	enum Day{Monday,Thuseday,Wenesday}
	public static void main(String args[]) {
		
		Scanner  input=new Scanner(System.in);
		System.out.println("Enter your days:");
		String day=input.nextLine();
		
		Day d=Day.valueOf(day);
		switch(d) {
		case Monday:
			System.out.println("good day for Monday.");
			break;
		case Thuseday:
			System.out.println("bad day for Thuseday.");
			break;
		}
			
			
		}
	}


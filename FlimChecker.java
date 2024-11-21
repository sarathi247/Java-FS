package Class20;

import java.util.Scanner;

public class FlimChecker {
	
	
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Select Actor/Actress:");
		System.out.println("1.Vijay \n2.Rajini \n3.Kamal \n4.Samantha ");
		System.out.println("Entre your Choice:");
		int choice=input.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("Select Movie:");
			System.out.println("1.Thuppakki \n2.Mersal \n3.Kaththi \n4.Beast \n5.Puli");
			System.out.println("Entre your Choice:");
			int vijaymovie=input.nextInt();
			switch(vijaymovie) {
			case 1:
				System.out.println("Thuppakki is a Blockbuster.");
				break;
			case 2:
				System.out.println("Mersal is a Blockbuster.");
				break;
			case 3:
				System.out.println("Kaththi is a Blockbuster.");
				break;
			case 4:
				System.out.println("Beast is a flop.");
				break;
			case 5:
				System.out.println("Puli is a flop.");
				break;
			default:
				System.out.println("Invalid choice for Vijay moive.");
			}
			break;
			
		case 2:
			System.out.println("Select Movie:"); 
			System.out.println("1.Sivaji \n2.Enthiran \n3.Padayappa \n4.Enthiran 2.0 \n5.Lingaa");
			System.out.println("Entre your Choice:");
			int rajinimovie=input.nextInt();
			switch(rajinimovie) {
			case 1:
				System.out.println("Sivaji is a Blockbuster.");
				break;
			case 2:
				System.out.println("Enthiran is a Blockbuster.");
				break;
			case 3:
				System.out.println("Padayappa is a Blockbuster.");
				break;
			case 4:
				System.out.println("Enthiran 2.0 is a flop.");
				break;
			case 5:
				System.out.println("Lingaa is a flop.");
				break;
			default:
				System.out.println("Invalid choice for Rajini moive.");
			}
			break;
		case 3:
			System.out.println("Select Movie:"); 
			System.out.println("1.Vikram \n2.Dasavathaaram \n3.Indain \n4.Pammal K.Sambandam \n5.Anbe Sivam");
			System.out.println("Entre your Choice:");
			int kamalmovie=input.nextInt();
			switch(kamalmovie) {
			case 1:
				System.out.println("Vikram is a Blockbuster.");
				break;
			case 2:
				System.out.println("Dasavathaaram is a Blockbuster.");
				break;
			case 3:
				System.out.println("Indain is a Blockbuster.");
				break;
			case 4:
				System.out.println("Pammal K.Sambandam 2.0 is a flop.");
				break;
			case 5:
				System.out.println("Anbe Sivam is a flop.");
				break;
			default:
				System.out.println("Invalid choice for Kamal moive.");
			}
			break;
			
		case 4:
			System.out.println("Samantha and choise actor.");
			System.out.println("1.Vijay\n2.Suriya");
			int samantha=input.nextInt();
			switch(samantha) {
			case 1:
				System.out.println("Kaththi for Vijay & Samantha.");
				System.out.println("Theri for Vijay & Samantha.");
				break;
			case 2:
				System.out.println("Anjaan for Suriya & Samantha");
				break;
				
				
			}
			break;
			
			
		}
		
	}

}

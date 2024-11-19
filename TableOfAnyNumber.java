package Allprograming;

import java.util.Scanner;

public class TableOfAnyNumber {
	
	public static void Table() {
		System.out.println("Weclome to the Tables....");
		Scanner table=new Scanner(System.in);
		System.out.println("Enter Your number:");
		int number=table.nextInt();
		for (int i=1;i<=10;i++) {
			int mult=i*number;
			System.out.println(i+"*"+number+"="+mult);
			
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Table();

	}

}

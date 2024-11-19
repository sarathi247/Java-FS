package Allprograming;

import java.util.Scanner;

public class Even_Odd {
	
	public static void Even_Odd() {
		System.out.println("Welcome to the program of Even or Odd...");
		Scanner num=new Scanner(System.in);
		System.out.println("Enter your number:");
		int a=num.nextInt();
		
		if(a%2==0) {
			System.out.println(a+" is Even number.");
		}
		else {
			System.out.println(a+" is Odd number.");
		}
		
		
	}
	
	public static void main(String args[]) {
		
		Even_Odd();
	}

}

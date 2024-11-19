package Allprograming;

import java.util.Scanner;

public class FindLeapOrNot {
	
	public static void main(String args[]) {
		Scanner year=new Scanner(System.in);
		System.out.println("Enter your year:");
		int no=year.nextInt();
		if(no%4==0) {
			System.out.println(no+" It is Leap year.");
		}
		else {
			System.out.println(no+" It is not leap year.");
		}
	}

}

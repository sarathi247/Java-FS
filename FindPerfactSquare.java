package Allprograming;

import java.util.*;

public class FindPerfactSquare {
	
	

	public static void main(String[] args) {
		
		square();
		

	}

public static void square() {
	
	Scanner number=new Scanner(System.in);
	System.out.println("Find the number is perfact square:");
	int num=number.nextInt();
	boolean isperfactsquare=false;
	for(int i=1;i*i<=num;i++) {
		if(i*i==num) {
			isperfactsquare=true;
			break;
		}
	}
	
	if(isperfactsquare) {
		System.out.println(num+" is a perfact square.");
	}
	else {
		System.out.println(num+" is not a perfact square.");
	}
	
	
	
	
	
	
		
	}
	
}

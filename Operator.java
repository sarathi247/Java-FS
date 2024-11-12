package Allprograming;

import java.util.Scanner;

public class Operator {
public static void main(String[] args) {
	
	System.out.println("Weclome to operators.....");
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter your first number:");
	int a=obj.nextInt();
	System.out.println("Enter your second number:");
	int b=obj.nextInt();
	System.out.println("Addition value is:"+(a+b));
	System.out.println("Subraction value is:"+(a-b));
	System.out.println("Mutipucation value is:"+(a*b));
	System.out.println("Divistion value is:"+(a/b));
	
}
}

package Allprograming;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Name,Age,Salary,Short,float,Long...");
		System.out.println("Enter your name:");
		String name=obj.nextLine();
		System.out.println("Enter your age:");
		int age=obj.nextInt();
		System.out.println("Enter your salary:");
		double salary=obj.nextDouble();
		System.out.println("Enter float value: ");
		float floatvalue=obj.nextFloat();
		System.out.println("Enter short value:");
		short shortvalue =obj.nextShort();
		System.out.println("Enter byte value:");
		byte bytevalue=obj.nextByte();
		System.out.println("Your are 18 years old(true or false)");
		boolean booleanvalue=obj.nextBoolean();
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Float:"+floatvalue);
		System.out.println("Short:"+shortvalue);
		System.out.println("Byte:"+bytevalue);
		System.out.println("Boolean:"+booleanvalue);
		
		
	}

}

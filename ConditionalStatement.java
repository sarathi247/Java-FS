package Allprograming;
import java.util.Scanner;
public class ConditionalStatement {

	public static void main(String[] args) {
		// Conditional Statement programming
		
		Scanner obj=new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Enter your name:");
		name=obj.nextLine();
		System.out.println("Enter your age:");
		age=obj.nextInt();
		
		if(age>=18) {
			System.out.println("Hi "+ name+" you eligibile in your voter "+age+".");
		}
		else{
			System.out.println("Hi "+name+" you not eligibile in your voter "+age+".");
		}

	}

}

package Allprograming;
import java.util.*;

public class FindMultiple {

	public static void main(String[] args) {
		// To Find 2 Multiple or not
		System.out.println("Weclome to  the program 2 is multiple or not.");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your Number:");
		int num=obj.nextInt();                    //Give User input.
		
		if(num%2==0) {                                         // if it is true print this statement.
															   
			System.out.println(num+" it is a multipe of 2.");
		}
		else {                                                //if it is false print the else statement.
			System.out.println(num+" it is a not multipe of 2.");
		}
	}

}

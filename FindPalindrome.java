package Allprograming;
import java.util.*;

public class FindPalindrome {
	
	public static void main(String args[]) {
		
		Scanner fp= new Scanner(System.in);
		
		System.out.println("Enter your string if it is a palidrome:");
		String str=fp.nextLine();
		String reversedstr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversedstr +=str.charAt(i);
		}
		
		if(str.equals(reversedstr)) {
			System.out.println("\""+str+"\" is a palidrome.");
		}
		else {
			System.out.println("\""+str+"\" is not a palidrome.");
		}
		
		
		
		
		
	}

}

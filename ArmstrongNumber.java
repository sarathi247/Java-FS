package Allprograming;

public class ArmstrongNumber {
	
	public static void ArmstrongNumber() {
		System.out.println("....Weclome to find Armstrong Numbere....");
		int num=153,temp=num,sum=0;
		while(temp>0) {
			int digit=temp%10;
			temp=temp/10;
			sum=sum+(digit*digit*digit);
		}
		if(sum==num) {
			System.out.println(num+" is Armstrong Number.");
		}
		else {
			System.out.println(num+" is Not Armstrong Number.");
		}
		
		
	}
	
	
	
	public static void main(String args[]) {
		ArmstrongNumber();
		
	}

}

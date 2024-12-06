package Java_Test;



class details{
	String name="Sarathi",type="Preminum";
	int duration=1,gumfee=3000,pertrainer=500,spafee=500;
	int total=gumfee+pertrainer+spafee;
	
	int month=1;
	
	
	
	public void display() {
		
		System.out.println("Member Name:"+name);
		System.out.println("Membership type:"+type);
		System.out.println("Duration:"+duration);
		System.out.println("GumFee:"+gumfee);
		System.out.println("Pertrainer:"+pertrainer);
		System.out.println("SpaFee:"+spafee);
		System.out.println("Total:"+total);
		
	}
	
	public void Menfee() {
		System.out.println("Gym Member Ship:"
				+"\nSliver:"+gumfee*month+
				"\nnGold:"+(gumfee+pertrainer)*month+
				"\nPreminum:"+(gumfee+pertrainer+spafee)*month	);
	}
	
	
	
}
 
class PremiumMembership extends details{
	
	
	String personalTrainer = "Yes";
	String spaAccess = "Yes";
	
	public void PremiumOffers() {
		if(total == 4000) {
			System.out.println("Premium Membership holders Get Personal Trainer and SPA Access");
		} else
			System.out.println("You dont have Premium membership, You dont get Special Offers");
	}
}


public class GymMembership {
	
	public static void main(String args[]) {
		PremiumMembership obj=new PremiumMembership();
		
		obj.display();
		obj.Menfee();
		obj.PremiumOffers();
		
		
	}
	
	

}

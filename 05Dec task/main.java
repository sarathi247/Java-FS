package Java_Test;



//constructor
class vehicle{
	String make;
	String model;
	int year;
	
	public vehicle(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
		
	}
	
	
	public void displaydeatails() {
		System.out.println("Make:"+make);
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
	}
	
}

	//sub class
	class car extends vehicle{
		int trunksize;
		public car(String make,String model,int year,int trunksize) {
			super(make,model,year);
			this.trunksize=trunksize;
		}
		
		public void displaydeatails() {
			super.displaydeatails();
			System.out.println("Trunk Size:"+trunksize+" liters");
		}
		
	}

	
	class truck extends vehicle{
		int payloadcapacity;
		public truck(String make,String model,int year,int payloadcapacity) {
			super(make,model,year);
			this.payloadcapacity=payloadcapacity;
		}
		
		public void displaydeatails() {
			super.displaydeatails();
			System.out.println("Payload Capacity:"+payloadcapacity+" kg");
		}
	}
	



public class main {
	
	public static void main(String[] args) {
		car obj=new car("Toyota","Corolla",2022,450);
		System.out.println("Car Details:");
		obj.displaydeatails();
		
		System.out.println("");
		
		truck obj2=new truck("Ford","F-150",2023,1000);
		System.out.println("Truck Details:");
		obj2.displaydeatails();

	}
	

}

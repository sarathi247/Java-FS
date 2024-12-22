package Dec20;

class Multiplication{
	
	
	
	synchronized void display(int num) {
		for(int i=1;i<=10;i++) {
			System.out.print(" "+num*i);
		}
		System.out.println("\nEnd of table.");
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}
		
	}
}

class A extends Thread{
	Multiplication th1;
	A(Multiplication t1){
		th1=t1;
	}
	public void run() {
		th1.display(2);
	}
}

class B extends Thread{
	Multiplication th2;
	B(Multiplication t2){
		th2=t2;
	}
	
	public void run() {
		th2.display(100);
	}
	
}



public class Synchronized_Example1 {

	public static void main(String[] args) {
		
		Multiplication mul=new Multiplication();
		A th1=new A(mul);
		B th2=new B(mul);
		th1.start();
		th2.start();
		
		
		
		
	}

}

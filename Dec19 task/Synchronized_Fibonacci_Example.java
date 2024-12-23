package Dec20;

class Fibonacci{
	
	public synchronized void display(int num) {
		int i=0;
		int j=1;
		System.out.print(i+" "+j+" ");
		int count=0;
		for(int k=1;k<=num;k++) {
			count=i+j;
			i=j;
			j=count;
			System.out.print(count+" ");
		}
		try {
			Thread.sleep(200);
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		System.out.println("\nEnd");
		
		
		
	}
}


class Example1 extends Thread{
	Fibonacci number;
	Example1(Fibonacci number){
		this.number=number;
	}
	
	public void run() {
		number.display(20);
	}
	
}

class Example2 extends Thread{
	Fibonacci number;
	Example2(Fibonacci number){
		this.number=number;
	}
	
	public void run() {
		number.display(20);
	}
	
}



public class Synchronized_Fibonacci_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci obj=new Fibonacci();
		Example1 th1=new Example1(obj);
		Example2 th2=new Example2(obj);
		
		th1.start();
		th2.start();
	}

}

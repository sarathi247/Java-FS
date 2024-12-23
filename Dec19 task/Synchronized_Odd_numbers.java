package Dec20;


class Odd{
	public synchronized void display(int start,int end) {
		System.out.println("Even number Start:"+start+":End to:"+end);
		
		for(int i=start;i<=end;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
			try{
				Thread.sleep(200);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		
		
		
	}
}


class thread3 extends Thread{
	Odd odd;
	thread3(Odd odd){
		this.odd=odd;
	}
	
	public void run() {
		odd.display(1, 20);
	}
	
}

class thread4 extends Thread{
	Odd odd;
	thread4(Odd odd){
		this.odd=odd;
	}
	
	public void run() {
		odd.display(20, 40);
	}
	
}

public class Synchronized_Odd_numbers {

	public static void main(String[] args) {
		
		Odd obj1=new Odd();
		thread3 th1=new thread3(obj1);
		thread4 th2=new thread4(obj1);
		
		th1.start();
		th2.start();

	}

}

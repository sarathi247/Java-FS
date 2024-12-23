package Dec20;

class Even{
	public synchronized void display(int start,int end) {
		System.out.println("Even number Start:"+start+":End to:"+end);
		
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
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


class thread1 extends Thread{
	Even even;
	thread1(Even even){
		this.even=even;
	}
	
	public void run() {
		even.display(1, 20);
	}
	
}

class thread2 extends Thread{
	Even even;
	thread2(Even even){
		this.even=even;
	}
	
	public void run() {
		even.display(20, 40);
	}
	
}




public class Synchronized_Even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Even obj=new Even();
		thread1 th1=new thread1(obj);
		thread2 th2=new thread2(obj);
		
		th1.start();
		th2.start();
	}

}

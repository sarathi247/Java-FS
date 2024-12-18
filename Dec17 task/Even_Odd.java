

class Even extends Thread{
	public void run(){
		int num=20;
		for(int i=1;i<=20;i++){
		 	if(i%2==0){
				System.out.println("Even numbers:"+i);
			}
		}
	}
}
class Odd extends Thread{
	public void run(){
		int num=20;
		for(int i=1;i<=20;i++){
		 	if(i%2==1){
				System.out.println("Odd numbers:"+i);
			}
		}
	}
}

public class Even_Odd{
	public static void main(String args[]){
		Even t1=new Even();
		Odd t2=new Odd();
		t1.start();
		t2.start();
	}
}
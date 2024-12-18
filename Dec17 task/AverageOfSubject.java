
 class Subject extends Thread{
	public void run(){
		int[] subject=new int[5];
		subject[0]=75;
		subject[1]=65;
		subject[2]=85;
		subject[3]=55;
		subject[4]=95;
		
		float sum=subject[0]+subject[1]+subject[2]+subject[3]+subject[4];
		float average=sum/subject.length;
		System.out.println("The average value:"+average);
	}
}


public class AverageOfSubject{
	public static void main(String args[]){
		Subject t1=new Subject();
		t1.start();
		
	}
}

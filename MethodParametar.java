package Allprograming;

public class MethodParametar {
	//one time some many name attribute.
	static void mymethod(int sum){
		System.out.println("Add num is:"+sum);
		
	}
	//it can be use with return value it is very difficult but you can try it.
	static int myname(int a) {
		return a;
	}
	
	public static void main(String args[]) {
		int a=10,b=12,sum;
		sum=a+b;
		
		mymethod(sum);
		
		
		
	}
	
	
}

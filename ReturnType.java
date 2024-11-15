package Allprograming;

public class ReturnType {
	
	public int Addition() {
		int a=10,b=30,sum;
		sum=a+b;
		return sum;
				
	}
	public int Sub() {
		int a,b,sum;
		a=19;
		b=29;
		sum=a-b;
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnType obj=new ReturnType();
		int result = obj.Addition();
		System.out.println("The addition value is:"+result);
		int subresult=obj.Sub();
		System.out.println("The subtration value is:"+subresult);
		
		
	}

}

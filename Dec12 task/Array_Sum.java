package Dec12;

public class Array_Sum {

	public static void main(String[] args) {
		int[] number=new int[] {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<number.length;i++) {
			sum+=number[i];
		}
		
		
		System.out.println("The sum of array value is:"+sum);
		

	}

}

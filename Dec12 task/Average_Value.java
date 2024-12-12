package Dec12;

public class Average_Value {

	public static void main(String[] args) {
		
		int[] number=new int[]{12,23,252,43};
		
		int sum=0;
		
		for(int i=0;i<number.length;i++) {
			sum+=number[i];
		}
		float average=sum/number.length;
		System.out.println("The average of value is:"+average);

	}

}

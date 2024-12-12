public class Reverse_order{
	public static void main(String args[]){
		int[] arr=new int[20];	
		for(int i=0;i<arr.length;i++){
			arr[i]=20-i;
		}


		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}
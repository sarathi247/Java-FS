package Dec12;

public class Copy_Array {

	public static void main(String[] args) {
		int[] OriginalArray= {20,34,32,34,32};
		int[] CopyArray=new int[OriginalArray.length];
		
		for(int i=0;i<OriginalArray.length;i++) {
			CopyArray[i]=OriginalArray[i];
		}
		System.out.println("Original Array:");
		for(int original:OriginalArray) {
			System.out.print(original+" ");
		}
		
		System.out.println("\nCopy Array:");
		for(int copy:CopyArray) {
			System.out.print(copy+" ");
		}
		
		
	}

}

import java.util.*;
public class Sum_Matrix{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t\t.....Weclome to matrix .......");
		System.out.println("Enter your row :");
		int row=input.nextInt();
		System.out.println("Enter your colume :");
		int colume=input.nextInt();
		int[][] a=new int[row][colume];
		int[][] a1=new int[row][colume];
		int[][] sum=new int[row][colume];
		
		for(int i=0;i< a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(i+" "+j+":");
				a[i][j]=input.nextInt();
							
			}
  		}
		for(int i=0;i< a1.length;i++){
			for(int j=0;j<a1[0].length;j++){
				System.out.print(i+" "+j+":");
				a1[i][j]=input.nextInt();
							
			}
  		}
		for(int i=0;i< a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
							
			}
			System.out.println();
  		}
		System.out.println();
		for(int i=0;i< a1.length;i++){
			for(int j=0;j<a1[0].length;j++){
				System.out.print(a1[i][j]+" ");
							
			}
			System.out.println();
  		}
		System.out.println();
		System.out.println("Sum of value is:");
		for(int i=0;i<sum.length;i++){
			for(int j=0;j<sum[0].length;j++){
				
				sum[i][j]=a[i][j]+a1[i][j];
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
		}

				
	}
}


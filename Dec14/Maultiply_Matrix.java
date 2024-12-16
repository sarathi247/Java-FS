import java.util.*;
public class Maultiply_Matrix{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t\t.....Weclome to matrix .......");
		System.out.println("Enter your row :");
		int row=input.nextInt();
		System.out.println("Enter your colume :");
		int colume=input.nextInt();
		int[][] a=new int[row][colume];
		int[][] a1=new int[row][colume];
		int[][] mul=new int[row][colume];
		
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

		for(int i=0;i<mul.length;i++){
			for(int j=0;j<mul[0].length;j++){
				for(int k=0;k<mul.length;k++){
					mul[i][j]= mul[i][j]+a[i][k]*a1[k][j];
				}	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Maultiply of value is:");
		for(int i=0;i<mul.length;i++){
			for(int j=0;j<mul[0].length;j++){
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}

				
	}
}


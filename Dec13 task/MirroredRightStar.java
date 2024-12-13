package Dec13;

public class MirroredRightStar {

	public static void main(String[] args) {
		int star=5;
		for(int i=1;i<=star;i++) {
			for(int j=star;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
				
			}
			
			System.out.println("");
		}
	}

}

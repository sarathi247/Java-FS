package Class21;

public class NumberShape {

	public static void main(String[] args) {
		int n=5;
		int j;
		int i;
		for(i=1;i<=n;i++) {
			int recount=(n+1)-i;
			for(j=1;j<=recount;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
	}

}

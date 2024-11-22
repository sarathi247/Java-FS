package Class21;

public class CharPattern {
	public static void main(String args[]) {
		int n=5;
		char charter='E';
		for(int i=0;i<n;i++) {
			charter='E';
			for(int j=0;j<n-i;j++) {
				System.out.print(charter);
				charter--;
				
			}System.out.println("");
		}
	}
}

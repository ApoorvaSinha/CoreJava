package Assignments;

public class Pattren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,j;
		for(int i=1;i<=n;i++) {
			for( j=1;j<=n;j++) {
				if(j <= i)
					System.out.printf("*");
				else
					System.out.printf("-");
			}
			for(j=n;j>=1;j--) {
				if(j <= i)
					System.out.printf("*");
				else
					System.out.printf("-");
			}
			System.out.println("");
		}
	}

}

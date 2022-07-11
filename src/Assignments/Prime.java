package Assignments;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13,flag = 0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
			
		}
		if(flag==0) 
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}

}

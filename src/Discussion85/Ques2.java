package Discussion85;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("ENTER A NUMBER");
	        int n=sc.nextInt();
	        int sum=0;
	        for(int i=1;i<=n;i++)
	        {
	            sum=sum+i;
	        }
	        System.out.println("sum of first "+n+" natural number is "+sum);
	}

}

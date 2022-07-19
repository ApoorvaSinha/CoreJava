package Discussion85;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int num=sc.nextInt();
		System.out.println("ENTER THE RANGE:");
            int n=sc.nextInt();
		   for(int i=1;i<=n;i++)

		{
			int tables=i*num;
		    System.out.println(i+"*"+n+"="+tables);
		    
		}
		
	}

}

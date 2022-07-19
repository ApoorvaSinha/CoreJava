package Discussion85;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int fact = 1,n;
         Scanner sc=new Scanner(System.in);
         System.out.println("ENTER THE NUMBER:");
         n=sc.nextInt();
         
     if(n==0)
     {
         System.out.println("factorial of 0 is 1");
     }
   for(int i=1;i<=n;i++)
 {
     fact=fact*i;
         }
 System.out.println("factorial of"+" "+n+" "+"is"+" "+fact );
	}

}

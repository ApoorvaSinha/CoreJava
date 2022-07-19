package Discussion85;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUM-1:");
		int base=sc.nextInt();
		System.out.println("ENTER THE NUM-2:");
		int exponent=sc.nextInt();
        long result = 1;
                for(int i=1;i<=exponent;i++)
         {
          result = result * base;
        }
    
        System.out.println("Answer = " + result);
	}

}

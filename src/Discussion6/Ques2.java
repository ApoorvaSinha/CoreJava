package Discussion6;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		    System.out.println("Enter two numbers: ");
		    int a = scn.nextInt();
		    int b = scn.nextInt();

		    System.out.println("HCF is: " + gcd(a, b));

	}
	public static int gcd(int x, int y) {
	    if (y == 0)
	        return x;
	    return gcd(y, x % y);
	}


}

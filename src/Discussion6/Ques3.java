package Discussion6;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		    System.out.println("Enter two numbers: ");
		    int a = scn.nextInt();
		    int b = scn.nextInt();

		    System.out.println("LCM is: " + lcm(a, b));


	}
	
	public static int gcd(int x, int y) {
	    if (y == 0)
	        return x;
	    return gcd(y, x % y);
	}

	public static int lcm(int x, int y) {
	    int hcf = gcd(x, y);
	    return (x * y) / hcf;
	}


}

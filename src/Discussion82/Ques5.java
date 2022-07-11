package Discussion82;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		double number = sc.nextDouble();
		if (number > 0) {
			System.out.println("The number entered by user is:  " + number);
		} else {
			System.out.println("The number entered by user is: " + Math.abs(number));
		}
		sc.close();
	}

}

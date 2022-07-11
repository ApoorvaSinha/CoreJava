package Discussion6;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Cal !");
		int num1,num2,res;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Num 1: ");
		num1=sc.nextInt();
		System.out.println("Enter Num 2: ");
		num1=sc.nextInt();
		
		System.out.println("Enter your choice[1-5] :");
		do {
			System.out.println("1. Addition\n 2. Subtraction\n 3. Multiplication\n 4.Division");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				res=num1+num2;
				System.out.println("Addition of "+ num1+" and "+num2+" : "+res);
				break;
			}
			resChoice
		}while()
	}

}

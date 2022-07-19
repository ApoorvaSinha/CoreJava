package Assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Cal !");
		int num1,num2,res,choice;
		String continueChoice;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Num 1: ");
		num1=sc.nextInt();
		System.out.println("Enter Num 2: ");
		num2=sc.nextInt();
		
		System.out.println("Enter your choice[1-5] :");
		loop:do {
			System.out.println(" 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4.Division\n 5.Quit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				res=num1+num2;
				System.out.println("Addition of "+ num1+" and "+num2+" : "+res);
				break;
			case 2:
				res=num1-num2;
				System.out.println("Subtraction of "+ num1+" and "+num2+" : "+res);
				break;
			case 3:
				res=num1*num2;
				System.out.println("Multiplication of "+ num1+" and "+num2+" : "+res);
				break;
			case 4:
				res=num1/num2;
				System.out.println("Division of "+ num1+" and "+num2+" : "+res);
				break;
			case 5:
                break loop;
			default:
                System.out.println("Invalid input. Please try again...");
                break;
			}
			 System.out.print("Do you want to continue? [Y/N]: ");
	             continueChoice = sc.next();
			
		}while(continueChoice.equalsIgnoreCase("Y"));
		System.out.println("Thank you for choosing Cal.");
        sc.close();
	}

}

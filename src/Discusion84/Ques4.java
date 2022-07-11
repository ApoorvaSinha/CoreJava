package Discusion84;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int n;
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        n=Integer.parseInt(sc.nextLine());
	        int res=n%2;  
	        switch(res)
	        {
	            case 0:
	                System.out.println(n + " is even number!");
	                break;
	            case 1:
	                System.out.println(n + " is odd number!");
	                break;
	            default:
	                System.out.println("Invalid Input");
	                break;
	        }
	        sc.close();
	}

}

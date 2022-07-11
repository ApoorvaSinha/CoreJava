package Discussion82;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the salary for employee: ");
	    double salary = sc.nextDouble();
	    System.out.print("Enter the year of serive(in years) for employee: ");
	    double yearOfSerive = sc.nextDouble();;
	    double bonus=0.05;
	    if(yearOfSerive>5){
	      salary+=salary*bonus;
	    }
	    System.out.println("The Net Salary is: "+salary);
	    sc.close();
	}

}

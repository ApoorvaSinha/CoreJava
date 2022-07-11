package Discusion84;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter physics marks:");
		int phy=Integer.parseInt(sc.nextLine());
		System.out.println("Enter chemistry marks:");
		int chem=Integer.parseInt(sc.nextLine());
		System.out.println("Enter biology marks:");
		int bio=Integer.parseInt(sc.nextLine());
		System.out.println("Enter maths marks:");
		int math=Integer.parseInt(sc.nextLine());
		System.out.println("Enter computer science marks:");
		int cs=Integer.parseInt(sc.nextLine());
		float per=(phy+chem+bio+math+cs)/5;
		int per1=(int)per/10;
		String result="";
		switch(per1) {
		case 9,1:
			result="Grade A";
			break;
		case 8:
			result="Grade B";
			break;
		case 7:
			result="Grade C";
			break;
		case 6,5:
			result="Grade D";
			break;
		case 4:
			result="Grade E";
			break;
		case 3,2:
			result="Grade F";
			break;
		}
		System.out.println("Result for per: "+ per+" is "+ result);
		sc.close();
	}

}

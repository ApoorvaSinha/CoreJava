package Discussion82;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of classes held: ");
	    int classHeld=Integer.parseInt(sc.nextLine());
	    System.out.println("Enter the number of classes attended: ");
	    int classAttended=Integer.parseInt(sc.nextLine());
	    int classPercentage=(classAttended*100)/classHeld;
	    int StandardAttendance=75;
	    if(classPercentage>StandardAttendance){
	      System.out.println("The Student is allowed to sit in exam.");
	    }
	    else{
	      System.out.println("The Student is not allowed to sit in the exam.");
	    }
	    sc.close();
	}

}

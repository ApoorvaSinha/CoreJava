package Discussion82;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of classes held: ");
	    int classHeld=Integer.parseInt(sc.nextLine());
	    System.out.println("Enter the number of classes attended: ");
	    int classAttended=Integer.parseInt(sc.nextLine());
	    System.out.println("Enter if you have a Medical Cause(Y or N): ");
	    char medicalCause=sc.next().charAt(0);
	    int classPercentage=(classAttended*100)/classHeld;
	    int StandardAttendance=75;
	    if(classPercentage>StandardAttendance && medicalCause=='Y'|| medicalCause=='y'){
	      System.out.println("The Student is allowed to sit in exam.");
	    }
	    else{
	      System.out.println("The Student is not allowed to sit in the exam.");
	    }
	    sc.close();
	}

}

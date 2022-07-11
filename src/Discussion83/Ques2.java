package Discussion83;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Mark:");
        int mark=sc.nextInt();
        char grade = '\0';
        if(mark<25){
            grade='F'; 
        }
        if(mark>=25 && mark<45){
            grade='E'; 
        }
        if(mark>=45 && mark<50){
            grade='D';
        }
        if(mark>=50 && mark<60){
            grade='C';
        }
        if(mark>=60 && mark<80){
            grade='B';
        }
        if(mark>=80){
            grade='A';
        }
        System.out.println("Grade: " + grade);
        sc.close();
	}

}

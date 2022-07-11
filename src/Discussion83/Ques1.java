package Discussion83;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Mark:");
        int mark=sc.nextInt();
        char grade;
        if(mark<25){
            grade='F'; 
        }
        else if(mark>=25 && mark<45){
            grade='E'; 
        }
        else if(mark>=45 && mark<50){
            grade='D';
        }
        else if(mark>=50 && mark<60){
            grade='C';
        }
        else if(mark>=60 && mark<80){
            grade='B';
        }
        else{
            grade='A';
        }
        System.out.println("Grade: " +grade);
        sc.close();
	}

}

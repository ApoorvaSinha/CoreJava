package Discussion82;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a character:");
	      char character=sc.next().charAt(0);
	      if(character>=65 && character<=90){
	        System.out.println("The character is in UpperCase");
	      }
	      if(character>=97 && character<=122){
	        System.out.println("The character is in LowerCase");
	      }
	      sc.close();
	}

}

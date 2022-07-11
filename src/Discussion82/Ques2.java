package Discussion82;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    System.out.println("A: ");
		    int a=Integer.parseInt(sc.next());
		    System.out.println("B: ");
		    int b=Integer.parseInt(sc.next());
		    if (a>b) {
		      System.out.println("A is Greater than B");
		    }
		     else{
		      System.out.println("B is Greater than A");
		    }
		    sc.close();
	}

}

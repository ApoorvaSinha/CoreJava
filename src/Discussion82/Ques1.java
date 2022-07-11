package Discussion82;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Length: ");
	    int length=Integer.parseInt(sc.next());
	    System.out.println("Breadth: ");
	    int breadth=Integer.parseInt(sc.next());
	    if (length==breadth) {
	      System.out.println("The Rectangle is square");
	    }
	    else{
	      System.out.println("It is Rectangle");
	    }
	    sc.close();
	}

}

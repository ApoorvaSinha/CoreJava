package Discussion79;
import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
        int rollNo;
        String field_of_interest;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :");
        name = sc.nextLine();
        System.out.println("Enter roll no. :");
        rollNo = Integer.parseInt(sc.nextLine());
        System.out.println("Enter roll no. :");
        System.out.println("Enter field of interest :");
        field_of_interest = sc.nextLine();
        System.out.println("Hey, my name is " + name + "and my roll number is " + rollNo + ". My field of interest are "
                + field_of_interest);
        sc.close();
	}

}

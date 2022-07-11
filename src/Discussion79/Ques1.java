package Discussion79;
import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x, y;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Num1 :");
	        x = Integer.parseInt(sc.nextLine());
	        System.out.println("Enter Num2 :");
	        y = Integer.parseInt(sc.nextLine());
	        int res = x + y;
	        System.out.println("Sum :" + res);
	        int prod = x * y;
	        System.out.println("Product :" + prod);

	        sc.close();
	}

}

package Discussion79;
import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :");
        x = Double.parseDouble(sc.nextLine());
        System.out.println("Enter breadth :");
        y = Double.parseDouble(sc.nextLine());
        double area = x * y;
        System.out.println("Area :" + area);
        sc.close();
	}

}

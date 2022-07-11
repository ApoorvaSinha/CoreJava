package Discussion79;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area,side,pmtr;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of the square ");
        side=Double.parseDouble(sc.nextLine());
        pmtr=4*side;
        area=side*side;
        System.out.println(String.format("The area of the square is %f \nThe perimeter of the square is %f",area,pmtr));
        sc.close();
	}

}

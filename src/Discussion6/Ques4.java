package Discussion6;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int count = 0;
		while (sc.next().charAt(0) != 'q') {
		count++;
		}
		System.out.println(count);
		sc.close();

	}

}

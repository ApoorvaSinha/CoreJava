package Discusion84;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char alpha = sc.nextLine().charAt(0);
        int alpha1=(int)alpha;
        
        switch ((alpha1-65)/10) {
            case 0,1,2:
                System.out.println("Uppercase");
                break;
            case 3,4,5:
                System.out.println("Lowercase");
                break;
            default:
                System.out.println("invalid ! Please try again");
                break;
        }
        sc.close();
	}

}

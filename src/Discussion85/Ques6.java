package Discussion85;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter height and width values");
	        int h = Integer.parseInt(sc.nextLine());
	        int w = Integer.parseInt(sc.nextLine());
	        int i, j;
	        for(i=0;i<h;i++)
	        {
	            for(j=0;j<w;j++)
	            {
	                System.out.print("# ");
	                           }

	            System.out.println();
	            
	        }
	        sc.close();

	}

}

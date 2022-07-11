package Discussion82;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the quantity: ");
	    double quantity=sc.nextDouble(); 
	    double cost=quantity*100;
	    if(cost>1000){
	      cost-=cost*0.1;
	    }
	    System.out.println("total cost for user: "+cost);
	}

}

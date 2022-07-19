package Discussion85;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the string :");
	        String a=sc.next();
	        int count=0,i;
	        char temp;
	       for(i=0; i<a.length();i++) 
	        {
	            temp=a.charAt(i);

	            if(temp=='a')
	            {
	                count++;
	            }
	      
	        }
	        System.out.println("No of times a found is "+count);
	}

}

package Discussion85;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        final  int password=1810;
        
              for(int i=0;i<3;i++)

{
    System.out.println("Enter password :");
        int passcode=sc.nextInt();
    if(passcode==password)
    {
        System.out.println("Correct !! Welcome Back!");
        break;
    }
    else{
        System.out.println("Password incorrect!!");
    }
   
    if(i==3)
    System.out.println("Sorry!! you have been locked out!!!");
    
}    
	}

}

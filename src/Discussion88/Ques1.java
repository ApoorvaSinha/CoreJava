package Discussion88;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=Integer.parseInt(sc.nextLine());
        if(n>0)
        {
            for(int i=0;i<=n;i++) 
            {
                int val=1;
                for(int j=1;j<=4;j++)
                {    
                    if(i==0)
                    {
                        if(j==1)
                        {
                            System.out.print("n\t");
                        }
                        else
                        {
                            System.out.print("n^"+j);
                            System.out.print("\t");
                        }
                    }
                    else
                    {
                        val=val*i;
                    }
                    if(i>0)
                        System.out.print(String.format("%d\t",val));
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Enter value greater than 0");
        }
        sc.close();
	}

}

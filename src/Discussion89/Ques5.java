package Discussion89;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array : ");
		int size=sc.nextInt();
		System.out.println("Enter elements :");
		//System.out.println(arr.length);
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum = 0,prod=1;
		for(int ele:arr) {
			sum=sum+ele;
			prod=prod*ele;
		}
		System.out.println("Sum :" + sum +"\nProduct: "+ prod);
	}

}

		
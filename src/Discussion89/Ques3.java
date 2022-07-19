package Discussion89;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements :");
		//System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		 int positive = 0;
	        int negative = 0;
	        int zero = 0;
	        int odd = 0;
	        int even = 0;
	        for (int i = 0; i < 6; i++) {
	            if (arr[i] > 0) {
	                positive++;
	            }
	            if (arr[i] < 0) {
	                negative++;
	            }
	            if (arr[i] % 2 == 0) {
	                even++;
	            } else {
	                odd++;
	            }
	            if (arr[i] == 0) {
	                zero++;
	            }
	        }
	        System.out.println("positive num: " + positive);
	        System.out.println("negative num: " + negative);
	        System.out.println("odd num: " + odd);
	        System.out.println("even num: " + even);
	        System.out.println("zero num: " + zero);
	        sc.close();
	}

}

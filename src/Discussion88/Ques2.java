package Discussion88;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfResult = 0;
        int result = 0;
        for (int iterate = 1; iterate <= 10; iterate++) {
            sumOfResult += iterate;
            System.out.print(sumOfResult + "\t");
        }
        for (int iterate = 1; iterate < 100; iterate++) {
            result += iterate;
            if (result >= 100) {
                break;
            }
        }
        System.out.println("\nresult is : " + result);
	}

}

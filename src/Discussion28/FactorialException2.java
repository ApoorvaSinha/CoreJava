package Discussion28;

import java.util.Scanner;

class MyIllegalArgumentException extends Exception{
	
private String msg;
	MyIllegalArgumentException(){
		
	}
	MyIllegalArgumentException(String msg){
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "MyIllegalArgumentException [msg=" + msg + "]";
	}
	
}

public class FactorialException2 {

    public static int factorial(int n) throws MyIllegalArgumentException {
        if (n < 0) {
            throw new MyIllegalArgumentException("Argument passed should not be less than 0");
        }
        if (n > 16) {
            throw new MyIllegalArgumentException("Argument passed should not be greater than 16");
        }
        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }

    public static void main(String[] args) throws MyIllegalArgumentException{
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(factorial(sc.nextInt()));
        } catch (MyIllegalArgumentException e) {
            System.out.println(e);
        }
    }
}


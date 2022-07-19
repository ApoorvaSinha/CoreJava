package Discussion28;

import java.util.Scanner;

public class FactorialException {

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Argument passed should not be less than 0");
        }
        if (n > 16) {
            throw new IllegalArgumentException("Argument passed should not be greater than 16");
        }
        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }

    public static void main(String[] args) throws IllegalArgumentException{
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println(factorial(sc.nextInt()));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}


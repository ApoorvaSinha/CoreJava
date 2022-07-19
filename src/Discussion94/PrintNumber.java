package Discussion94;

public class PrintNumber {

	void printn(int num) {
		System.out.println("Integer Num: " + num);
	}

	void printn(float num) {
		System.out.println("Float Num: " + num);
	}

	void printn(double num) {
		System.out.println("Float Num: " + num);
	}

	void seq(int n, char c) {
		System.out.println("Integer : " + n + " char: " + c);

	}

	void seq(char c, int n) {
		System.out.println("char : " + c + " Integer: " + n);

	}

	void area(double side) {
		System.out.println("Area of square: " + side * side);

	}

	void area(double length, double breadth) {
		System.out.println("Area of rectangle: " + length * breadth);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber p1 = new PrintNumber();
		p1.printn(32);
		p1.printn(-32);
		p1.printn(23.78);
		p1.printn(5436.2319812712);
		p1.seq(23, 'g');
		p1.seq('a', 45);
		p1.area(6.12);
		p1.area(7.23, 9.16);
	}

}

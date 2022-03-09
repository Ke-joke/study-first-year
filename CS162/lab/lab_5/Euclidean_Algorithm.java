package CS162.lab.lab_5;

import java.util.Scanner;

public class Euclidean_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The greatest common divisor of "+x+" and "+y+" is "+GCD(x, y));
		sc.close();
	}

	public static int GCD(int x, int y) {
		if (x == 0)
			return y;
		if (y == 0)
			return x;
		if (x>y) {
			return GCD(y,x%y);
		}
		return GCD(x,y%x);
	}
}

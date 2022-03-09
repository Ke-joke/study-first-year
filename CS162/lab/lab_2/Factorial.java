package CS162.lab.lab_2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		int n = num.nextInt(), m = num.nextInt();
		getFactorial(n, m);
		num.close();
	}

	public static void getFactorial(int n, int m) {
		int x = 1;
		if (n == 0&&n <= m) {
			System.out.println(1);n++;
		}
		if (n >= 0&&n <= m) {
			for(int i = 1;i <= m;i++) {
				x *= i;
				if (i >= n) {
					System.out.println(x);
				}
			}
		}else {
			System.out.println("Not Valid!");
		}
	}
}

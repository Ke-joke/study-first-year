package CS162.lab.lab_1;

import java.util.Scanner;

public class DoubleSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble();
		determineSize(a, b);
		sc.close();
	}

	public static void determineSize(double a, double b) {
		if (a > b) {
			System.out.println(a+" is the biggest number, "+b+" is the smallest number.");
		}else if (a < b) {
			System.out.println(b+" is the biggest number, "+a+" is the smallest number.");
		}else {
			System.out.println("They contain the same value.");
		}
	}
}

package CS162.lab.lab_2;

import java.util.Scanner;

public class MethodsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = fillArray();
		int b = sumArray(a);
		System.out.println("Sum = "+b);
		double c = avgArray(a);
		System.out.println("Average = "+c);
		printArray(a);
	}
	
	public static int[] fillArray() {
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int[] a = new int[n];
		for (int i = 0;i < a.length;i++) {
			a[i] = num.nextInt();
		}
		num.close();
		return a;
	}
	
	public static int sumArray(int[] a) {
		int b = 0;
		for (int i = 0;i < a.length;i++) {
			b += a[i];
		}
		return b;
	}
	
	public static double avgArray(int[] a) {
		double c = 0.0;
		for (int i = 0;i < a.length;i++) {
			c += a[i];
		}
		c /= a.length;
		return c;
	}
	
	public static void printArray(int[] a) {
		for (int i = 0;i < a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

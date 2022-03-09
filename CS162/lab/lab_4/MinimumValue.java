package CS162.lab.lab_4;

import java.util.Scanner;

public class MinimumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input some numbers:");
		Scanner value = new Scanner(System.in);
		int n = value.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = value.nextInt();
		}
		value.close();
		int i = 0;
		int minI = q1Iterative(a);
		System.out.println(minI);
		int minR = q1Recursive(a, i);
		System.out.println(minR);
	}

	public static int q1Iterative(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i = 0;i < a.length;i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static int q1Recursive(int[] a, int start) {
		if(start == a.length-1) {
			return a[start];
		}
			return Math.min(a[start], q1Recursive(a ,start+1));
	}

}

package CS162.lab.lab_2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean justy = findElement();
		if (justy == true) {
			System.out.println(" was found in the array.");
		}else {
			System.out.println(" was NOT found in the array.");
		}
	}

	public static boolean findElement() {
		Scanner num = new Scanner(System.in);
		int n = (int)num.nextDouble();
		double[] array = new double[n];
		for(int i = 0;i < array.length;i++) {
			array[i] = num.nextDouble();
		}
		double x = num.nextDouble();
		System.out.print(x);
		num.close();
		for(int i = 0;i < array.length;i++) {
			if (x == array[i]) {
				return true;
			}
		}
		return false;
	}
}

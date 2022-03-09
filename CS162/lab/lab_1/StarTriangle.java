package CS162.lab.lab_1;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		printStarTriangle(row);
		sc.close();
	}

	public static int printStarTriangle(int row) {
		for (int i = 1;i <= row;i++) {
			for (int j = 1;j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		return 0;
	}
}

package CS162.lab.lab_1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean judge = isEven(num);
		sc.close();
		if (judge == true) {
			System.out.println("Even");
		}else if (judge == false && num > 0) {
			System.out.println("Odd");
		}else {
			System.out.println("Not a valid entry!");
		}
	}

	public static boolean isEven(int num) {
		if (num > 0) {
			boolean judge = true;
			if (num%2 == 0) {
				judge = true;
			}else if (num%2 != 0) {
				judge = false;
			}
			return judge;
		}else {
			return false;
		}
	}
}

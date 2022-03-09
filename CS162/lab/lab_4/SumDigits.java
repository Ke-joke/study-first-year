package CS162.lab.lab_4;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		sc.close();
		int sum = recursiveSum(digit);
		System.out.println("Sum is: "+sum);
	}
	
	public static int recursiveSum(int digit) {
		if (digit == 0) {
			return digit;
		}
		return digit%10+recursiveSum(digit/10);
	}
}

package CS162.lab.lab_4;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input some words:");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		s.close();
		String reverse = reverseRecursive(s1);
		System.out.println(reverse);
	}

	public static String reverseRecursive(String s) {
		int l = s.length();
		if (l <= 1) {
			return s;
		}
		String left = s.substring(0, 1);
		String right = s.substring(1);
		return reverseRecursive(right)+reverseRecursive(left);
	}
}

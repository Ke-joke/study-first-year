package CS162.lab.lab_3;

import java.util.Scanner;

public class ValidAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String age = new String("");
		boolean check = false;
		while (check == false) {
			System.out.println("Please inpit a valid age:");
			age = sc.nextLine();
			check = checkAge(age);
		}
		sc.close();
	}

	public static boolean checkAge(String age) {
		String p1 = "[0-9]||[1,9][0,9]||[1][0-4][0-9]||[1][5][0]";
		if (age.matches(p1)) {
			System.out.println("Age is valid");
			return true;
		} else {
			System.out.println("Age is NOT valid");
			return false;
		}
	}
}

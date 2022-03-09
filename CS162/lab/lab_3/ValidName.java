package CS162.lab.lab_3;

import java.util.Scanner;

public class ValidName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = new String("");
		boolean check = true;
		while (check) {
			System.out.println("Please input valid name:");
			name = sc.nextLine();
			check = checkName(name);
		}
		sc.close();
	}

	public static boolean checkName(String name) {
		String p = "[A-Z][a-z]{1,24}";
		if (name.matches(p)) {
			System.out.println("Name is valid");
			return false;
		}
		System.out.println("Name is NOT valid");
		return true;
	}
}

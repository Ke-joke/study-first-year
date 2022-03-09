package CS162.lab.lab_3;

import java.util.Scanner;

public class FlightCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String code = new String("");
		boolean check = true;
		while (check) {
			System.out.println("Please input valid code:");
			code = sc.nextLine();
			check = checkCode(code);
		}
		sc.close();
	}

	public static boolean checkCode(String code) {
		String p = "[A-Z]{2,3}[0-9]{3,4}";
		if (code.matches(p)) {
			System.out.println("Flight code is valid");
			return false;
		}
		System.out.println("Flight code is NOT valid");
		return true;
	}
}

package CS162.lab.lab_3;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringAcceptance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = new String("[0-1]*");
		String binary = new String("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		binary = sc.nextLine();
		checkStr(pattern, binary);
		sc.close();
	}

	public static void checkStr(String pattern, String binary) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(binary);
		System.out.println(m.matches());
	}
}

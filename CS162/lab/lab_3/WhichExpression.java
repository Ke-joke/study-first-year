package CS162.lab.lab_3;

import java.util.Scanner;

public class WhichExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = new String("");
		s = sc.nextLine();
		checkStr(s);
		sc.close();
	}

	public static void checkStr(String s) {
		String s1 = "a(b|a)b",s2 = "(ab)*b",s3 = "a(b|a)*",s4 = "((a|b)a)*";
		if (s.matches(s1)) {
			System.out.println("1");
		}
		if (s.matches(s2)) {
			System.out.println("2");
		}
		if (s.matches(s3)) {
			System.out.println("3");
		}
		if (s.matches(s4)) {
			System.out.println("4");
		}
		if(s.matches(s1) != true&&s.matches(s2) != true&&s.matches(s3) != true&&s.matches(s4) != true) {
			System.out.println("Not in the language");
		}
	}
}

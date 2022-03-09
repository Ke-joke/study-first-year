package CS162.lab.lab_5;

import java.util.Scanner;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String text = "";
		for (int i = 1; i <= n; i++) {
			text = text + sc.next() + " ";
		}
		text = text.toLowerCase();
		int x = sc.nextInt();
		int x1 = sc.nextInt();
		char c = (sc.next()).charAt(0);
		char c1 = (sc.next()).charAt(0);
		System.out.println(manipulation(text));
		System.out.println(manipulation(text, c));
		System.out.println(manipulation(text, x));
		System.out.println(manipulation(text, x, x1));
		System.out.println(manipulation(text, c, c1));
		System.out.println(manipulation(text, c, x));
		sc.close();
	}

	public static String manipulation(String text) {
		text = text.replaceAll(" ", "");
		return text;
	}

	public static String manipulation(String text, char c) {
		text = text.replaceAll((c+""), "");
		return text;
	}

	public static String manipulation(String text, int x) {
		String s1 = text.charAt(x)+"";
		text = text.replaceAll(s1,"");
		return text;
	}

	public static String manipulation(String text, int x, int x1) {
		text = text.substring(0, x+1)+text.substring(x1);
		return text;
	}

	public static String manipulation(String text, char c, char c1) {
		int n = text.indexOf(c);
		int n1 = text.indexOf(c1);
		text = text.substring(0, n+1)+text.substring(n1);
		return text;
	}

	public static String manipulation(String text, char c, int x) {
		while(x>=1) {
			int n = text.indexOf(c);
			text = text.substring(n);
			x--;
		}
		return text;
		
	}
}

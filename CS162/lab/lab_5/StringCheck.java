package CS162.lab.lab_5;

import java.util.Scanner;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n = sc.nextInt();
		System.out.println(checkForSub(s1,s2,n));
		sc.close();
	}

	public static boolean checkForSub(String x,String m,int n) {
		if (n == 0) {
			return true;
		}
		if(x.length()>= m.length()) {
			if ((x.substring(0, m.length())).equals(m)) {
				n--;
			}
		}else {
			return false;
		}
		return checkForSub(x.substring(m.length()), m, n);
	}
}
